package com.study.app0121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //화면구성에 사용할 뷰 또는 레이아웃 지정
        //방법1)xml에 버튼을 배치하는 방법 setContentView(R.layout.custom);
        //방법2)xml 없이 하드코딩으로 버튼 생성해 붙이는 방법
        /*Button bt = new Button(this); //context는 개발중인 클래스를 말함
        bt.setText("버튼2");
        setContentView(bt);*/
        //방법3) 방법2를 응용한 방식, 기존 버튼 상속받아 재정의하는 방법
        //MyCustomButton bt = new MyCustomButton(this);

        //방법4) 방법3에서 정의한 버튼을 xml에서 생성및 배치하는법
        //이때는 버튼의 생성자에 xml 속성을 받을 수 있는 생성자를 오버라이딩 해주어야 함
        setContentView(R.layout.custom);
    }
}