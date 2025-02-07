package com.example.aprendendokotlindozero

class Carro(var modelo: String = "", var velocidade: Int = 0){

    companion object {
        const val VELOCIDADE_MAXIMA_PERMITIDA = 120
        fun exibirVelocidadeMaxima(){
            println("A velocidade máxima é: $VELOCIDADE_MAXIMA_PERMITIDA")
        }
    }

    fun exibirInformacoes(){
        println("Informações: $modelo e $velocidade")
    }
}
class Usuario {
    companion object regras{
        fun verificarUsuarioLogado() : Boolean {
            return true
        }
    }

}

fun main() {

    Carro.VELOCIDADE_MAXIMA_PERMITIDA

    val fusca = Carro("Fusca", 100) //criando uma instancia ou objeto
    fusca.exibirInformacoes()

    val ferrari = Carro("Ferrari", 200) //criando uma instancia ou objeto
    ferrari.exibirInformacoes()

    println("PI: ${Math.PI}")
    println("--------------")

    val retorno = Usuario.regras.verificarUsuarioLogado()
    println("Usuario logado: $retorno")
}