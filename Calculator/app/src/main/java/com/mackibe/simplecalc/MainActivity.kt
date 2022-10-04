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
        //
        // Getting the EditText element and giving a variable of numA
        val numA = findViewById<EditText>(R.id.valueOfA)
        //
        // Getting the EditText element and giving a variable of numB
        val numB = findViewById<EditText>(R.id.valueOfB)
        //
        // Getting the TextView element and giving a variable of addREsDisplay
        val addResDisplay = findViewById<TextView>(R.id.additionResults)
        //
        // Getting the Button element and giving a variable of addBtn
        val addBtn = findViewById<Button>(R.id.addButton)
        //
        // Listener to implement addition functionality when the button is tapped
        addBtn.setOnClickListener {
            //
            // Get values from the EditText and converting them to integers before adding
            var num1 = numA.text.toString().toInt()
            var num2 = numB.text.toString().toInt()
            //
            // Getting the sum of the two numbers
            var sum = num1 + num2
            //
            // Set the answer TextView text property to the result gotten
            addResDisplay.text = sum.toString()
        }
    }

}