 
package com.examples.carsstore;

import android.app.Activity; 
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ChreslerActivity extends Activity {

	String companyInfo = "شركة أمريكية لصناعة السيارات وبدأت في هذا المجال من عام 1914 حتى 1925 ويمثلها فى مصر مجموعة عز العرب للصناعات";
	
	int []imgid={R.drawable.car_chrysler1,R.drawable.car_chrysler2,R.drawable.car_chrysler3,R.drawable.car_chrysler4};
	Button []btn = new Button[5];
	int ir1 = R.drawable.ch_rysler; 
	
	Button show ;
	int i = 0;
	TextView txtView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		// for hiding the title bar
		
	    this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.audi_activity);
		
		txtView = (TextView) findViewById(R.id.textview1);
		show = (Button) findViewById(R.id.button6); 
		btn[0] = (Button) findViewById(R.id.button1);
	    btn[1] = (Button) findViewById(R.id.button2);
	    btn[3] = (Button) findViewById(R.id.button4);
	    btn[4] = (Button) findViewById(R.id.button5);
	     
	    
      btn[0].setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				txtView.setText(companyInfo.toString());
				return false;
			}
		});
      btn[1].setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				show.setBackgroundResource(ir1); 
				return false;
			}
		});
       btn[3].setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				txtView.setText(companyInfo.toString());
				show.setText("");
				show.setBackgroundResource(imgid[i]);
				i++;
			    if(i==4){
			    	i=0;
			    }
			}
		});
       
      btn[4].setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse("http://www.arabic-mideast.chrysler.com"));				
				startActivity(i);

				return false;
			}
		});
	}

}
