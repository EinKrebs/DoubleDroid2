package com.example.doubledroid2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity: Activity() {
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_second)
        val number = intent.getIntExtra("number", 0)
        val textView = findViewById<TextView>(R.id.textView_second)
        textView.text = (number * number).toString()
        Log.i("Activity 2", "Paused")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity 2", "Paused")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity 2", "Paused")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity 2", "Resumed")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity 2", "Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("Activity 2", "Destroyed")
    }
}