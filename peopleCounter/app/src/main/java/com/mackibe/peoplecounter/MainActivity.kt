package com.mackibe.peoplecounter

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mybtnCounter = findViewById<Button>(R.id.btnCounter)
        val txtDisplay = findViewById<TextView>(R.id.countDisplayer)
        var countNumber = 0

        mybtnCounter.setOnClickListener {
            countNumber = countNumber + 1
            txtDisplay.text = countNumber.toString()
        }
    }
}