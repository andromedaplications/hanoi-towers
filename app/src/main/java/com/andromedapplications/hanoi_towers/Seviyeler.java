package com.andromedapplications.hanoi_towers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Seviyeler extends Activity implements OnClickListener {

	public void onCreate(Bundle b) {
		super.onCreate(b);
		setContentView(R.layout.seviyeler);
		
		findViewById(R.id.easy).setOnClickListener(this);
		findViewById(R.id.medium).setOnClickListener(this);
		findViewById(R.id.hard).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(Seviyeler.this, Oyna.class);
		switch (v.getId()) {
			case R.id.easy:
				intent.putExtra("numofdisks", 4);
				break;
	
			case R.id.medium:
				intent.putExtra("numofdisks", 5);
				break;
	
			case R.id.hard:
				intent.putExtra("numofdisks", 6);
				break;
		}
		startActivity(intent);
	}
}