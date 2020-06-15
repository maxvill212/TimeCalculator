package com.example.timecalculator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnCalc)
        btnClick?.setOnClickListener(){

            val hoursWorked = calcWork(timeStart.hour, timeEnd.hour, timeStart.minute, timeEnd.minute)
            var roundedTime = roundTime(timeStart.minute, timeEnd.minute)

            txtbxWorkTime.visibility = View.VISIBLE
            txtbxRoundedTime.visibility = View.VISIBLE
            txtbxWorkTime.text = "Hours Worked: $hoursWorked"
            txtbxRoundedTime.text = "Rounded Minutes: ${roundedTime.toString()}"

        }
    }
}