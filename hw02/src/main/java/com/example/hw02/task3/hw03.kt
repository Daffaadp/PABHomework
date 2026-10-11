package com.example.hw02.task3


fun main() {
    // Part A: Perulangan untuk semua hari menggunakan rentang (1..numberOfDays)
    val numberOfDays = 5

    for (day in 1..numberOfDays) {
        println("Day $day: Study for 20 minutes")
    }

    println()

    // Part B: Perulangan dengan step 2 untuk hari ke-1, 3, dan 5
    for (day in 1..numberOfDays step 2) {
        println("Day $day: Study for 20 minutes")
    }
}