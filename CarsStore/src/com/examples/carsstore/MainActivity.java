package com.examples.carsstore;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity {

	Button []btn = new Button[53];
	Button exit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// for hiding the title bar
	    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
	    setContentView(R.layout.main_activity);
	    
	    btn[0] = (Button) findViewById(R.id.button1);
	    btn[1] = (Button) findViewById(R.id.button2);
	    btn[2] = (Button) findViewById(R.id.Button3);
	    btn[3] = (Button) findViewById(R.id.Button4);
	    btn[4] = (Button) findViewById(R.id.Button5);
	    btn[5] = (Button) findViewById(R.id.Button6);
	    btn[6] = (Button) findViewById(R.id.Button7);
	    btn[7] = (Button) findViewById(R.id.Button8);
	    btn[8] = (Button) findViewById(R.id.Button9);
	    btn[9] = (Button) findViewById(R.id.Button10);
	    btn[10] = (Button) findViewById(R.id.Button11);
	    btn[11] = (Button) findViewById(R.id.Button12);
	    btn[12] = (Button) findViewById(R.id.Button13);
	    btn[13] = (Button) findViewById(R.id.Button14);
	    btn[14] = (Button) findViewById(R.id.Button15);
	    btn[15] = (Button) findViewById(R.id.Button16);
	    btn[16] = (Button) findViewById(R.id.Button17);
	    btn[17] = (Button) findViewById(R.id.Button18);
	    btn[18] = (Button) findViewById(R.id.Button19);
	    btn[19] = (Button) findViewById(R.id.Button20);
	    btn[20] = (Button) findViewById(R.id.Button21);
	    btn[21] = (Button) findViewById(R.id.Button22);
	    btn[22] = (Button) findViewById(R.id.Button23);
	    btn[23] = (Button) findViewById(R.id.Button24);
	    btn[24] = (Button) findViewById(R.id.Button25);
	    btn[25] = (Button) findViewById(R.id.Button26);
	    btn[26] = (Button) findViewById(R.id.Button27);
	    btn[27] = (Button) findViewById(R.id.Button28);
	    btn[28] = (Button) findViewById(R.id.Button29);
	    btn[29] = (Button) findViewById(R.id.Button30);
	    btn[30] = (Button) findViewById(R.id.Button31);
	    btn[31] = (Button) findViewById(R.id.Button32);
	    btn[32] = (Button) findViewById(R.id.Button33);
	    btn[33] = (Button) findViewById(R.id.Button34);
	    btn[34] = (Button) findViewById(R.id.Button35);
	    btn[35] = (Button) findViewById(R.id.Button36);
	    btn[36] = (Button) findViewById(R.id.Button37);
	    btn[37] = (Button) findViewById(R.id.Button38);
	    btn[38] = (Button) findViewById(R.id.Button39);
	    btn[39] = (Button) findViewById(R.id.Button40);
	    btn[40] = (Button) findViewById(R.id.Button41);
	    btn[41] = (Button) findViewById(R.id.Button42);
	    btn[42] = (Button) findViewById(R.id.Button43);
	    btn[43] = (Button) findViewById(R.id.Button44);
	    btn[44] = (Button) findViewById(R.id.Button45);
	    btn[45] = (Button) findViewById(R.id.Button46);
	    btn[46] = (Button) findViewById(R.id.Button47);
	    btn[47] = (Button) findViewById(R.id.Button48);
	    btn[48] = (Button) findViewById(R.id.Button49);
	    btn[49] = (Button) findViewById(R.id.Button50);
	    btn[50] = (Button) findViewById(R.id.Button51);
	    btn[51] = (Button) findViewById(R.id.Button52);
	    btn[52] = (Button) findViewById(R.id.Button53);
	    
	    exit = (Button) findViewById(R.id.button54);
	    exit.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				doExit();  
			}
		});
	    
	    btn[0].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,AudiActivity.class);
				startActivity(i);
			}
		});
        btn[1].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,BentlyActivity.class);
				startActivity(i);
			}
		});
        btn[2].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,BmwActivity.class);
				startActivity(i);
			}
		});
        btn[3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,BrilliancaActivity.class);
				startActivity(i);
			}
		});
        btn[4].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,ChaneActivity.class);
				startActivity(i);
			}
		});
       btn[5].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this,ChangheActivity.class);
				startActivity(i);
			}
		});
       btn[6].setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i = new Intent(MainActivity.this,ChevroletActtivity.class);
		startActivity(i);
	}
    });
       btn[7].setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			Intent i = new Intent(MainActivity.this,ChreslerActivity.class);
   			startActivity(i);
   		}
   	});
	}
	
	private void doExit() {

	    AlertDialog.Builder alertDialog = new AlertDialog.Builder(
	            MainActivity.this);

	    alertDialog.setPositiveButton("Yes", new OnClickListener() {

	        @SuppressWarnings("deprecation")
			public void onClick(DialogInterface dialog, int which) {  
	        	moveTaskToBack(true);
	        	System.runFinalizersOnExit(true);
	            finish();
	            System.exit(0);
	        }
	    });

	    alertDialog.setNegativeButton("No", null);

	    alertDialog.setMessage("Do you want to exit?");
	    alertDialog.setTitle("Car Store Application");
	    alertDialog.show();
	}
}
