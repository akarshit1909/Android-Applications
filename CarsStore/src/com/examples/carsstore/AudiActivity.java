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

public class AudiActivity extends Activity {

	String companyInfo = "أودى هيا احدى شركات مجموعة فولكس واجن العالمية وتختص بأنتاج السيارات الفاخرة بمختلف اشكالها من السيارات المدمجة الصغيرة الى سيارت الطرق الواعرة والشاقة ويمثلها فى مصر الشركة المصرية للسيارات والتجارة";
	String [] ser = {"[مراكز الخدمة و الصيانة]","[القاهرة -- أبو رواش]","المنطقة الصناعية قطعة 112 - خلف القرية الذكية 35391163 - 35391168 - 35391175"
			,"[الأسكندرية -- طريق الوصله]","الكيلو 21 طريق القاهرة الاسكندرية الصحراوي - طريق الوصلة - أم زغلول 033021155 - 033021155","[القاهرة -- شبرا]",
			"طريق مسطرد 42206005- 42206005","[القاهرة -- العبور]",
			"مدينة العبور بعد سوق العبور 6100474 - 6100376 - 6100472"}; 
	int []imgid={R.drawable.car_audi1,R.drawable.car_audi2,R.drawable.car_audi3,R.drawable.car_audi4};
	 
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
				for(int i=0;i<7;i++){
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
				i.setData(Uri.parse("http://www.audi-eg.com/eg/brand/en.html"));				
				startActivity(i);

				return false;
			}
		});
	}

}
