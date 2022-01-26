package me.cliente

fun main() {
    val joao = Funcionario("Joao",1000.0, "CLT")
    val maria = Funcionario("Maria",2000.0,"CLT")
    val alex = Funcionario("Alex",660.0,"PJ")

    val funcionarios = listOf(joao,maria,alex)

    funcionarios.forEach{println(it)}

    println("-----------")
    println(funcionarios.find{ it.nome == "Maria"})

    println("-----------")
funcionarios
    .sortedBy { it.salario }
    .forEach{ println(it)}

    println("-----------")
    funcionarios
        .groupBy{ it.tipoContratacao }
        .forEach{ println(it)}


}
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
"""
     Nome: $nome
     Salario: $salario
""".trimIndent()

}

