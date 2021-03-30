package com.aoinc.w7d2_c_dependencyinjection.util

import android.app.AlertDialog
import android.content.Context
import android.view.ContextThemeWrapper
import android.widget.Toast
import com.aoinc.w7d2_c_dependencyinjection.R

class DIAlertDialog(var context: Context) {

    fun displayMessage(message: String) {
//        AlertDialog.Builder(ContextThemeWrapper(context, R.style.Theme_AppCompat))
//            .setTitle("Alert Message")
//            .setMessage(message)
//            .setNeutralButton("Yes") { dialog, _ ->
//                dialog.dismiss()
//            }.create()
//            .show()

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}