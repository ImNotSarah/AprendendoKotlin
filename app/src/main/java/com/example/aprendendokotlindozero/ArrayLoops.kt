package com.example.aprendendokotlindozero

fun main() {
//    val nomes = arrayOf(
//        "Sarah", "Ana"
//    )
//
//    nomes[0] = "Mudou"
//    println(nomes[0])
    println("While")
    var numero = 1
    while (numero <= 5) {
        println("Executado: $numero")
        numero++
    }
    println("For")
    for (i in 3..10){
        println("Executado: $i")

    }
    val postagens = arrayOf(
        "Viagem para a praia",
        "Levei meu cachorro no veterinario",
        "Trilha com os amigos"
    )
    println("Postagens")
    for ( (indice, postagem) in postagens.withIndex()){
        println("$indice: $postagem")
    }
}