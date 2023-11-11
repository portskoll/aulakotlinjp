package venda;

open class Vendedor (var salario: Float, nome: String, telefone: String, cpf: String, idade: Int ): Pessoa(nome, telefone, cpf, idade) {
    val apto = if (idade < 65) "sim" else "não"
    val ativo = true
}
