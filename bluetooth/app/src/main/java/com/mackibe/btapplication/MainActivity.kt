//
// its a namespace to uniquely identify your application in play store
package com.mackibe.btapplication
//
// library containsing AppCompatActivity
import androidx.appcompat.app.AppCompatActivity
//
// library containing bundle features
import android.os.Bundle

//
// create a app that can communicate/ transfer files to another device wirelessly via bluetooth
class MainActivity : AppCompatActivity() {
    //
    // overriding the onCreate Function to add more features for the
    override fun onCreate(savedInstanceState: Bundle?) {
        //
        // allow the class AppCompActivity to do its default execution
        super.onCreate(savedInstanceState)
        //
        // setting our main screen
        setContentView(R.layout.activity_main)

        //
        // create a buttons for turning on the bluetooth

        //
        // create a buttons for turning off the bluetooth

        //
        // create a button for discovering new device

        //
        // a button to show paired devices

        //
        // send a message to the paired device
    }
}