package com.example.aprendendokotlindozero

fun somar(numero1: Int, numero2: Int = 0, numero3: Int = 0){
    println(numero1 + numero2)
}


fun main() {
    somar(10, 50)
    somar(numero2 = 10, numero1 = 40)
}