package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val subtraction = findViewById<Button>(R.id.minus_button)
        val text = findViewById<TextView>(R.id.text_view)
        val addition = findViewById<Button>(R.id.plus_button)
        var count = 0

        subtraction.setOnClickListener {
            text.text = count--.toString()
        }

        addition.setOnClickListener {
           text.text = count++.toString()
        }

        
    }
}