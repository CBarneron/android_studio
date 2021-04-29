package com.example.crhonoengine;

public class TimeContainer {

	private long mtime;

	public long getTimer() {
		return timer;
	}

	private long timer;

	public long getMtime() {
		return mtime;
	}


	public void addtime(long value) {

		mtime = mtime + value;
	}




	public void timerfin(long value){
		timer= mtime;
	}


}
