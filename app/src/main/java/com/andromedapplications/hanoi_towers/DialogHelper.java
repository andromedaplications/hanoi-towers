package com.andromedapplications.hanoi_towers;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;

public class DialogHelper {
    public static AlertDialog.Builder alertBuilder(Context context) {
        return new AlertDialog.Builder(new ContextThemeWrapper(context,
                R.style.TemaDuzenle));
    }
}