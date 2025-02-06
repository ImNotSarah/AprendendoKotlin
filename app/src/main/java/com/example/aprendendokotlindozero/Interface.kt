package com.example.aprendendokotlindozero

interface Presedenciavel {
    fun candidatarSe()
}

abstract class Pessoa {
    fun comer() = println("Comer")
    //abstract fun candidatarSe() = println("Candidatar-se")
}

class DesenvolvedorAndroid : Pessoa(){
    fun programar() = println("programar")
}
class DesenvolvedorWeb : Pessoa(){
    fun programar() = println("programar")
}
class Jornalista : Pessoa(), Presedenciavel{
    fun escreverNoticia() = println("Escrever noticia")
    override fun candidatarSe() {
        println("Fazer o processo para se candidatar")
    }
}
class FuncionarioPublico : Pessoa(){}

fun main() {
    val desenvolvedorAndroid = DesenvolvedorAndroid()
    desenvolvedorAndroid.comer()
    println("---------")
    var jornalista = Jornalista()
    jornalista.comer()
    jornalista.candidatarSe()
}