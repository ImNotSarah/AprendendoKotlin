package com.example.aprendendokotlindozero

class Jogador {
    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar(aceleracao: Int){
        println("Acelerar na velocidade: $aceleracao")
    }

    fun retornaPOder(): String = "Casco vermelho"
}

fun main() {
    val jogador = Jogador() //Instancia de objeto
    jogador.kart = "Kart do Mario"
    println(jogador.kart)
    jogador.acelerar(80)

    val poder = jogador.retornaPOder()
    print(poder)



}