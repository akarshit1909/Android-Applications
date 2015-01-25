package com.examples.tictactoegame;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener; 
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends Activity {

	MediaPlayer m;
	Button btnPlay,btnExit,btnOFF,btnON;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_activity);
		
		btnPlay = (Button)findViewById(R.id.button1);
		btnExit = (Button)findViewById(R.id.button2);
		btnON = (Button)findViewById(R.id.button3);
		btnOFF = (Button)findViewById(R.id.button4);
		
		
		m = MediaPlayer.create(HomeActivity.this,R.raw.music);
		m.setLooping(true);
		m.start();
	    

		
		btnOFF.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				m.pause();
			}
		});
		
       btnON.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				m.start();
			}
		});
		btnPlay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent x = new Intent(HomeActivity.this,PlayActivity.class);
				startActivity(x);
			}
		});
		
		btnExit.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				doExit();  
			}
		});
		
	}
	private void doExit() {

	    AlertDialog.Builder alertDialog = new AlertDialog.Builder(
	            HomeActivity.this);

	    alertDialog.setPositiveButton("Yes", new OnClickListener() {

	        @SuppressWarnings("deprecation")
			public void onClick(DialogInterface dialog, int which) { 
	        	m.release();
	        	moveTaskToBack(true);
	        	System.runFinalizersOnExit(true);
	            finish();
	            System.exit(0);
	        }
	    });

	    alertDialog.setNegativeButton("No", null);

	    alertDialog.setMessage("Do you want to exit?");
	    alertDialog.setTitle("TicTacToe");
	    alertDialog.show();
	}
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
	}
	
    
}
