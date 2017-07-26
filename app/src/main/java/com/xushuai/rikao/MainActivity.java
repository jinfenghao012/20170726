package com.xushuai.rikao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.xushuai.rikao.adapter.MainAdapter;
import com.xushuai.rikao.bean.NewsBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    private String url = "http://news-at.zhihu.com/api/4/news/latest";
    private List<NewsBean.TopStoriesBean> list;
    private MainAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        initData();

        getHttp();
    }

    private void getHttp() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Call call = okHttpClient.newCall(new Request.Builder().url(url).build());
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Gson gson = new Gson();
                NewsBean newsBean = gson.fromJson(response.body().string(), NewsBean.class);
                list.addAll(newsBean.getTop_stories());
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        });
    }

    private void initData() {
        list = new ArrayList<>();
        adapter = new MainAdapter(this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);
        adapter.setRecyclerViewListener(new RecyclerViewListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this, list.get(position).getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }
}