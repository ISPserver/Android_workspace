package com.koreait.actionbarapp.gallery;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.icu.text.LocaleDisplayNames;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.koreait.actionbarapp.MainActivity;
import com.koreait.actionbarapp.R;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GalleryAdapter extends BaseAdapter {
    String TAG = this.getClass().getName();
    MainActivity mainActivity;
    List<Gallery> galleryList = new ArrayList<Gallery>();
    LayoutInflater layoutInflater;

    public GalleryAdapter(MainActivity mainActivity){
        this.mainActivity = mainActivity;
        layoutInflater=mainActivity.getLayoutInflater();//엑테비티 통해 인플레이터 얻기
    }

    //리소스에 있는 자원 이용X ---> 네트웤 http요청---> 웹서버(Node.js)구축
    //기술학습 순서: 안드로이드보다 앞서 순수 자바로 URL 이미지 가져오기 할 줄 알아야함.
    @Override
    public int getCount() {
        return galleryList.size();
    }

    @Override
    public Object getItem(int position) {
        return galleryList.get(position);
    }

    @Override
    public long getItemId(int position) {
        Gallery gallery = galleryList.get(position);
        return gallery.getGallery_id();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null; //이 메서드에서 최종반환할 뷰
        if(convertView==null){//레이아웃 뷰가 존재하지 않는다면, 인플레이션
            view = layoutInflater.inflate(R.layout.item_gallery,parent,false);
        }else{
            view=convertView;
        }

        //리스트에 들어있는 position번째 Gallery 추출
        Gallery gallery = galleryList.get(position);
        ImageView img = view.findViewById(R.id.img);
        TextView t_title = view.findViewById(R.id.t_title);

        img.setImageBitmap(gallery.getBitmap());
        t_title.setText(gallery.getTitle());

        view.setOnClickListener(e->{
            Toast.makeText(mainActivity, gallery.getGallery_id()+"번 클릭", Toast.LENGTH_SHORT).show();
        });
        return view;
    }

}
