package com.xushuai.rikao.bean;

import java.util.List;

/**
 * date:2017/7/26
 * author:徐帅(acer)
 * funcation:实体类
 */

public class NewsBean {

    /**
     * date : 20170726
     * stories : [{"title":"海豹这么可爱，你们居然给它烙印子","ga_prefix":"072608","images":["https://pic4.zhimg.com/v2-d41451dc4bab66df598f57e2de1de7bb.jpg"],"multipic":true,"type":0,"id":9542055},{"images":["https://pic2.zhimg.com/v2-d48ebff94eee34b71c703e6973fb3611.jpg"],"type":0,"id":9542047,"ga_prefix":"072607","title":"如果当年高考没有差 5 分告别名校，人生会是什么样？"},{"images":["https://pic1.zhimg.com/v2-48be4152037d6bcc0fcb1e599b4c1ad8.jpg"],"type":0,"id":9539605,"ga_prefix":"072607","title":"兄弟，还记得当年网吧开黑玩 CS 时用的套路吗？"},{"title":"迟早有一天，我们都得跳广场舞","ga_prefix":"072607","images":["https://pic2.zhimg.com/v2-e29fdbfbf5942315821ec79cc703c175.jpg"],"multipic":true,"type":0,"id":9541339},{"images":["https://pic3.zhimg.com/v2-cca3210be2d4089405daadfd9e2284de.jpg"],"type":0,"id":9539041,"ga_prefix":"072606","title":"瞎扯 · 如何正确地吐槽"},{"images":["https://pic1.zhimg.com/v2-65074c5255d737a88e6687a87208cb40.jpg"],"type":0,"id":9538982,"ga_prefix":"072606","title":"这里是广告 · 为什么你给女朋友拍的照片她从不发朋友圈？"}]
     * top_stories : [{"image":"https://pic1.zhimg.com/v2-3ee6b8c007aa86840f8b11b8f0906aa8.jpg","type":0,"id":9539605,"ga_prefix":"072607","title":"兄弟，还记得当年网吧开黑玩 CS 时用的套路吗？"},{"image":"https://pic2.zhimg.com/v2-0b423fcc2b719596be098158da0124c5.jpg","type":0,"id":9541339,"ga_prefix":"072607","title":"迟早有一天，我们都得跳广场舞"},{"image":"https://pic3.zhimg.com/v2-ca7b55879283d342e4a21289ddbed9aa.jpg","type":0,"id":9540869,"ga_prefix":"072517","title":"我们家猫咪死了，罪魁祸首竟然是我点的蚊香"},{"image":"https://pic2.zhimg.com/v2-cd225e3eecffc76ccf35c5a46e1a24e9.jpg","type":0,"id":9537912,"ga_prefix":"072513","title":"「老板，早上迟到真的不是我的错，我\u2026\u2026是夜型人」"},{"image":"https://pic4.zhimg.com/v2-01d1919be61d42c9ff2e4b82e6e55f1b.jpg","type":0,"id":9540230,"ga_prefix":"072507","title":"日本新推出的「减肥可乐」，喝了真能减肥吗？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * title : 海豹这么可爱，你们居然给它烙印子
         * ga_prefix : 072608
         * images : ["https://pic4.zhimg.com/v2-d41451dc4bab66df598f57e2de1de7bb.jpg"]
         * multipic : true
         * type : 0
         * id : 9542055
         */

        private String title;
        private String ga_prefix;
        private boolean multipic;
        private int type;
        private int id;
        private List<String> images;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic1.zhimg.com/v2-3ee6b8c007aa86840f8b11b8f0906aa8.jpg
         * type : 0
         * id : 9539605
         * ga_prefix : 072607
         * title : 兄弟，还记得当年网吧开黑玩 CS 时用的套路吗？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}