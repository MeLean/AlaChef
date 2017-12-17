package com.milen.alachef.dialogs;

import android.content.Context;
import android.support.v7.app.AlertDialog;


public class OkDialogShower {
    public static void showDialog(Context context, String title, String text) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set dialog message
        alertDialogBuilder
                .setTitle(title)
                .setMessage(text)
                .setCancelable(false)
                .setNegativeButton(android.R.string.ok, (dialog, which) -> dialog.dismiss());

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }
}
