package com.example.crhonoengine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class accueil extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_acceuil);


		ImageButton btn_engine = (ImageButton) findViewById(R.id.btn_engine);
		btn_engine.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent Accueil =new Intent(accueil.this, MainActivity.class);
				startActivity(Accueil);
			}

			;
		});
	}
}