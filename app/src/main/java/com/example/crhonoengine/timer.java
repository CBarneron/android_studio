package com.example.crhonoengine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class timer extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timer);
		TimeContainer fini = new TimeContainer();
	}
}