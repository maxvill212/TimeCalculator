package com.example.timecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        When the button "Calculate" is clicked
        val btnClick = findViewById<Button>(R.id.btnCalc)
        btnClick?.setOnClickListener{

//            Variable declaration
            val startTime = WorkTime(timeStart.hour, timeStart.minute)
            val endTime = WorkTime(timeEnd.hour, timeEnd.minute)
            val totalTime = setWorkedTime(startTime, endTime)

//            To make a clean look, only show text when wanted
            txtbxWorkTime.visibility = View.VISIBLE
            txtbxRoundedTime.visibility = View.VISIBLE

//            Display the time worked on the screen
            txtbxWorkTime.text = formatTime(totalTime)


        }
    }
}