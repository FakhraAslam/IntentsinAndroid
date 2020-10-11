package com.project2.intentanddynamicview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView tvsum;
        tvsum=findViewById(R.id.tv_sum);
        Intent intent=getIntent();
        String result=intent.getStringExtra("sum");
        tvsum.setText(result);
    }
}