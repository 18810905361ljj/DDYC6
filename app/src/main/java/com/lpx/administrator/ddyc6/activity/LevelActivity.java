package com.lpx.administrator.ddyc6.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;

import com.lpx.administrator.ddyc6.R;
import com.lpx.administrator.ddyc6.configs.URLs;

/**
 * Created by ljj on 2015/11/16.
 */
public class LevelActivity extends AppCompatActivity {
    private WebView web_level;
    private TextView text_record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        web_level = ((WebView) findViewById(R.id.web_level));
        web_level.loadUrl(URLs.LEVEL);

        //积分记录的点击事件
        text_record = ((TextView) findViewById(R.id.text_record));
        text_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Level_RecordActivity.class);
                startActivity(intent);
            }
        });
    }
}
