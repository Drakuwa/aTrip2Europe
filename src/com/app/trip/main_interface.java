package com.app.trip;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class main_interface extends TabActivity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_interface);
        
        Resources res = getResources();
        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        String country = getString(R.string.countries);
        String countryL = getString(R.string.countries2);
        String about = getString(R.string.about);
        String aboutL = getString(R.string.about2);
        
        intent = new Intent().setClass(this, countries.class);

        spec = tabHost.newTabSpec(countryL).setIndicator(country,
                          res.getDrawable(R.drawable.ic_tab_euro))
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, about.class);
        
        spec = tabHost.newTabSpec(aboutL).setIndicator(about,
                          res.getDrawable(R.drawable.ic_tab_about))
                      .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(1);
    }
}
