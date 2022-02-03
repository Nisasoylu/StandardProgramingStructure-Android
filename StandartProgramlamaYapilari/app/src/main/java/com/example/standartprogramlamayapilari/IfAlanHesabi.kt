package com.example.standartprogramlamayapilari

import java.util.*

fun main(){
    val girdi = Scanner(System.`in`)

    println("Dikdörtgen Alanı (1)")
    println("Çember Alanı (2)")

    val secim = girdi.nextInt()
    println("Seçiminiz: &secim")

    if(secim == 1){
        println("Kısa kenar giriniz:")
        val kısakenar = girdi.nextInt()

        println("Kısa kenar giriniz:")
        val uzunkenar = girdi.nextInt()

        println("Dikdörtgen alanı:")
        println("Sonuç: ${kısakenar*uzunkenar}")
    }else if(secim == 2){
        println("Yarıçap giriniz:")
        val yarıcap = girdi.nextInt()

        println("Çember alanı:")
        println("Sonuç: ${3.14*yarıcap*yarıcap}")



    }

}