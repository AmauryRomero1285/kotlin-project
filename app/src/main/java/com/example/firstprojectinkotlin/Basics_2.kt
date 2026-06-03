package com.example.firstprojectinkotlin

fun main(){
    println("Type your age:")
    val age=readln().toByte()
    val status = if (age<18 && age>=0)"You're a kid" else "You're an Adult"
    println(status)
    averages()
}

fun averages(){
    println("Type your average")
    val average=readln().toByte()
    val status= if(average>=90)"approved" else if (average >=70 && average <90) "You have a B" else "Failed"
    println(status)
}