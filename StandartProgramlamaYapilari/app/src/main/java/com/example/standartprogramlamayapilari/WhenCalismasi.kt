package com.example.standartprogramlamayapilari

fun main(){      // Switch case yapısı

    val gun = 5

    when(gun){
        1 -> println("Pazatesi")
        2 -> println("Salı")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")

    }
}