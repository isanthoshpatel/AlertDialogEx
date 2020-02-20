package com.example.alertdialogex

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialogFragment

class AlertDialogEx : AppCompatDialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity!!)
            .setIcon(R.drawable.ic_launcher_foreground)
            .setTitle("this is title")
            .setMessage("message appears here")
            .setPositiveButton("yes") { dialog, which ->
                Toast.makeText(activity, "yes....work is ongoing...", Toast.LENGTH_LONG).show()
                dialog.dismiss()
            }
            .setNegativeButton("no") { dialog, which ->
                Toast.makeText(activity, "Cancelling...", Toast.LENGTH_LONG).show()
                dialog.dismiss()

            }
            .setNeutralButton("no thanks") { dialog, which -> dialog.dismiss() }
            .create()
    }


}