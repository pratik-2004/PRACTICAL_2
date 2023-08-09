package com.example.practical_2_mad_041_5a_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout.TabGravity

class MainActivity : AppCompatActivity() {
    val TAG = "Main Activity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayMessage("oncreate")
    }

    override fun onStart() {
        super.onStart()
        displayMessage("onstart")
    }

    override fun onResume() {
        super.onResume()
        displayMessage("onresume")
    }

    override fun onPause() {
        super.onPause()
        displayMessage("onpause")
    }

    override fun onStop() {
        super.onStop()
        displayMessage("onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        displayMessage("ondistroy")
    }
    fun displayMessage(msg:String){
        Toast.makeText(this,"$msg"+"is called", Toast.LENGTH_LONG).show()
        Log.i(TAG,"This is $msg")
        Snackbar.make(
            findViewById(R.id.p_41),
            R.string.email_sent,
            Snackbar.LENGTH_SHORT
        ).show()

    }
}