package com.example.assignment1

open class Person {
    val name: String = "Nurdaulet"
    val age: Int = 18
    var email: String? = null

    open fun displayInfo(): String {
        return "Name: $name, age: $age, email: ${email ?: "Doesn't have email"}"
    }
}