package venda

open class Pessoa(var nome: String = "", var telefone: String = "", var cpf: String = "", var idade: Int = 0) {


    override fun toString(): String {
        return "$nome, $telefone, $cpf, $idade"
    }
}