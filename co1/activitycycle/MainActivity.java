package com.example.sjcet.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("State","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State","onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State","onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State","onDestroy");
    }
}
