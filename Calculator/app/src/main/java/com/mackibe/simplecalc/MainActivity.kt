//
// Create a namespace for the app to be uniquely identified in the play store.
package com.mackibe.simplecalc
//
// Is the library which helps in using the AppCompatActivity functionality
import androidx.appcompat.app.AppCompatActivity
//
// Use the bundle library in the app
import android.os.Bundle
//
// Use the Button library in the app
import android.widget.Button
//
// Use the EditText library in the app
import android.widget.EditText
//
// Use the TextView library in the app
import android.widget.TextView
//
// The following app is a simple calculator which adds two numbers
class MainActivity : AppCompatActivity() {
    //
    // is onCreate function in the AppCompatActivity class is being override
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        // Let onCreate method do its default execution
        super.onCreate(savedInstanceState)
        //
        // Set the main screen as activity.main
        setContentView(R.layout.activity_main)
        //
        // Get addBtn id and assign variable of addBtn
        val addBtn = findViewById<Button>(R.id.addButton)
        //
        // Get addBtn id and assign variable of addBtn
        val subtractionBtn = findViewById<Button>(R.id.subButton)
        //
        // Get addBtn id and assign variable of addBtn
        val multiplyBtn = findViewById<Button>(R.id.multiplyButton)
        //
        // Get addBtn id and assign variable of addBtn
        val divisionBtn = findViewById<Button>(R.id.divisionButton)
        //
        // Get editText1 id and assign variable of num1
        val num1 = findViewById<EditText>(R.id.editText1)
        //
        // Get editText2 id and assign variable of num2
        val num2 = findViewById<EditText>(R.id.editText2)
        //
        // Get resultsTextView id and assign variable of results
        val addResults = findViewById<TextView>(R.id.addRes)
        val subtractionResults = findViewById<TextView>(R.id.subRes)
        val multiplicationResults = findViewById<TextView>(R.id.multiRes)
        val divisionResults = findViewById<TextView>(R.id.divRes)
        //
        // Convert the two values from EditText to intergers
        var numA = num1.text.toString().toInt()
        var numB = num2.text.toString().toInt()
        //
        // Add an event listener to the addBtn button to take action when the button is tapped.
        addBtn.setOnClickListener {
            //
            // Add the two values
            var sum = numA + numB
            //
            // Display the Addition results of values A and B
            addResults.text = sum.toString()
        }
        //
        // Add an event listener to the addBtn button to take action when the button is tapped.
        subtractionBtn.setOnClickListener {
            //
            // Subtract the two values
            var sub = numA - numB
            //
            // Display the subraction results of values A and B
            subtractionResults.text = sub.toString()
        }
    }
}