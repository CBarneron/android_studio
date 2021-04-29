package com.example.crhonoengine;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TimeContainer temps = new TimeContainer();

		Button btn_start = (Button) findViewById(R.id.btn_start);
		Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
		btn_start.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				chronometer.setBase(SystemClock.elapsedRealtime());
				chronometer.start();


			}
		});

		Button btn_stop = (Button) findViewById(R.id.btn_stop);
		btn_stop.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				chronometer.stop();

				long time = SystemClock.elapsedRealtime() - chronometer.getBase();
				temps.addtime(time);
				TextView time0 = (TextView) findViewById(R.id.time0);

				time0.setText(Long.toString(time));
				TextView time1 = (TextView) findViewById(R.id.time1);
				time1.setText(Long.toString(temps.getMtime()));

			}
		});
		Button btn_retour =(Button) findViewById(R.id.btn_retour);
		btn_retour.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Intent Accueil =new Intent(MainActivity.this, accueil.class);
				startActivity(Accueil);
			}


		});
		final EditText inputText = (EditText) findViewById(R.id.txt_engine);
		inputText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
			public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
				return false;
			}
		});


	}

}