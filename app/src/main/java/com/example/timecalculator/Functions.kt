/*************************************************************************************************
 *                                                                                               *
 *       ***************ABOUT**********************                                              *
 *       This is where all the functions for the app are located                                 *
 *                                                                                               *
 *       **********VARIABLES Functions*************                                              *
 *       WorkTime                                                                                *
 *          total  -> Stores the total time worked in the day                                    *
 *                                                                                               *
 *       **********FUNCTIONS Functions*************                                              *
 *       Boolean                                                                                 *
 *          roundRobin     -> Does end minutes - start minutes make a negative                   *
 *                            A check to see if the time needs to round robin                    *
 *                            Example: Start = 6:10, End = 7:09, total should be 0:59, not -1    *
 *       WorkTime                                                                                *
 *          setWorkedTime  -> Calculate the amount of time worked                                *
 *       String                                                                                  *
 *          formatTime     -> Convert worked time to string to be displayed on screen            *
 *          roundTime      -> Rounds the time by the 15 minutes and formats it in the way its    *
 *                             written on the punch card                                         *
 *                                                                                               *
 ************************************************************************************************/


package com.example.timecalculator

// Variable Declaration
var total = WorkTime()

fun roundRobin(start: Int, end: Int): Boolean {
    return end >= start
}

fun setWorkedTime(start: WorkTime, end: WorkTime): WorkTime {

//    If no round round robin is necessary, hours worked = start - end
    return if (roundRobin(start.getMN(), end.getMN())){
        total.setHR(end.getHR() - start.getHR())
        total.setMN(end.getMN() - start.getMN())
        total
//    Logic if there needs to be a round robin within the minutes
    } else {
        total.setHR(end.getHR() - start.getHR() - 1)
        total.setMN(60 + (end.getMN() - start.getMN()))
        total
    }
}

fun formatTime(time: WorkTime): String {
//    Add 0 if in the 10 position if minutes < 10 (8:05 instead of 8:5)
    return if (time.getMN() < 10) {
        "${time.getHR()}:0${time.getMN()}"
    }
    else{
        "${time.getHR()}:${time.getMN()}"
    }
}

fun roundTime(time: WorkTime): String {
    return when(time.getMN()){
        in 0..7 -> "${time.getHR()}"
        in 8..22 -> "${time.getHR()}.25"
        in 23..37 -> "${time.getHR()}.50"
        in 37..53 -> "${time.getHR()}.75"
        in 54..59 -> "${time.getHR()+ 1}"
        else -> "Error"
    }
}

// TODO: 2020-06-28 Don't hard code rounding, have the option to chose rounded time and do {+/- (round/2)}