package com.lpx.administrator.ddyc6.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.lpx.administrator.ddyc6.R;

import org.w3c.dom.Text;

/**
 * Created by ljj on 2015/11/16.
 * 用户信息界面
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private TextView header;
    private ImageView imgBack;
    private TextView text_service;
    private Button btn_login;
    private CheckBox check;
    private Button btn_yangzheng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findView();
        setListener();
    }

    private void setListener() {
        imgBack.setOnClickListener(this);
        text_service.setOnClickListener(this);
        btn_login.setOnClickListener(this);
        check.setOnCheckedChangeListener(this);
        btn_yangzheng.setOnClickListener(this);
    }

    /**
     * 初始化控件
     */
    private void findView() {
        header = (TextView) findViewById(R.id.text_header);
        imgBack = (ImageView) findViewById(R.id.my_back);
        //服务条款
        text_service = ((TextView) findViewById(R.id.text_service));
        header.setText("登录");
        btn_login = ((Button) findViewById(R.id.btn_login));
        check = ((CheckBox) findViewById(R.id.checkbox_login));
        btn_yangzheng = ((Button) findViewById(R.id.btn_yanzheng));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.my_back:
                finish();
                break;
            case R.id.text_service:
                Intent intent = new Intent(getApplicationContext(), Login_ServiceActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_login://登录

                break;
            case R.id.btn_yanzheng://获取验证码

                break;
        }
    }

    //checkbox的点击事件
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked){
            btn_login.setBackgroundColor(Color.BLUE);
            btn_login.setClickable(true);
        }else{
            btn_login.setBackgroundColor(Color.GRAY);
            btn_login.setClickable(false);
        }
    }
}
