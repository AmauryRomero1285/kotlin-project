package com.example.firstprojectinkotlin

fun main() {
    //invert()
    //addition()
    //guessing()
    //fact()
    grow()
}

//Exercise 01
fun invert() {
    println("Type: ")
    val num = readln()
    val stnum = num.toCharArray()
    val len = stnum.size
    val res = len - 1

    var i = 0
    if (len > 0) {
        do {
            print(stnum[res - i])
            i++
        } while (i < len)
    }
    println()
}

//Exercise 02
fun addition() {
    println("Type:")
    val num = readln()
    val stNum = num.toCharArray()
    val len = stNum.size
    val sus = len - 1

    var i = 0
    var res = 0
    if (len > 0) {
        do {
            res += stNum[sus - i].digitToInt()
            i++
        } while (i < len)
    }
    println("The addition of his digits are: $res")
}

//Exercise 03
fun guessing() {
    val secret = 13
    println("I have a number, Can you guess?")
    var numb: Int

    do {
        numb = readln().toInt()
        if (numb > secret) {
            println("Your number is greater than")
            println("Try again")
        } else if (numb < secret) {
            println("Your number is less than")
            println("Try again")
        }
    } while (numb != secret)

    println("Congrats! you did it")
}

//Exercise 04
fun fact() {
    println("Type a number")
    val num = readln().toInt()
    var i = 1
    var res = num

    if (num > 1) {
        do {
            res *= i
            i++
        } while (i < num)
    }
    println(res)
}

//Exercise 05
fun grow() {
    println("Type a number: ")
    var num = readln().toInt()

    var i = 0
    var supNum = 0

    do {
        println("Lastest number: $supNum")
        supNum = num
        println("Actual number: $num")
        i++
        println("Type new number:")
        num = readln().toInt()
    } while (supNum < num)

    println("Numbers typed: $i")
}
