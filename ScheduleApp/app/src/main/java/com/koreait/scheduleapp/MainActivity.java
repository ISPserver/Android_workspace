package com.koreait.scheduleapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.koreait.scheduleapp.animation.AnimationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //메뉴를 사용할 것임 즉, 액션바 활성화 시키기
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navi,menu);//인플레이션 결과를 인수로 넘겨받은 Menu객체에 반영
        return true;
    }

    //메뉴에 이벤트 연결
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent = null; //선언만 하고, 의도 품지 않음

        switch (item.getItemId()){
            case R.id.ani:
                intent = new Intent(this, AnimationActivity.class);
                break;
            case R.id.schedule:
                intent = new Intent(this,ScheduleActivity.class);
                break;
        }
        startActivity(intent);//지정한 액티비티 호출

        return true;
    }
}