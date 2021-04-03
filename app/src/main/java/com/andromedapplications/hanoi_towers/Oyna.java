package com.andromedapplications.hanoi_towers;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;

import java.math.BigDecimal;

public class Oyna extends Activity {

	private int totalMoves, minPossibleMoves;

	public void onCreate(Bundle b) {
		super.onCreate(b);

		DisplayMetrics displaymetrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);

		setContentView(new Ciz(this, displaymetrics.widthPixels,
				displaymetrics.heightPixels, getIntent().getExtras().getInt(
						"numofdisks")));

		minPossibleMoves = new BigDecimal(2).pow(
				getIntent().getExtras().getInt("numofdisks")).intValue() - 1;
	}

	public void gameOver(int moves) {
		totalMoves = moves;
		showDialog();
	}

	public void showDialog() {

		AlertDialog.Builder builder = DialogHelper.alertBuilder(Oyna.this);
		builder.setTitle("Oyun Bitti");

		if (totalMoves > minPossibleMoves)
			builder.setMessage("En az hareket sayısı : " + minPossibleMoves
					+ ", Siz : " + totalMoves + "." + "\n\n" + "Kazandınız, Tebrikler !");
		else
			Toast.makeText(Oyna.this, "Mesaj TextView'a Yazdırılmadı", Toast.LENGTH_SHORT).show();
		builder.setPositiveButton("GERİ", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int i) {

				dialog.cancel();
			}
		});
		builder.show();
	}
}