package com.example.inavsolutions;

import location.LocationInfo;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Initialization extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_initialization);
	}
	public void Open(View view){
		LocationInfo.createDB();
		final Context context = this;
		Intent intent = new Intent(context,MainMenu.class);
		startActivity(intent);
	}
	
}
