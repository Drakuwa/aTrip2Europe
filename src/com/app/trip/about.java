package com.app.trip;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class about extends Activity{
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_main);
        
        ImageButton facebook = (ImageButton)findViewById(R.id.facebook);
        facebook.setOnClickListener(new OnClickListener() {  
        	     public void onClick(View v1) {  
        	    	 
        	    	 Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/drakuwa"));
        		     startActivity(myIntent);
        		     }  
        		 });  
        
        ImageButton twitter = (ImageButton)findViewById(R.id.twitter);
        twitter.setOnClickListener(new OnClickListener() {  
        	     public void onClick(View v2) {  
        	    	 
        	    	 Intent myIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.twitter.com/drakuwa"));
        	    	 startActivity(myIntent2);  
        		     }  
        		 });  
        
	}
}
