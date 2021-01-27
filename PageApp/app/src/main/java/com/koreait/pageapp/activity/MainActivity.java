package com.koreait.pageapp.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.koreait.pageapp.R;
import com.koreait.pageapp.fragment.BlueFragment;
import com.koreait.pageapp.fragment.RedFragment;
import com.koreait.pageapp.fragment.YellowFragment;


//서블릿: 우리가 new? --> 시스템에 관리를 맡긴다 --> 생명주기
//생명주기를 메서드를 제공하여, 개발자로 하여금 제어가 가능하도록
public class MainActivity extends AppCompatActivity {
    String TAG = this.getClass().getName();

    //화면 구성할 프레그먼트 준비
    Fragment[] fragments = new Fragment[3];

    int current=0;

    //프래그먼트 매니저를 얻으려면 현재 액티비티가 Frgment를 지원하는 액티비티어야 한다. 화면 조각 생성
    FragmentManager fragmentManager = this.getSupportFragmentManager(); //프래그먼트 화면을 제어해주는 프래그먼트 트랜잭션을 생성해줌


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //FrameLayout ViewGroup이 존재해야 붙일 수 있으므로,setContentVIew 이후 부착
        //ViewGroup fragment_container = (ViewGroup)this.findViewById(R.id.container);

        fragments[0] = new RedFragment();//화면조각 생성
        fragments[1] = new BlueFragment();//화면조각 생성
        fragments[2] = new YellowFragment();//화면조각 생성

        //프레그먼트를 프로그래밍적으로 화면에 부착하려면, FragmentTransaction이 필요하고,
        //FragmentTransaction은 FragmentManager를 통해 얻을 수 있다.

        //Default 보여주고 싶은 화면
        showView(2);//빨간 화면은 Default로 설정
    }

    public void showPage(View view){
        Log.d(TAG,"당신이 클릭한 버튼은"+view.getId());
        int index=0; //보여질 프레그먼트 인덱스

        switch (view.getId()){
            case R.id.bt_red: index=0; break;
            case R.id.bt_blue: index=1; break;
            case R.id.bt_yellow: index=2; break;
        }
        showView(index);
    }
    public void showView(int index){
        //화면 트랜잭션 시작
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //기존거 제거(중복 제거)
        fragmentTransaction.remove(fragments[current]);
        fragmentTransaction.add(R.id.frame, fragments[index]);
        fragmentTransaction.commit();//트랜잭션 완료
        current=index;
    }
}