package com.example.firstprojectinkotlin
fun main(){
    //Exercise One
    println("Hi,\n My name is Amaury \n Just now I'm learnin' Kotlin")

    println("Now, type your personal data.\n Age:")
    //Exercise Two & Three
    val ages: Int = readln().toInt()
    println("Full Name:")
    val name: String = readln()
    println("Height:")
    val height: Double =readln().toDouble()
    println("Occupation:")
    val occ: String =readln()
    val status: Boolean = if (occ.lowercase() == "student") true else false
    //Exercise Four
    println("Tell me. Do you like Kotlin?\n y/n")
    val kot: String=readln()
    val like: Boolean = if(kot.lowercase()=="y") true else false

    println("It's cool, now type two numbers to calcualte the area of a rectangule\n Base:")
    val base: Double= readln().toDouble()
    println("Height:")
    val hgt: Double =readln().toDouble()
    rectangulo(base=base,height=hgt)
    personalData(name=name,age=ages, height=height, occupation=status, Kot=like)
}
fun personalData(name: String, age: Int, height:Double, occupation:Boolean, Kot: Boolean){
    val Cleaname: String = name.trim()
    val firstWord: Char = Cleaname[0]
  println(" Your info are:\n Fullname: $name.\n Age: $age.\n Height: $height. \n Student: $occupation. \n Like Kotlin: $Kot. \nFun fact: Your name start with the word : $firstWord" )
}
fun rectangulo(base: Double, height: Double) {
    println("Rectangle area = ${base * height}")
    when {
        base > height -> println("The base is larger than the height")
        height > base -> println("The height is larger than the base")
        else -> println("The sides are equals")
    }
}
