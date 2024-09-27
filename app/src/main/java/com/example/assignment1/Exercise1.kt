package com.example.assignment1

class Exercise1 {
    var num1: Int = 1
    var num2: Double = 1.0
    var word: String = "Hello, World!"
    var condition: Boolean = true
    var numbers: List<Int> = emptyList()

    fun main() {
        println("Integer: $num1, double: $num2, string: $word, boolean: $condition")

        for (number in numbers) {
            println(number)
        }
    }
}

fun isPositive(num: Int): Boolean {
    return if (num > 0) true
    else if (num < 0) false
    else throw Exception("Zero")
}
