package venda

class Produto(var nome: String, var preco: Float,var  estoque: Int) {
    fun disponivel(qtde: Int) = estoque > qtde
}