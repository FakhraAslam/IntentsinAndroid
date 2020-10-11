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
                final EditText etGetUrl;
                etGetUrl=findViewById(R.id.et_get_url);
                btnGetURL=findViewById(R.id.btn_get_url);
                btnGetURL.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"running",Toast.LENGTH_LONG);
                       String url=etGetUrl.getText().toString();
                       Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                       /*Parameters
                       1st : URLs k liy actionView jo k intent ki class s h usy dety hein
                       2nd : uri pass krna hota h hmary pass chunk wo string format m h user s string format m get kia h to usy
                              uri m parse kr k dalein gay*/
                       startActivity(intent);
                    }
                });

            }
        });
    }
}