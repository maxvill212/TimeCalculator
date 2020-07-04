/************************************************************************************************
 *                                                                                              *
 *       ***************ABOUT**********************                                             *
 *       This is the class that creates, sets and gets the WorkTime object                      *
 *                                                                                              *
 *       The object takes input from the 2 TimePickers on the phone's screen to                 *
 *       store the hours and minutes of the start and end of the shift                          *
 *       This object is also used to store the total hours worked                               *
 *                                                                                              *
 *       **********VARIABLES WorkTime*************                                              *
 *       Integer                                                                                *
 *          hour      -> Stores the hour                                                        *
 *          minutes   -> Stores the minutes                                                     *
 *                                                                                              *
 ************************************************************************************************/


package com.example.timecalculator


// Class for the start and end time
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
