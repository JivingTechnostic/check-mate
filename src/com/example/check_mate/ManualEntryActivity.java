package com.example.check_mate;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ManualEntryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manual_entry);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.manual_entry, menu);
		return true;
	}
	
	public void openDishMatcher(View v){ // Button to open DishMatcherActivity
		Intent myIntent = new Intent(ManualEntryActivity.this, DishMatcherActivity.class);
		ManualEntryActivity.this.startActivity(myIntent);
	}
	
}
