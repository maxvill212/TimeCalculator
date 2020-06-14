package com.example.timecalculator


/** Calculate minutes */

fun calcWork(startHR: Int, endHR: Int, startMN: Int, endMN: Int): String {

    return if (endMN >= startMN){
        (endHR - startHR).toString() + " : " + (endMN - startMN).toString()
    }else{
        (endHR - startHR - 1).toString() + " : " + (60 + (endMN - startMN)).toString()
    }
}