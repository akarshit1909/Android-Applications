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

public class ChevroletActtivity extends Activity {

	String companyInfo = "شيفروليه هي شركة أمريكية لصناعة السيارات، تأسست عام 1911م في مدينة ديترويت في ولاية ميتشيغان في الولايات المتحدة الأمريكية على يد لويس شيفروليه  ويمثلها فى مصر منصور للسيارات";
	
	int []imgid={R.drawable.car_chevrolet1,R.drawable.car_chevrolet2,R.drawable.car_chevrolet3,R.drawable.car_chevrolet4};
	Button []btn = new Button[5];
	int ir1 = R.drawable.ch_evrolet1;
	int ir2 = R.drawable.ch_evrolet2;
	
	Button show,show2;
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
		show2 = (Button) findViewById(R.id.button7);
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
				show2.setBackgroundResource(ir2);
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
				i.setData(Uri.parse("http://www.chevroletegypt.com/"));				
				startActivity(i);

				return false;
			}
		});
	}

}
