package com.example.firstprojectinkotlin

fun main(){
    inverted()
}

//Exercise 01
fun inverted(){
    println("Type: ")
    val num = readln()
    val stnum = num.toCharArray()
    val len = stnum.size
    val res = len -1

    var i =0
    while(i < len){
        print(stnum[res-i])
        i++
    }
}

//Exercise 02
fun add(){
    println("Type:")
    val num = readln()
    val stNum= num.toCharArray()
    val len = stNum.size

    val sus=len-1

    var i = 0
    var res = 0
    while (i<len){
        res += stNum[sus-i].digitToInt()
        i++
    }
    print("The addition of his digits are: $res")
}

//Exercise 03
fun guess(){
    val secret = 13

    println("I have a number, Can you guess?")
    var numb=readln().toInt()

    while (numb != secret){
        if(numb>secret)println("Your number is greater than") else if(numb<secret) println("Your number is less than")
        println("Try again")
        numb=readln().toInt()
    }
    println("Congrats! you did it")

}

//Exercise 04
fun factor(){
    println("Type a number")
    val num = readln().toInt()
    var i =1
    var res=num
    while(i<num){
        res *= i
        i++
    }
    println(res)
}

//Exercise 05
fun growing(){
    println("Type a number: ")
    var num = readln().toInt()

    var i=1
    var supNum = 0
    while(supNum < num){
        println("Lastest number: $supNum")
        supNum=num
        println("Actual number: $num")
        i++
        println("Type new number:")
        num= readln().toInt()
    }
    println("Numbers typed: $i")
}