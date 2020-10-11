package com.project2.intentanddynamicview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

                //Now Implicit Intent
                Button btnGetURL;
        final EditText etNum1;
                final EditText etNum2;
               etNum1=findViewById(R.id.et_1st_num);
               etNum2=findViewById(R.id.et_2nd_num);
                btnGetURL=findViewById(R.id.btn_get_url);
                btnGetURL.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                   int num1=Integer.parseInt(etNum1.getText().toString());
                   int num2=Integer.parseInt(etNum2.getText().toString());
                   int num3=num1+num2;
                   Intent intent=new Intent(MainActivity.this,ResultActivity.class);
                   intent.putExtra("sum",num1+"+"+num2+num3);
               startActivity(intent);
                    }
                });

            }
        });
    }
}