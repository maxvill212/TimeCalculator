package com.example.timecalculator

import kotlin.Comparable


/** Class for the start and end time */
class WorkTime(_hour: Int = -1, _minutes: Int = -1) {
    private val hour = _hour
    private val minutes = _minutes

    /** Getters*/
    fun getHours(): String {
        return hour.toString()
    }
    fun getminutes(): String {
        return minutes.toString()
    }

}

