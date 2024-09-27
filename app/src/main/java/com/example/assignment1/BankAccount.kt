package com.example.assignment1

import java.math.BigDecimal

class BankAccount() {
    private var balance: BigDecimal = BigDecimal.ZERO

    fun deposit(sum: BigDecimal) {
        balance += sum
    }

    fun withdraw(sum: BigDecimal) {
        if (balance - sum < BigDecimal.ZERO) throw Exception("Insufficient funds")
        else balance -= sum
    }
}
