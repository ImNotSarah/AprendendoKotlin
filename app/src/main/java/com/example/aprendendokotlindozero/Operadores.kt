package com.example.aprendendokotlindozero

fun main() {
    val n1 = 10
    val n2 = 20

    val resultado = 2+ 2 * 2
    println(resultado)

    var resul = 2 > 5
    println(resul)

    resul = 5 == 5
    println(resul)

    resul = 5 != 6
    println(resul)

    resul = 5 >= 4
    println(resul)

    println("Operadores logicos")

    var logico = 2 > 1 && 4 == 3
    println(logico)

    logico = 2 > 1 || 4 == 3
    println(logico)

    println(!logico)

    println("-=--=-=--=-=-=-=-=")

    val idadePessoa = 30
    val comprasPessoa = 300
    logico = idadePessoa >= 50 && comprasPessoa >= 400
    println(logico)
}