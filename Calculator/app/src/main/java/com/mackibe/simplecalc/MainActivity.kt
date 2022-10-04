//
// Create a namespace for the app to be uniquely identified in the play store.
package com.mackibe.simplecalc
//
// Use the AppCompActivity library in the app.
import androidx.appcompat.app.AppCompatActivity
//
// Use the Bundle library in the app.
import android.os.Bundle
//
// Use the Button library in the app.
import android.widget.Button
//
// Use the EditText library in the app.
import android.widget.EditText
//
// Use the TextView library in the app.
import android.widget.TextView
//
// The following app is a simple calculator which adds two numbers.
class MainActivity : AppCompatActivity() {
    //
    // is onCreate function in the AppCompatActivity class is being override
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        // Allow the default execution of the onCreate method
        super.onCreate(savedInstanceState)
        //
        // Set the main screen.
        setContentView(R.layout.activity_main)
        //
        // Get addButton id and assign variable of addBtn.
        val addBtn = findViewById<Button>(R.id.addButton)
        //
        // Get editText1 id and assign variable of num1.
        val num1 = findViewById<EditText>(R.id.editText1)
        //
        // Get editText2 id and assign variable of num2.
        val num2 = findViewById<EditText>(R.id.editText2)
        //
        // Get addResult id and assign variable of additionResults.
        val additionResults = findViewById<TextView>(R.id.addResult)
        //
        // Convert the two values from EditText to integers.
        val numA = num1.text.toString().toInt()
        val numB = num2.text.toString().toInt()
        //
        // Add an event listener to the addBtn button to take action when the button is tapped.
        addBtn.setOnClickListener {
            //
            // Add the two values
            val sum = numA + numB
            //
            // Display the Addition results of values A and B
            additionResults.text = sum.toString()
        }
    }
}