package com.example.meet_249632_pract5

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate : Activity is being created")
        val btn1 = findViewById<Button>(R.id.btn1)

        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
        override fun onStart() {
            super.onStart()
            Log.d(TAG, "onStart : Activity is being started")
        }

        override fun onResume() {
            super.onResume()
            Log.d(TAG, "onResume : Activity is being resume")
        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG, "onPause : Activity is being pause")
        }

        override fun onStop() {
            super.onStop()
            Log.d(TAG, "onStop : Activity is being stop")
        }

}
