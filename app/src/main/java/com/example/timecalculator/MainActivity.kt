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

        val btnClick = findViewById<Button>(R.id.btnCalc)
        btnClick?.setOnClickListener(){

            /** Old Code
            
            val hoursWorked = calcWork(timeStart.hour, timeEnd.hour, timeStart.minute, timeEnd.minute)
            var roundedTime = roundTime(timeStart.minute, timeEnd.minute)

            txtbxWorkTime.visibility = View.VISIBLE
            txtbxRoundedTime.visibility = View.VISIBLE
            txtbxWorkTime.text = "Hours Worked: $hoursWorked"
            txtbxRoundedTime.text = "Rounded Minutes: ${roundedTime.toString()}"
*/
            var startTime = WorkTime(timeStart.hour, timeStart.minute)
            var endTime = WorkTime(timeEnd.hour, timeEnd.minute)



            txtbxWorkTime.visibility = View.VISIBLE
            txtbxRoundedTime.visibility = View.VISIBLE


            txtbxRoundedTime.text = test.getHours()
            txtbxWorkTime.text = test.getminutes()

        }
    }
}