package com.ed.will.immersivestatusbardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.first_btn)
    Button firstBtn;
    @BindView(R.id.second_btn)
    Button secondBtn;
    @BindView(R.id.third_btn)
    Button thirdBtn;
    @BindView(R.id.fourth_btn)
    Button fourthBtn;
    @BindView(R.id.fifth_btn)
    Button fifthBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick({R.id.first_btn, R.id.second_btn, R.id.third_btn, R.id.fourth_btn, R.id.fifth_btn})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.first_btn:
                Intent first = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(first);
                break;
            case R.id.second_btn:
                Intent second = new Intent(MainActivity.this, SecondAcitvity.class);
                startActivity(second);
                break;
            case R.id.third_btn:
                Intent third = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(third);
                break;
            case R.id.fourth_btn:
                Intent fourth = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(fourth);
                break;
            case R.id.fifth_btn:
                Intent fifth = new Intent(MainActivity.this, FifthActivity.class);
                startActivity(fifth);
                break;
        }
    }


}
