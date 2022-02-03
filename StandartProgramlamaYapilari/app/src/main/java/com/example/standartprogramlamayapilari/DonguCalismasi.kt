package com.example.standartprogramlamayapilari

fun main(){
    // 3 ile 6 arasında döngü oluştur

    for(i in 3..6){
        println("Döngü 1: $i")
    }

    println("///////////")
    var sayac = 3

    while(sayac < 7){
        println("Döngü 2: $sayac")
        sayac += 1
    }

    // o ile 8 arasında 2şer: 0,2,4,6,8

    for(i in 0..8 step 2){     // 2şer artır demek
        println("Döngü 3: $i")
    }

    println("///////////")
    var sayac2 = 0

    while(sayac2 < 9){
        println("Döngü 4: $sayac2")
        sayac2 += 2
    }
    println("///////////")

    // 8 ile 0 2şer azalsın

    for(i in 8 downTo 0 step 2){     // 2şer artır demek
        println("Döngü 5: $i")
    }
    println("///////////")

    // 8 ile 0 2şer azalsın

    var sayac3 = 8

    while(sayac3 > -1){
        println("Döngü 6: $sayac3")
        sayac3 = sayac3 - 2

    }
    // break kullanımı

    for(i in 1..5){
        if(i == 3){
            break
        }
        println("Döngü 7: $i")

    }
    // continue kullanımı

    for(i in 1..5){
        if(i == 3){
            continue
        }
        println("Döngü 7: $i")

    }

}