package com.mackibe.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.clickMeBtn)
        val textView = findViewById<TextView>(R.id.txtView)

        btnClickMe.setOnClickListener {
            btnClickMe.text = "Haha"
            textView.text = "AHAHAHA"
        }
    }
}
