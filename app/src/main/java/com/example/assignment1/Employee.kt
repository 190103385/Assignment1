package com.example.assignment1

import java.math.BigDecimal
import com.example.assignment1.Person

class Employee: Person() {
    val salary: BigDecimal = BigDecimal.ZERO

    override fun displayInfo(): String {
        return super.displayInfo() + ", salary: $salary"
    }
}