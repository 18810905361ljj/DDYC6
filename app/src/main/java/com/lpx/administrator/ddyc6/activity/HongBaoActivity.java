package com.lpx.administrator.ddyc6.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;

import com.lpx.administrator.ddyc6.R;
import com.lpx.administrator.ddyc6.application.BaseApplication;
import com.lpx.administrator.ddyc6.configs.URLs;

/**
 * Created by ljj on 2015/11/16
 * 红包界面
 */
public class HongBaoActivity extends AppCompatActivity {
    private TextView shuoming;
    private WebView web_hong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hongbao);
        web_hong = ((WebView) findViewById(R.id.web_hongbao));
        //已登录
       if( BaseApplication.isLogin) {
          web_hong.loadUrl(URLs.HONGBAO);
       }

        //点击使用说明
        shuoming = ((TextView) findViewById(R.id.use_shuoming));
        shuoming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HongB_InstructionsActivity.class);
                startActivity(intent);
            }
        });
    }
}
