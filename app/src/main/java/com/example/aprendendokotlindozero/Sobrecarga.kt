package com.example.aprendendokotlindozero

class Usuario {
    fun logar(email: String, senha: String){//Assinatura = nome+parametros+tipos
        println("Usuario logado com email: $email e senha: $senha")
    }
    fun logar(numeroTelefone: String){
        println("Usuario logado com telefone: $numeroTelefone")

    }
}

fun main() {
    val usuario = Usuario()
    usuario.logar("s@gmail.com", "1234")
    usuario.logar("1100008888")
}