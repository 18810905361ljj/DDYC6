package com.lpx.administrator.ddyc6.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ImageView;

import com.lpx.administrator.ddyc6.R;
import com.lpx.administrator.ddyc6.configs.URLs;

/**
 * Created by ljj on 2015/11/16.
 */
public class HongB_InstructionsActivity extends AppCompatActivity {
    private WebView web_shuoM;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuoming);
        back = ((ImageView) findViewById(R.id.my_back2));
        //返回键的点击事件
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });

        web_shuoM = ((WebView) findViewById(R.id.web_shuoming));
        web_shuoM.loadUrl(URLs.SHUOMING);

    }
}
