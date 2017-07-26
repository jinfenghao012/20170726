package com.xushuai.rikao.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.xushuai.rikao.R;
import com.xushuai.rikao.RecyclerViewListener;
import com.xushuai.rikao.bean.NewsBean;

import java.util.List;

/**
 * date:2017/7/26
 * author:徐帅(acer)
 * funcation:RecyclerView的适配器
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.CViewHolder> {

    private List<NewsBean.TopStoriesBean> list;
    private Context context;
    private View view;

    private RecyclerViewListener recyclerViewListener;

    public void setRecyclerViewListener(RecyclerViewListener recyclerViewListener) {
        this.recyclerViewListener = recyclerViewListener;
    }

    public MainAdapter(Context context, List<NewsBean.TopStoriesBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public CViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = View.inflate(context, R.layout.main_item, null);
        CViewHolder holder = new CViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CViewHolder holder, final int position) {
        Glide.with(context).load(list.get(position).getImage()).into(holder.newsImage);
        holder.newsTitle.setText(list.get(position).getTitle());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewListener.onItemClick(v, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CViewHolder extends RecyclerView.ViewHolder {

        private ImageView newsImage;
        private TextView newsTitle;

        public CViewHolder(View itemView) {
            super(itemView);
            newsImage = (ImageView) itemView.findViewById(R.id.news_image);
            newsTitle = (TextView) itemView.findViewById(R.id.news_title);
        }
    }
}