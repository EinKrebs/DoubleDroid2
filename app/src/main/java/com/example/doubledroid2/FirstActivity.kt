package com.example.doubledroid2

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class FirstActivity: Activity() {
    private var number: Int = 0
    private lateinit var textView: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("Activity 1", "Created")
        setContentView(R.layout.layout_first)
    }

    override fun onStart() {
        super.onStart()
        Log.i("Activity 1", "Started")
        textView = findViewById(R.id.textView_first)
        textView.text = number.toString()
        button = findViewById(R.id.button_first)
        println(button)
        button.setOnClickListener {
            val intent = Intent(applicationContext, SecondActivity::class.java).apply {
                putExtra("number", number)
            }
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.i("Activity 1", "Paused")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Activity 1", "Resumed")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Activity 1", "Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("Activity 1", "Destroyed")
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        number++
        Log.i("Activity 1", "Config changed, current number is $number")
        println("Config changed!") //TODO: to logcat!
        textView.text = number.toString()
    }
}