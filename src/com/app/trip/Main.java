package com.app.trip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button button = (Button)findViewById(R.id.mainButton01);
        //Vaka se zima button od layout spored id
        button.setOnClickListener(this);
    }
    public void onClick(View v)
    {
    	//setContentView(R.layout.test);
    	//Na vakov nacin samo se menja layout-ot a ne se otvara novo Activity
    	
    	Intent myIntent = new Intent();
    	myIntent.setClassName("com.app.trip", "com.app.trip.main_interface");
    	startActivity(myIntent);
    	
    	//Vaka se otvora novo Activity... neznam kolku e prakticno...bidejki na klikanje
    	//na Back kopce od telefon se vrakja na prethodno Activity vo ovoj slucaj na 
    	//tralala (od tralala2), znaci valjda ke treba neshto kako finishActivity ili
    	//kako i da beshe za da se napravi destroy...
    	//
    	//Na ovj nachin valjda mora i da se dodade Activity u AndroidManifest.xml
    	  
    	 //*  Intent intent = new Intent((Context)this, NewWindow.class);
		 //*	startActivityForResult(intent, 0); //Primer od sajt...
    	
    }
}