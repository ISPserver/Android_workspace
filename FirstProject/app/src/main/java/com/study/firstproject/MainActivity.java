package com.study.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //화면에 버튼 나오게 하기
        //Alt + Enter = import
        Button bt = new Button(this);
        bt.setText("나의 첫 버튼");
    
        this.setContentView(R.layout.linear);
    }
}