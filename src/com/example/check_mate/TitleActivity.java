package com.example.check_mate;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class TitleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_title);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.title, menu);
		return true;
	}
	
	public void openPeopleInput(View v){ // button to shift to next activity
		Intent myIntent = new Intent(TitleActivity.this, PeopleInputActivity.class);
		TitleActivity.this.startActivity(myIntent);
	}

}
