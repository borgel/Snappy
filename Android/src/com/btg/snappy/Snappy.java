package com.btg.snappy;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

import android.app.Activity;
import android.os.Bundle;

public class Snappy extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
		// Add your initialization code here
		Parse.initialize(this, getString(R.string.PARSE_APPLICATION_ID), getString(R.string.PARSE_CLIENT_KEY));
		
		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
		// Optionally enable public read access by default.
		// defaultACL.setPublicReadAccess(true);
		ParseACL.setDefaultACL(defaultACL, true);
    }
}