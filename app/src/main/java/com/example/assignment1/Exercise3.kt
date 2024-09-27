package com.example.assignment1

class Exercise3 {
    fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    val multiply : (Int, Int) -> Int = { num1, num2 -> num1 * num2 }

    fun higherOrderFunc( num1: Int, num2: Int, lambda: (Int, Int) -> Int) {
        lambda(num1, num2)
    }
}