package com.example.dice_roller

class Dice(private val numSides: Int) {
    fun roll() = (1..numSides).random()
}
