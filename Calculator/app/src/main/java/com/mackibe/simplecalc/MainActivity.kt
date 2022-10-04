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
    // The onCreate function in the AppCompatActivity class is being overriden
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        // Allow the default execution of the onCreate method
        super.onCreate(savedInstanceState)
        //
        // Display the Calculator screen.
        setContentView(R.layout.activity_main)
        //
        // Get addButton id and assign variable of addBtn.
        val addBtn = findViewById<Button>(R.id.addButton)
        //
        // Get divideBtn id and assign variable of divBtn.
        val divBtn = findViewById<Button>(R.id.divideBtn)
        //
        // Get multiplicationBtn id and assign variable of divBtn.
        val multiplyBtn = findViewById<Button>(R.id.multiplicationBtn)
        //
        // Get multiplicationBtn id and assign variable of divBtn.
        val subtractBtn = findViewById<Button>(R.id.subtractionBtn)
        //
        // Get calcBtn id and assign variable of calculateBtn.
        val calculateBtn = findViewById<Button>(R.id.calcBtn)
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
        // Get divideResult id and assign variable of divResults.
        val divResults = findViewById<TextView>(R.id.divideResult)
        //
        // Get divideResult id and assign variable of divResults.
        val multiResults = findViewById<TextView>(R.id.multipicationResult)
        //
        // Get divideResult id and assign variable of divResults.
        val subtractResults = findViewById<TextView>(R.id.subtractionResults)
        //
        // Add an event listener to the subtractBtn button to take action when the button is tapped.
        calculateBtn.setOnClickListener {
            //
            // Convert the two values from text to numbers so that we can do calculations.
            val numA = num1.text.toString().toInt()
            val numB = num2.text.toString().toInt()
            //
            // Add the two values
            val sum = numA + numB
            //
            // Display the Addition results of values A and B.
            // Remember to convert the numeric sum to text for display.
            additionResults.text = sum.toString()
            //
            // Divide the two values
            val div = numA / numB
            //
            // Display the division of values A and B
            divResults.text = div.toString()
            //
            // multiply the two values
            val multi = numA * numB
            //
            // Display the multiplication of values A and B
            multiResults.text = multi.toString()
            //
            // multiply the two values
            val sub = numA - numB
            //
            // Display the multiplication of values A and B
            subtractResults.text = sub.toString()
        }
    }
}