package com.example.sjcet.co2_q4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    boolean onclick=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {

        ImageView img = (ImageView) findViewById(R.id.imageview);

        if(!onclick){

            img.setImageResource(R.drawable.a);
            onclick=true;
        }


        else if(onclick){

            img.setImageResource(R.drawable.b);

            onclick=false;

        }

    }
}