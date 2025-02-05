package com.example.aprendendokotlindozero

open class Animal{
//    var cor : String ""
//    var tamanho = ""
//    var peso = 0.0

    open fun correr() = println("Correr como um ")
    fun dormir() = println("Dormir")
}

class Cao : Animal(){
    fun latir() = println("Latir")
    override fun correr(){
        super.correr()
        println("cão de 4 patas")
    }
}
class Passaro : Animal(){
    fun voar() = println("Voar")
    override fun correr(){
        super.correr()
        println("passaro de 2 perninhas")
    }
}

fun main() {
    val cao = Cao()
    cao.correr()
    cao.latir()

    val passaro = Passaro()
    passaro.correr()
    passaro.voar()
}