package com.example.firstprojectinkotlin

fun main(){
    pyramid()
}

//Exercise 01
fun palindrome() {
    println("Type a word")
    val palindrome = readln().lowercase()
    val clean = palindrome.replace(" ", "")
    val chars = clean.toCharArray()

    var isPalindrome = true

    for (i in 0 until chars.size) {
        if (chars[i] != chars[chars.size - 1 - i]) {
            isPalindrome = false
            break
        }
    }

    if (isPalindrome) {
        println("True")
    } else {
        println("False")
    }
}


//Exercise 02
fun files(){
    println("Type a size of a triangle")
    val size=readln().toInt()

    for (i in 1 .. size){
        for(j in 1..i){
            print("*")
        }
        println()
    }
}

// Exercise 03
fun numbers(){
    println("Type a size of a triangle")
    val size=readln().toInt()

    for (i in 1 .. size){
        for(j in 1..i){
            print(j)
        }
        println()
    }
}


//Exercise 04
fun prime() {
    println("Type a number to check:")
    val number = readln().toInt()

    if (number <= 1) {
        println("$number is not a prime number.")
        return
    }
    var isPrime = true

    for (i in 2 until number) {
        if (number % i == 0) {
            isPrime = false
            break
        }
    }

    if (isPrime) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}

//Exercise 05
fun potential(){
    println("Type your base number")
    val base=readln().toInt()
    println("Type your exponential number")
    val expo=readln().toInt()

    var res=1

    for (i in 1 .. expo){
        res = base * res
    }
    print("Result is $res")
}

//Exercise 06
fun pyramid() {
    println("Type the height of the pyramid")
    val num = readln().toInt()

    for (i in 1..num) {
        for (j in 1..num - i) {
            print("-")
        }
        for (k in 1..((2 * i) - 1)) {
            print("*")
        }
        println()
    }
}
