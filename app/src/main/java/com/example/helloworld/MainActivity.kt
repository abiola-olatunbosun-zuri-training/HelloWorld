package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Assigning buttons and text view resources to immutable variables
        val subtraction = findViewById<Button>(R.id.minus_button)
        val text = findViewById<TextView>(R.id.text_view)
        val addition = findViewById<Button>(R.id.plus_button)

// Declaring variable count, and initializing with value of 0
        var count = 0

 // Setting the onClick listener function for subtraction button
        subtraction.setOnClickListener {
            // Function for decrementing by 1 at each button click
            fun onClick(){
                count-=1
 // Displaying operation result in text view, and converting result from type Int to String
                text.text = count.toString()
            }

            onClick()

        }

// Setting the onClick listener function for addition button
        addition.setOnClickListener {
            // Function for incrementing by 1 at each button click
            fun onClick(){
                count+=1
// Displaying operation result in text view, and converting result from type Int to String
                text.text = count.toString()
            }

            onClick()

        }

        
    }
}