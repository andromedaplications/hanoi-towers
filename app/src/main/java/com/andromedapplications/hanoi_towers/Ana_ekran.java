package com.andromedapplications.hanoi_towers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ana_ekran extends Activity {
	
	public void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.anasayfa);
	}

	public void game(View v) {
		Intent i = new Intent(this, Seviyeler.class);
		startActivity(i);
	}

	public void instruct(View v) {
		Intent i = new Intent(this, Nasil_oynanir.class);
		startActivity(i);
	}

	public void info(View v) {
		Intent i = new Intent(this, Hakkimizda.class);
		startActivity(i);
	}

	public void exit(View v) {
		finish();
		System.exit(0);
	}
}