package com.example.sjcet.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}


    public void onClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://tkmce.ac.in/"));
        startActivity(i);

    }
}