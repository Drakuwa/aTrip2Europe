package com.app.trip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Montenegro extends Activity{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_info);
        
        TextView tv1 = (TextView)findViewById(R.id.country_name);
        tv1.setText(R.string.mon_name);
        
        TextView tv2 = (TextView)findViewById(R.id.text_1);
        tv2.setText(R.string.mon_1);
        
        TextView tv3 = (TextView)findViewById(R.id.text_2);
        tv3.setText(R.string.mon_2);
        
        ImageView iv1 = (ImageView)findViewById(R.id.country_flag);
        iv1.setImageResource(R.drawable.flag_of_montenegro);
        
        ImageView iv2 = (ImageView)findViewById(R.id.country_pic);
        iv2.setImageResource(R.drawable.mon);
        
        Button holidays = (Button)findViewById(R.id.holidays);
        holidays.setOnClickListener(new OnClickListener() {  
        	     public void onClick(View v2) {  
        	    	 setContentView(R.layout.mon_holidays);
        	    	 Button back2 = (Button)findViewById(R.id.mon_back);
        	         back2.setOnClickListener(new OnClickListener() {  
        	         	     public void onClick(View v4) {
        	         	    	 finish();
        	         	    	 Intent myIntent = new Intent();
        	                	 myIntent.setClassName("com.app.trip", "com.app.trip.Montenegro");
        	                  	 startActivity(myIntent);
        	         		     }  
        	         		 });
        		     }  
        		 });
        
        Button back = (Button)findViewById(R.id.back_button);
        back.setOnClickListener(new OnClickListener() {  
        	     public void onClick(View v3) {  
        	    	 finish();
        		     }  
        		 });
        
	}
}
