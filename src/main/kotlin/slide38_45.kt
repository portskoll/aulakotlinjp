/* aqui estaremos abordando exemplo de :
    WHEN - VETORES - ORDENAÇÃO - LACOS DE REPETIÇÃO
    PESQUISA EM VETORES E RANGES
 */

fun main (){
    dados()

}

val UF= arrayOf("RO","AC","AM","RR","PA","AP","TO","MA","PI","CE","RN","PB","PE","AL","SE","BA","MG","ES","RJ","SP","PR","SC","RS","MS","MT","GO","DF")

// listas e arrays

fun dados () {
    // vamos pegar 5 dados
    var i = 1;
    val lista = ArrayList<String>()
    val lista_original = ArrayList<String>()

    println("digite 5 UF do Brasil pode ser em letras minusculas - exemplos : SP-RJ-TO-MA-BA-MG-CE:")
    while (i < 6) {

        print("digite um UF do Brasil, aperte <ENTER> : ")
        val dado = readlnOrNull();
        dado?.let { lista.add(it.uppercase()) } // adicionando um dado na lista
        dado?.let { lista_original.add(it.uppercase()) } // adicionando um dado na lista
        i++

    }
    print("voce digitou : $lista")

    lista.sort()
    println("Vamos ordenar lista : ${lista}")
    lista.sortDescending()
    println("Vamos ordenar em ordem inversa esta lista : ${lista}")
    println("verificando se os UFs existem :")
    for (uf in lista){
        if (uf in UF){
            println("$uf Encontrado")
        }else {
            println("$uf Não Encontrado")
        }
    }
    fun alfabeto (): ArrayList<Char> {
        val alfa = ArrayList<Char>()
        for (i in 'a' .. 'z') alfa.add(i)
        return alfa
    }

    println("Imprimindo o alfabeto ${alfabeto()}")

    // na maioria das linguagens existe o switch : case no Kotlin existe o when
    //vamos ver como usar

    // vamos descobrir se o primeiro UF que vc digitou é da região Norte, Sudoeste ou outra região

    val estado = lista[0]

    val resultado = when (estado) {
        "RO","AC","AM","RR","PA","AP","TO" -> "Norte"
        "MG","ES","RJ","SP" -> "Sudoeste"
        else -> "Outra Região"
    }

    print("O Primeiro UF digitado é ${lista_original[0]} e pertence a região $resultado")


}