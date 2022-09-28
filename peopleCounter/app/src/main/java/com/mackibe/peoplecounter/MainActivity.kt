//
// contains a set of related classes and method, simply the code of the app
// it uniquely identifys your app on your device
package com.mackibe.peoplecounter
//
// is the bundle library
import android.os.Bundle
//
// is the widget button library
import android.widget.Button
//
// is the widget textView library
import android.widget.TextView
//
// is the library which helps in using the AppCompatActivity functionality
import androidx.appcompat.app.AppCompatActivity

//
// the following app counts people when the button is tapped and display the total number of people
class MainActivity : AppCompatActivity() {
    //
    // is onCreate function in the AppCompatActivity class is being override
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        // allows the default execution of the AppCompatActivity
        super.onCreate(savedInstanceState)
        //
        // set the screen view of our application which is activity_main in layout folder
        setContentView(R.layout.activity_main)
        //
        // assigning a variable to button view id
        val mybtnCounter = findViewById<Button>(R.id.btnCounter)
        //
        // assigning a variables to button view id
        val txtDisplay = findViewById<TextView>(R.id.countDisplayer)
        //
        // assigned a variable countNumber a value of 0
        var countNumber = 0
        //
        // added an event listener when button is tapped
        mybtnCounter.setOnClickListener {
            //
            // increases the countNumber value when the user taps the button
            countNumber = countNumber + 1
            //
            // displays the final value
            txtDisplay.text = countNumber.toString()
        }
    }
}