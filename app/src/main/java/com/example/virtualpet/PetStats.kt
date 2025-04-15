package com.example.virtualpet

object PetStats {
    var health = 100
    var happiness = 100
    var energy = 100

    fun feed() {
        health = (health + 10).coerceAtMost(100)
        energy = (energy - 5).coerceAtLeast(0)
    }

    fun play() {
        happiness = (happiness + 10).coerceAtMost(100)
        energy = (energy - 10).coerceAtLeast(0)
    }

    fun sleep() {
        energy = (energy + 20).coerceAtMost(100)
        happiness = (happiness - 5).coerceAtLeast(0)
    }

    fun decay() {
        health = (health - 1).coerceAtLeast(0)
        happiness = (happiness - 1).coerceAtLeast(0)
        energy = (energy - 1).coerceAtLeast(0)
    }
}
