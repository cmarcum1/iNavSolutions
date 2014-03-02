package com.example.inavsolutions;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Locations extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_locations);
	}
	public void VibAndOpen(View view){
		final Context context = this;
		Intent intent = new Intent(context,Blank.class);
		startActivity(intent);
	}
	
	public void VibAndOpenAllLocations(View view){
		final Context context = this;
		Intent intent = new Intent(context,AllLocations.class);
		startActivity(intent);
	}
	
}
