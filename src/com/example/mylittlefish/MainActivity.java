package com.example.mylittlefish;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

	private FlyingFishView gameView;
	private Handler handler=new Handler();
	private static final long Interval=30;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		gameView = new FlyingFishView(this);
		setContentView(gameView);
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				handler.post(new Runnable() {
					
					@Override
					public void run() {
						gameView.invalidate();
					}
				});
			}
		}, 0, Interval);
	}
}
