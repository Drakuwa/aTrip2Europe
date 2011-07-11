package com.app.trip;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class countries extends ListActivity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String[] countries = getResources().getStringArray(R.array.countries_array);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, countries));

        ListView lv = getListView();
        lv.setTextFilterEnabled(true);

        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
         	  
			String text = ((TextView) view).getText().toString().trim();
			String noSpaces = text.replaceAll(" ", "");
					
        	Intent myIntent = new Intent();
        	myIntent.setClassName("com.app.trip", "com.app.trip."+noSpaces);
          	startActivity(myIntent);
          	
            Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
          }
        });



    }
}
