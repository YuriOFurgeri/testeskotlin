package me.cliente

fun main() {
    val joao = Funcionario("Joao",1000.0, "CLT")
    val maria = Funcionario("Maria",2000.0,"CLT")
    val alex = Funcionario("Alex",660.0,"PJ")

    println("-----LIST-------")

    val funcionarios = mutableListOf(joao,alex)

    funcionarios.forEach{println(it)}

    println("------------")
    funcionarios.add(maria)
    funcionarios.forEach{println(it)}

    println("------------")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    println("------SET------")

    val funcionariosset = mutableSetOf(joao)
    funcionariosset.forEach{println(it)}
    println("------------")

    funcionariosset.add(alex)
    funcionariosset.add(maria)
    funcionariosset.forEach{println(it)}
    println("------------")

    funcionariosset.remove(maria)
    funcionariosset.forEach{println(it)}
}