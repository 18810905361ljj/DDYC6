package com.lpx.administrator.ddyc6.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;

import com.lpx.administrator.ddyc6.R;
import com.lpx.administrator.ddyc6.application.BaseApplication;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mydetail);
        boolean isLogin = BaseApplication.isLogin;
        Log.d("isLogin",isLogin+"");
    }
}
