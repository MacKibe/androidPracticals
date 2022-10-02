//
//
package com.mackibe.simplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //
    //
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        // Allow the default execution of onCreate method
        super.onCreate(savedInstanceState)
        //
        // Set the main screen
        setContentView(R.layout.activity_main)

        val addButton = findViewById<Button>(R.id.addButton)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)

        addButton.setOnClickListener {
            val result = editText1.text.toString() + editText2.text.toString()
            resultTextView.text = result
        }
    }

}