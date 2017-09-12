package com.ed.will.immersivestatusbardemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by will on 17-9-12.
 * 透明状态栏
 * 这样的效果是只有5.0及以上系统才支持，
 * 因此这里先进行了一层if判断，只有系统版本大于或等于5.0的时候才会执行下面的代码
 */

public class SecondAcitvity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);


        if (Build.VERSION.SDK_INT>=21){
            View decorView =getWindow().getDecorView();
            int option =View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    |View.SYSTEM_UI_FLAG_LAYOUT_STABLE;//表示会让应用的主体内容占用系统状态栏的空间
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);//将状态栏设置成透明色
        }


        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
    }
}
