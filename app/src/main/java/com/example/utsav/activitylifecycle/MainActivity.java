package com.example.utsav.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"onCreate was Called" ,Toast.LENGTH_SHORT ).show();
        button=findViewById(R.id.bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent =  new Intent(MainActivity.this,Main2Activity.class);
             intent.putExtra("a","Activity" );
             intent.putExtra("b","Services" );
             intent.putExtra("c","BroadcastReceiver" );
             intent.putExtra("d","ContentProvider" );
             startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart was Called" ,Toast.LENGTH_SHORT ).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause was Called" ,Toast.LENGTH_SHORT ).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume was Called" ,Toast.LENGTH_SHORT ).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart was Called" ,Toast.LENGTH_SHORT ).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop was Called" ,Toast.LENGTH_SHORT ).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy was Called" ,Toast.LENGTH_SHORT ).show();

    }

}
