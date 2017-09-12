package com.ed.will.immersivestatusbardemo;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by will on 17-9-12.
 * 隐藏状态栏和ActionBar的方式在4.1系统之上和4.1系统之下还是不一样的，
 * 这里我就不准备考虑4.1系统之下的兼容性了，
 * 因为过于老的系统根本就没有提供沉浸式体验的支持。
 *
 */

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        View decorView=getWindow().getDecorView();
        int option=View.SYSTEM_UI_FLAG_FULLSCREEN;  //表示全屏，也就是会将状态栏隐藏

        decorView.setSystemUiVisibility(option);

        //根据Android的设计建议，ActionBar是不应该独立于状态栏而单独显示的，
        // 因此状态栏如果隐藏了，我们同时也需要调用ActionBar的hide()方法将ActionBar也进行隐藏
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
    }
}
