package com.u4universe.interviewplayground

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MyTag"

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun onStart() {
    super.onStart()
    Log.d(TAG, "onStart: Called")
  }

  override fun onResume() {
    super.onResume()
    Log.d(TAG, "onResume: Called")
  }

  override fun onPause() {
    super.onPause()
    Log.d(TAG, "onPause: Called")
  }

  override fun onStop() {
    super.onStop()
    Log.d(TAG, "onStop: Called")
  }

  override fun onDestroy() {
    super.onDestroy()
    Log.d(TAG, "onDestroy: Called")
  }
}