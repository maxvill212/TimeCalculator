package com.example.timecalculator


/** Class for the start and end time */
class WorkTime(_hour: Int = -1, _minutes: Int = -1) {

//    Variable declaration
    private var hour = _hour
    private var minutes = _minutes

    /** Getters*/
    fun getHR(): Int {
        return hour
    }
    fun getMN(): Int {
        return minutes
    }

    /** Setters */
    fun setHR(newHour: Int){
        hour = newHour
    }
    fun setMN(newMin: Int){
        minutes = newMin
    }
}
