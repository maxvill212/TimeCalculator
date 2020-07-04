/************************************************************************************************
 *                                                                                              *
 *       ***************ABOUT**********************                                             *
 *       This is the main setup is located, and where the app takes the clock input             *
 *                                                                                              *
 *       User answers and passed to the next question                                           *
 *       The result is saved in the result array and passed to the next question                *
 *                                                                                              *
 *       **********VARIABLES MainActivity*************                                          *
 *       WorkTime                                                                               *
 *          startTime   -> When the shift started                                               *
 *          endTime     -> When the shift ended                                                 *
 *          totalTime   -> How long was the work day                                            *
 *       Button                                                                                 *
 *          btnClick    -> Button that starts the calculation algorithm                         *
 *          btnStart    -> Button that displays the time picker for the start time              *
 *          btnEnd      -> Button that displays the time picker for the end time                *
 *                                                                                              *
 ************************************************************************************************/


package com.example.timecalculator

import android.annotation.SuppressLint
import android.graphics.Color
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

//        Button variables for actions
        val btnClick = findViewById<Button>(R.id.btnCalc)
        val btnStart = findViewById<Button>(R.id.btnStart)
        val btnEnd = findViewById<Button>(R.id.btnEnd)

//        When the button "Calculate" is clicked
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

//            Display rounded time to put on screen
            txtbxRoundedTime.text = roundTime(totalTime)
        }

//        Show start time
        btnStart?.setOnClickListener{
            timeStart.visibility = View.VISIBLE
            timeEnd.visibility = View.INVISIBLE
            txtWhichClock.text = "Start"
        }

//        Show end time
        btnEnd?.setOnClickListener{
            timeStart.visibility = View.INVISIBLE
            timeEnd.visibility = View.VISIBLE
            txtWhichClock.text = "End"
        }


    }
}