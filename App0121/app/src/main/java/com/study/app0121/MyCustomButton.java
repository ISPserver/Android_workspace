package com.study.app0121;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/*안드로이드의 네이티브 버튼을 상속받아 나만의 버튼으로 재정의*/
public class MyCustomButton extends androidx.appcompat.widget.AppCompatButton {

    //버튼을 포함한 모든 View는 단독 존재 불가하여 반드시
    //어느 하나의 엑티비티에서 관리되어야 함. 따라서 버튼의 생성자는
    //이 버튼을 관리할 액티비티 클래스를 명시해주어야 함
    public MyCustomButton(Context context) {
        super(context);
    }

    //xml을 이용하여 생성할때 호출되는 생성자
    //xml에서 이 버튼을 사용하고자 할때  지정된 버튼 속성이 AttributeSet
    //으로 넘어오게 된다.
    public MyCustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

}





