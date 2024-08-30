package com.example.myrecipeapp

fun main () {
    println("Enter A number ")
    try {

        val num = readln().toInt()
        println("User Entered $num")
    }

catch (e:Exception){
    println("error: ${e.message}")
}

    finally {
        println("this will get printed no matter what ")
    }
}