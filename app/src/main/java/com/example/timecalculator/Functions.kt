package com.example.timecalculator

fun calcWork(startHR: Int, endHR: Int, startMN: Int, endMN: Int): String {

    return if (endMN >= startMN){
        var formattedMN = formatTime(endMN - startMN)
        (endHR - startHR).toString() + " : " + formattedMN
    }else{
        (endHR - startHR - 1).toString() + " : " + (60 + (endMN - startMN)).toString()
    }
}

fun formatTime(time: Int): String {
    return if (time < 10){
        "0${time}"
    }else{
        "$time"
    }
}