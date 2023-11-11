package venda

open class Cliente (var renda: Float, nome: String, telefone: String, cpf: String, idade: Int ): Pessoa(nome, telefone, cpf, idade) {
    open fun aprovacao() = renda > 1000
}