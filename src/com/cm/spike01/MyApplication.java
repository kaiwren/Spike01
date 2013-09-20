package com.cm.spike01;

import android.app.Application;

public class MyApplication extends Application {
	public static MyApplication singleton;
	
	public static MyApplication getInstance() {
		return singleton;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		singleton = this;
	}	
}
