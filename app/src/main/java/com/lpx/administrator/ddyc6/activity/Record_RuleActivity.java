package com.lpx.administrator.ddyc6.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;

import com.lpx.administrator.ddyc6.R;
import com.lpx.administrator.ddyc6.configs.URLs;

/**
 * Created by ljj on 2015/11/16.
 * 积分规则
 */
public class Record_RuleActivity extends AppCompatActivity {
    private WebView web_rule;
    private TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rule);
        header = ((TextView) findViewById(R.id.text_header));
        header.setText("积分规则");
        //webView 加载界面
        web_rule = ((WebView) findViewById(R.id.web_rule));
        web_rule.loadUrl(URLs.RULE);
    }
}
