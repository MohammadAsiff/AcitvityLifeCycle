package com.example.utsav.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
Button button2;
TextView tvView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2=findViewById(R.id.btt);
         button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Main2Activity.this,MainActivity.class));

            }
        });
        tvView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String a = intent.getStringExtra("a");
        String b= intent.getStringExtra("b");
        String c = intent.getStringExtra("c");
        String d= intent.getStringExtra("d");
        tvView.setText("Android Components are: " + a + " " + b +" "+ c +" "+ d );
    }
}
