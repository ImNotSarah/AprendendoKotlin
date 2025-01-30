package com.example.aprendendokotlindozero

fun main() {
//    val notaAluno = 7
//    val condicao = notaAluno >= 6

    val opcao = 4

//    if ( opcao == 1 ){
//        println("Cartão de crédito")
//    }else if( opcao == 2 ){
//        println("Extrato bancário")
//    } else if (opcao == 3){
//        println("Saldo")
//    } else{
//        println("Nenhuma opção selecionada")
//    }

    if(opcao in 1..3){
        println("Opções selecionadas: 1, 2, 3")
    }else if(opcao in 4..8){
        println("Opções selecionadas: 4 até 8")
    }

    when(opcao){
        1 -> println("Cartao de crédito")
        2 -> println("Extrato bancario")
        in 3..5 -> println("Saldo")
        else -> print("Nenhuma opção selecionada")
    }
}