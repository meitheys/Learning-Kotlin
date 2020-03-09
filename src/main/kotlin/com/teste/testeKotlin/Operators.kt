package com.teste.testeKotlin

/*

+	Addition (also used for string concatenation)
-	Subtraction Operator
*	Multiplication Operator
/	Division Operator
%	Modulus Operator

*/

fun main() {

    val number = 12.5
    val notherNumber = 3.5
    var result: Double

    result = number + notherNumber
    println("X + Y =  $result")

    result = number - notherNumber
    println("X - Y =  $result")

    result = number * notherNumber
    println("X * Y =  $result")

    result = number / notherNumber
    println("X / Y =  $result")

    result = number % notherNumber
    println("X % Y =  $result")

    /*

    	greater than	a > b	a.compareTo(b) > 0
        <	less than	a < b	a.compareTo(b) < 0
        >=	greater than or equals to	a >= b	a.compareTo(b) >= 0
        <=	less than or equals to	a < = b	a.compareTo(b) <= 0
        ==	is equal to	a == b	a?.equals(b) ?: (b === null)
        !=	not equal to	a != b	!(a?.equals(b) ?: (b === null))

    */

    //Using 'In' to check if a value belongs to some collection

    val numbers = intArrayOf(1, 4, 42, -3)

    if(4 in numbers){
        println("\n It contains")
    }else{
        println("\n Doesn't contains")
    }
}