package com.lpx.administrator.ddyc6.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import com.lpx.administrator.ddyc6.R;

/**
 * Created by ljj on 2015/11/16.
 * 积分记录
 */
public class Level_RecordActivity extends AppCompatActivity {
    private TextView text_rule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        //积分规则的点击
        text_rule = ((TextView) findViewById(R.id.text_rule));
        text_rule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Record_RuleActivity.class);
                startActivity(intent);

            }
        });
    }
}
