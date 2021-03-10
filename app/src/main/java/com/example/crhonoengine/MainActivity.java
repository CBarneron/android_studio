package com.example.crhonoengine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titre = (TextView) findViewById(R.id.nom);
        titre.setText(" hello");


        Button btn_start = (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                titre.setText("button start");


            }
        });
        Button btn_stop =(Button) findViewById(R.id.btn_stop);
        btn_stop.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v){
                titre.setText("button stop");
            }
            });
        Chronometer chronometer =(Chronometer) findViewById(R.id.chronometer);
        chronometer.start();





    }

}