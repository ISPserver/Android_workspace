package com.study.app0120;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String TAG = this.getClass().getName();
    WebConnector web;
    //엑티비티가 초기화 될 때 할 작업을 onCreate()에서 처리해야함
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView 화면을 구성할 컴포넌트를 생성 및 배치
        setContentView(R.layout.login_form);
    }
    //이벤트 메서드 정의
    public void regist(View view){
        //안드로이드도 Log4j를 도입했다.
        //태그의 역할은 Log에 출력되는 메시지간 구분을 위한 태그임
        //이 태그가 구분되어야 수많은 로그 중 원하는 로그를 걸러낼 수 있다.
        Log.d(TAG,"Click");

        //간접적으로 요청 시도
        web = new WebConnector();
        web.start();
    }
}