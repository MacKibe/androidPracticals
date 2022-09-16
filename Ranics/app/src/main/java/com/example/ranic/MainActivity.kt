package com.example.ranic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            if(editTextTextEmailAddress.text.isNullOrBlank()&&editTextTextPassword.text.isNullOrBlank()){
                Toast.makeText(this,"Please fill the required fields", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"${editTextTextEmailAddress.text} is ogged in"); Toast.LENGTH_LONG).SHOW()
            }
        }

    }
}