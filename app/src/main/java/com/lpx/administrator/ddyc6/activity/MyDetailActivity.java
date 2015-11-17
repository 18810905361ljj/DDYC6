package com.lpx.administrator.ddyc6.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lpx.administrator.ddyc6.R;
import com.lpx.administrator.ddyc6.application.BaseApplication;

/**
 * Created by ljj on 2015/11/16
 * 我的主界面
 */
public class MyDetailActivity extends AppCompatActivity{


    private RelativeLayout myRelative;
    private LinearLayout hongbao;
    private LinearLayout myLevel;
    private TextView user;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mydetail);
        initView();

        if (BaseApplication.isLogin) {
            //设置等级可见
           myLevel.setVisibility(View.VISIBLE);
        }else{
            user = ((TextView) findViewById(R.id.tv_name));
            user.setText("点击登录");
            myLevel.setVisibility(View.GONE);
        }


            myLevel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), LevelActivity.class);
                    startActivity(intent);
                }
            });

            //头像的点击事件
            myRelative.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                }
            });
            //红包的点击事件
            hongbao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), HongBaoActivity.class);
                    startActivity(intent);
                }
            });

    }



    private void initView() {
        myRelative = ((RelativeLayout) findViewById(R.id.rl_user_info));
        hongbao = ((LinearLayout) findViewById(R.id.ll_hongbao));
        myLevel=((LinearLayout)findViewById(R.id.ll_my_level));
    }
}
