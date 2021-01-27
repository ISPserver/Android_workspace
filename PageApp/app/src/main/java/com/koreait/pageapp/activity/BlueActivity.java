package com.koreait.pageapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.koreait.pageapp.R;

public class BlueActivity extends AppCompatActivity {
    String TAG = this.getClass().getName();

    //엑티비티의 인스턴스가 생성직후 초기화를 위한 메서드(서블릿의 init과 목적이 동일)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blue);
    }

    public void showPage(View view){
        Log.d(TAG,"당신이 클릭한 버튼은"+view.getId());

        String msg = null;
        Intent intent=null;
        switch (view.getId()){
            case R.id.bt_red:
                msg = "Red";
                //파란 액티비티 호출(주의: 액티비티는 개발자가 new 하면 안됨 시스템이 생명주기 관리하므로)
                //개발자의 의지, 의도,계획을 알려줘야함 intend to
                intent = new Intent(this, RedActivity.class);
                break;
            case R.id.bt_yellow:
                msg = "Yellow";
                intent = new Intent(this, YellowActivity.class);
                break;
        } this.startActivity(intent);
        Log.d(TAG,msg);
    }
}
