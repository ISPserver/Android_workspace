package com.koreait.actionbarapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

//오직 액션메뉴에서만 페이지를 전환할 수 있도록, 기존 ViewPager의
//기능중 터치에 의한 슬라이드 금지 시키기
public class CustomViewPager extends ViewPager {
    //우리가 정의한 클래스를 xml에 명시하여 인플레이션 시킬땐 생성자는
    //AttributeSet을 준비해놓아야, 인플레이션시 xml 속성값 받기가능
    public CustomViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }
}
