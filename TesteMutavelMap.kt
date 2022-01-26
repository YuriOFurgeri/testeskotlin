package me.cliente

fun main() {
    val joao = Funcionario("Joao", 1000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "CLT")
    val alex = Funcionario("Alex", 660.0, "PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(alex.nome, alex)

    println(repositorio.findById(maria.nome))

    println("----------------")
    repositorio.findAll().forEach{println(it)}

    println("----------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{println(it)}

}