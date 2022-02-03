package com.example.standartprogramlamayapilari

fun main(){

    var yas = 15
    var isim = "Nisa"

    if(yas >= 18){
        println("Reşitsiniz")
    }else{
        println("Reşit değilsiniz")
    }

    if(isim == "Nisa"){
        println("Merhaba Nisa")
    }else{
        println("Tanınmayan kişi")
    }

    var kullanıcı_adı = "Admin"
    var sifre = 12345

    if(kullanıcı_adı == "Admin" && sifre == 12345){  // or için: ||
        println("Hoşgeldiniz")
    }else{
        println("Hatalı giriş yaptınız")
    }


}