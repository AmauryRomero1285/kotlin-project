package com.example.firstprojectinkotlin

fun main(){
    //notes()
    //week()
    //discount()
    /* println("Type number one")
     val a = readln().toInt()
     println("Type number two")
     val b = readln().toInt()
     println("Type your operator")
     val op: Char = readln().first()
     operators(numb_one = a, numb_two = b, operator = op)*/
    languages()

}

//Exercise 01
fun notes(){
    println("Type your note value")
    val note = readln().toByte()

    when (note){
        10.toByte() -> println("You have an Excellent note")
        9.toByte()-> println("You have a Good note")
        8.toByte()-> println("You have a Regular note")
        7.toByte(),6.toByte()-> println("Your note is sufficient to approve this partial")
        in 0.toByte() ..5.toByte()-> println("You not approve")
        else -> println("Your input is a invalid note. Try again")
    }
}

//Exercise 02
fun week(){
    println("Type a number to show you a week day")
    val numb_day=readln().toInt()
    val days = arrayOf("sunday","monday","tuesday","wednesday","thursday","friday","saturday",)

    when(numb_day){
        in 1..7 -> println("Select day: ${days[numb_day-1]}")
        else -> println("non-existent day")
    }
}

//Exercise 03
fun discount(){
    val client_privileges = mapOf("bronze" to 0.05,"silver" to 0.10,"golden" to 0.15,"platinum" to 0.20)
    println("Type your user status:")
    for (client in client_privileges){
        println(client.key)
    }
    val user=readln().lowercase()
    when(user){
        in client_privileges.keys -> {
            println("Discount: ${client_privileges[user]!! * 100}%")
        }
        else ->  println("Invalid user status")
    }
}

//Exercise 04
fun operators(numb_one: Int, numb_two: Int, operator: Char){

    when  (operator){
        '+'->println("Result: ${numb_one + numb_two}")
        '-'->println("Result: ${numb_one - numb_two}")
        '*'->println("Result: ${numb_one * numb_two}")
        '/'->println("Result: ${numb_one / numb_two}")
    }
}

//Exercise 05
fun languages(){
    println("Type a language code")
    val ln_code = readln().lowercase()

    when(ln_code){
        "es"-> println("You select Español")
        "en"->println("You select English")
        "fr"-> println("You select French")
        "de"-> println("You select Destuch")
        else -> {println("We don´t have avaible this language. Try with another code")}
    }
}