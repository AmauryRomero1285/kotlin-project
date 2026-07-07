package com.example.firstprojectinkotlin

fun main(){
ex2()
}

fun explication(){
    val subs =mutableListOf("Math", "Physic", "Programming")
    println(subs[0])
    println("-----------")
    subs.add(2,"Spanish")
    println(subs)
    println("-----------")
    for (sub in subs){
        println(sub)
    }
    println("-----------")
    subs[1]="English"
    for (sub in subs){
        println(sub)
    }
    println("-----------")
    println(subs.indexOf("Programming"))
}
fun names(){
    val names =mutableListOf<String>()
    do{
        println("Type a number to select an option \n Options: \n 1. Save new name \n 2. Search \n 3. Update \n 4. Show all \n 0 = Exit")
        val option = readln().toInt()
        when(option){
            1 ->{
                println("Type a new name")
                names.add(readln())
            }
            2 -> {
                println("Type to search")
                val name = readln()
                if(names.contains(name))println("$name is an existent name")else println("$name isn't an existent name")
            }
            3 -> {
                println("Type the name to update")
                val name =readln()
                if(names.contains(name)){
                    println("Type a new name to update")
                    names[names.indexOf(name)] =readln()
                } else{
                    println("The name don't exist")
                }
            }
            4 -> {
                names.forEach { sub ->
                    println(sub)
                }
            }
        }
    }while(option!=0)
}

//Exercise 01
fun ex1(){
    val score = arrayOf(100,90,80,70,60,50,40,30)
    println("Everyone of scores:")
    score.forEach { vals -> println(vals) }
    println("----- \nAverage of all scores:")
    var sum = 0
    score.forEach { values ->
         sum += values
    }
    println(sum/score.size)
    println("----- \nMinor and Major scores:")
    val minor = score.minOrNull()
    val major = score.maxOrNull()

    println("Minor score: $minor")
    println("Major score: $major")

    println("----- \nApproval scores:")
    score.forEach { values  -> if (values >= 70) println(values) }
}

//Exercise 02
fun ex2(){
    val products =mutableListOf<String>()
    do{
        println("Type a number to select an option \n Options: \n 1. Register a product \n 2. Delete a product \n 3. Update a product  \n 4. Show all & amounts of \n 0 = Exit")
        val option = readln().toInt()
        when(option){
            1 ->{
                println("Type a new product")
                products.add(readln())
            }
            2 -> {
                products.forEachIndexed { index, sub ->
                    println("${index + 1} .- $sub")
                }
                println("Type to delete")
                val name = readln()
                if(products.contains(name))products.remove(name) else println("$name isn't an existent name")
            }
            3 -> {
                println("Type the name to update")
                val name =readln()
                if(products.contains(name)){
                    println("Type a new name to update")
                    products[products.indexOf(name)] =readln()
                } else{
                    println("The name don't exist")
                }
            }
            4 -> {
                var ind = 0
                products.forEachIndexed { index, sub ->
                    println(sub)
                    ind = index
                }
                if (products.isEmpty())println("Counts: $ind") else println("Counts: ${ind+1}")
            }
        }
    }while(option!=0)
}