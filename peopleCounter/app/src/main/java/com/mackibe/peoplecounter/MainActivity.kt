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
        // Assign a variable to button view id
        val mybtnCounter = findViewById<Button>(R.id.btnCounter)
        //
        // Assign a variable to text view id
        val txtDisplay = findViewById<TextView>(R.id.countDisplayer)
        //
        // assigned a variable countNumber a value of 0
        var countNumber = 0
        //
        // Add an event listener to the mybtnCounter button to take action when the button is tapped
        mybtnCounter.setOnClickListener {
            //
            // Increase the countNumber value by 1
            countNumber = countNumber + 1
            //
            // Display the countNumber value in a text box
            txtDisplay.text = countNumber.toString()
        }
    }
}