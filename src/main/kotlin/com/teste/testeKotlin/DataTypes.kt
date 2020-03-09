package com.teste.testeKotlin

var language = "Japanese"
val score = 100

//Language = 10 Will compile an error

fun main() {
    System.out.println("Language = " + language + ", Score = " + score);
}

fun printByte() {
    val range: Byte = 112;
    println("$range")
}

//Cannot be used the Float class to the Float, instead we use the: 'number'F, like: 14F, will treat that like a float

fun printFloat() {
    val distance = 23523567345646346346666666666666665F;
    println("$distance")
}