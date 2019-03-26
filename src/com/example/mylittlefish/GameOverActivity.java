package com.example.mylittlefish;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends Activity {
Button play_again;
Button close_app;
TextView displayscore;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_over);
		play_again = (Button) findViewById(R.id.play_again);
		close_app =(Button) findViewById(R.id.closeApp);
		
		play_again.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent mainIntent=new Intent(GameOverActivity.this,MainActivity.class);
        		startActivity(mainIntent);	
			}
		});
		close_app.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finishAffinity();
			}
		});
		
	}
}
