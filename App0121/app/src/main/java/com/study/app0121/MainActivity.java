package com.study.app0121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);//xml에서 명시된 객체들의 인스턴스가 메모리에 올라오게 됨
                                      //이 과정을 inflation이라 한다.

        GridView listview = (GridView)this.findViewById(R.id.listView); //document.getElementById()와 비슷함

        //리스트뷰에 보여질 모델 구성
        String[] fruit = {"딸기", "사과", "키위", "바나나", "배", "멜론", "포도"};

        //java swing에서 jtable이라는 뷰와 실제 데이터를 연결해주는 객체인 테이블모델이 존재하듯,
        //안드로이드에서도 ListView와 데이터 연결해주는 객체 '중간자' 라고하는 어댑터가 있다.
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, fruit);
        //우리가 원하는 레이아웃이 아닌 경우 직접 만들면 된다.
        //ArrayAdapter는 말 그대로 하나의 배열을 이용하여 단일 아이템만 표출할 수 있는 어댑터이다.
        //복합적인 뷰를 표현할땐 Swing 개발처럼 Model클래스를 재정의하듯, Adapter클래스를 재정의해야함

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.fruit_item, fruit);

        listview.setAdapter(adapter);
    }
}
