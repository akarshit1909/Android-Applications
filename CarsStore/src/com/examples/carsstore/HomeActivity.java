package com.examples.carsstore;


import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.widget.ProgressBar;

public class HomeActivity extends Activity {

	ProgressBar prg;
	int progrss = 0;
	Handler h = new Handler();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// for hiding the title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.activity_home);
		
		
		
		 prg = (ProgressBar)findViewById(R.id.progressBar1);
	        new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for (int i = 0; i < 5 ; i++) {
						progrss+=20;
						h.post(new Runnable() {
							
							@Override
							public void run() {
								// TODO Auto-generated method stub
								prg.setProgress(progrss);
								if(progrss == prg.getMax()){
									//prg.setVisibility(4);
									Intent i = new Intent(getApplicationContext(),MainActivity.class);
								    startActivity(i);
								}
							}
						});
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO: handle exception
						}
					}
				}
			}).start();
	        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}

}
