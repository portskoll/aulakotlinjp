package venda

fun vender (){
    val p1 = Pessoa("Fabio","33224567", "178.789.985-12", 45)
    val p2 = Pessoa("Joaquim", "223456984", "134.789.453-23", 60)
    val c1 = Cliente(2000F, p1.nome, p1.telefone, p1.cpf, p1.idade)
    val v1 = Vendedor(2300F, p2.nome, p2.telefone, p2.cpf, p2.idade)
    val produto1 = Produto("Relogio", 234.0F, 5)
    val venda1 = Venda(c1,v1,produto1)
    venda1.possoVender(6);

}

open class Venda(var cliente: Cliente, var vendedor: Vendedor, var produto: Produto) {
   open fun possoVender(qtde: Int) {
        if (cliente.aprovacao() && produto.disponivel(qtde) && vendedor.ativo && vendedor.apto.equals("sim")) {
            print("Venda de ${qtde} x ${produto.nome} que custa ${produto.preco}  no valor total de ${produto.preco * qtde}  ")
        }else{
            print("Esta venda foi negada")
        }

    }
}

