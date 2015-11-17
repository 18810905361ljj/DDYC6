package com.lpx.administrator.ddyc6.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.lpx.administrator.ddyc6.R;

/**
 * Created by ljj on 2015/11/16.
 */
public class Login_ServiceActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView header;
    private ImageView back;
    private WebView web_service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_service);

        initView();
        setOnclick();
    }

    private void setOnclick() {
        back.setOnClickListener(this);
    }

    private void initView() {
        header = ((TextView) findViewById(R.id.text_header));
        back = ((ImageView) findViewById(R.id.my_back));
        header.setText("服务条款");
        web_service = ((WebView) findViewById(R.id.web_service));
      // web_service.loadUrl();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.my_back:
                finish();
                break;
        }
    }
}
