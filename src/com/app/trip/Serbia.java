package com.app.trip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Serbia extends Activity{

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_info);
        
        TextView tv1 = (TextView)findViewById(R.id.country_name);
        tv1.setText(R.string.ser_name);
        
        TextView tv2 = (TextView)findViewById(R.id.text_1);
        tv2.setText(R.string.ser_1);
        
        TextView tv3 = (TextView)findViewById(R.id.text_2);
        tv3.setText(R.string.ser_2);
        
        ImageView iv1 = (ImageView)findViewById(R.id.country_flag);
        iv1.setImageResource(R.drawable.flag_of_serbia);
        
        ImageView iv2 = (ImageView)findViewById(R.id.country_pic);
        iv2.setImageResource(R.drawable.ser);
        
        Button holidays = (Button)findViewById(R.id.holidays);
        holidays.setOnClickListener(new OnClickListener() {  
        	     public void onClick(View v2) {  
        	    	 setContentView(R.layout.ser_holidays);
        	    	 Button back2 = (Button)findViewById(R.id.ser_back);
        	         back2.setOnClickListener(new OnClickListener() {  
        	         	     public void onClick(View v4) {
        	         	    	 finish();
        	         	    	 Intent myIntent = new Intent();
        	                	 myIntent.setClassName("com.app.trip", "com.app.trip.Serbia");
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
