package com.example.debuggin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }

    private fun logging() {
        Log.v(TAG, "Hello world!")
    }

    private fun division() {
        val numerator = 60
        var denominator = 4

        repeat(4) {
            Log.d(TAG, "${numerator / denominator}")
            denominator--
        }
    }
}
