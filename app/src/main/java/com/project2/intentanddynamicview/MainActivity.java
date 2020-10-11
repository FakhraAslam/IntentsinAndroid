package com.project2.intentanddynamicview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnGotoResult;  // initialize object
        btnGotoResult = findViewById(R.id.btn_go_to_result); //map the view here in object
        // this is click listener (click event)
        btnGotoResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultActivity = new Intent(MainActivity.this, ResultActivity.class); // declaration of intent
                //parameters
                //1st is class jis m ham hn uska context
                //2nd: jiss class m jana h uska context
                startActivity(resultActivity); // startActivity m ham n apna intent jo create kia hoga pass krdena h

            }
        });
    }
}