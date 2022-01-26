package me.cliente

fun main() {
    val joao = Funcionario("Joao", 1000.0, "CLT")
    val maria = Funcionario("Maria", 2000.0, "CLT")
    val alex = Funcionario("Alex", 660.0, "PJ")

    val funcionarios1 = setOf(joao,alex)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{println(it)}

    println("----------")
    val funcionarios3 =setOf(joao,alex,maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{println(it)}

    println("----------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{println(it)}

}
