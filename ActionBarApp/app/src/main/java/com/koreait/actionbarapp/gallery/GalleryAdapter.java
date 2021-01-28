package com.koreait.actionbarapp.gallery;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class GalleryAdapter extends BaseAdapter {
    //리소스에 있는 자원 이용X ---> 네트웤 http요청---> 웹서버(Node.js)구축
    //기술학습 순서: 안드로이드보다 앞서 순수 자바로 URL 이미지 가져오기 할 줄 알아야함.
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
