package com.example.interactiveapp

import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDark=findViewById<Button>(R.id.dark)
        val btnLight=findViewById<Button>(R.id.light)
        val screen=findViewById<LinearLayout>(R.id.screen1)

        btnDark.setOnClickListener(){
            screen.setBackgroundColor(Color.DKGRAY)
        }

        btnLight.setOnClickListener(){
            screen.setBackgroundColor(Color.LTGRAY);
        }
    }
}