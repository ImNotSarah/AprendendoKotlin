package com.example.aprendendokotlindozero

abstract class Animal{
//    var cor : String ""
//    var tamanho = ""
//    var peso = 0.0

    open fun correr() = println("Correr como um ")
    //Você deve utilizar o dormir porque todo animal DEVE dormir
    abstract fun dormir()
}

class Cao : Animal(){
    fun latir() = println("Latir")
    override fun correr(){
        super.correr()
        println("cão de 4 patas")
    }
    override fun dormir() {
        println("Dormir como um cão")
    }
}
class Passaro : Animal(){
    fun voar() = println("Voar")
    override fun correr(){
        super.correr()
        println("passaro de 2 perninhas")
    }
    override fun dormir() {
        println("Dormir como um cão")
    }
}

fun main() {
    val animal = Animal()
    animal.correr()
    /*val cao = Cao()
    cao.correr()
    cao.latir()

    val passaro = Passaro()
    passaro.correr()
    passaro.voar()*/
}