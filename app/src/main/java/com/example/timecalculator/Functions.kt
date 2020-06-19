package com.example.timecalculator

import com.example.timecalculator.MainActivity


fun roundRobin(startTime.get


/** Old Code
fun calcWork(startHR: Int, endHR: Int, startMN: Int, endMN: Int): String {
    return if (endMN >= startMN){
        var formattedMN = formatTime(endMN - startMN)
        (endHR - startHR).toString() + ":" + formattedMN
    }else{
        (endHR - startHR - 1).toString() + ":" + (60 + (endMN - startMN)).toString()
    }
}

fun formatTime(time: Int): String {
    return if (time < 10){
        "0${time}"
    }else{
        "$time"
    }
}

fun roundTime(startMN: Int, endMN: Int): Int {
    var minutes = 0
    minutes = if (endMN < startMN){
        60 + (endMN - startMN)
    }else{
        endMN - startMN
    }
    return when(minutes){
        in 0..7 -> 0
        in 8..22 -> 15
        in 23..37 -> 30
        in 37..53 -> 45
        in 54..59 -> 0
        else -> -1

    }
}
*/