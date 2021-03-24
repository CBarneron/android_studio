package com.example.crhonoengine;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView time0 =(TextView) findViewById(R.id.time0);

        TextView titre = (TextView) findViewById(R.id.nom);
        titre.setText("hello");


        Button btn_start = (Button) findViewById(R.id.btn_start);
        Chronometer chronometer =(Chronometer) findViewById(R.id.chronometer);
        btn_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chronometer.start();
                chronometer.setBase(SystemClock.elapsedRealtime());
            }
        });

        Button btn_stop =(Button) findViewById(R.id.btn_stop);
        btn_stop.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v){
                 chronometer.stop();
                 chronometer.setBase(SystemClock.elapsedRealtime());

             }
        });




    }

}