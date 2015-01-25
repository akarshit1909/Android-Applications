
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

public class BmwActivity extends Activity {

	String companyInfo = " هى شركة المانية لصناعة السيارات والدراجات البخارية والمحركات أنشئت عام 1916  ويمثلها فى مصر المجموعة البافارية للسيارات";
	String []ser ={"[مراكز الخدمة و الصيانة]","الأسكندرية -- القباري","البافارية لصناعة السيارات -- بى ام دبليو",
			"طريق الابارى السريع - بجوار مرور محرم بك 46100087 - 46100088","الأسكندرية -- الطريق الزراعى","مركز خدمة عز العرب -- بى ام دبليو",
			"ك 9 طريق اسكندرية القاهرة الزراعي 03/5003001-03/5003002-03/5003003-03/5003005 ","القاهرة -- الطريق الدائري"
			,"البافارية لصناعة السيارات -- بى ام دبليو","الطريق الدائري بجوار كارفور 27272241-27272242-2727224 3-27272250"
			,"الأسكندرية -- الطريق الزراعى","مركز خدمة عز العرب -- بى ام دبليو","لكيلو 1 طريق القاهرة اسكندرية الزراعي 03/4244801-03/4250510 ",
			"القاهرة -- الطريق الصحراوى","البافارية لصناعة السيارات -- بى ام دبليو35390930 -- 35390930","بو غالي موتورز -- بى ام دبليوالقاهرة -- القاهرة الاسماعيلية الصحراوي الكيلو 9 طريق القاهرة الاسماعيلية الصحراوي - العبور 46300000 -- 44244801 "}; 
	int []imgid={R.drawable.car_bmw1,R.drawable.car_bmw2,R.drawable.car_bmw3,R.drawable.car_bmw4};
	Button []btn = new Button[5];
	Button show;
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
				txtView.setText(""); 
				for(int i=0;i<16;i++){
					txtView.append(ser[i]);
					txtView.append("\n");
				} 
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
				i.setData(Uri.parse("http://www.brilliance-eg.com/"));				
				startActivity(i);

				return false;
			}
		});
	}

}
