fun main () {
souUmaString();

}

val texto = "Hoje está muito calor"

fun souUmaString (){

    // criando uma lista de string


    val lista = texto.split(" ");
    println("Texto  : $texto")
    println("pegando uma letra da string texto.get(3) : ${texto.get(3)}");
    println("pegando uma letra da string texto.[3] : ${texto[3]}");
    // pegando um pedaço da lista
    println("verificando se uma string é igual:   ${lista[3].equals("calor")}" );
    println("Tranformando o Texto em letra Maiuscula - uppercase:   ${texto.uppercase()}" );
    println("Tranformando o Texto em  Minuscula - lowercase:   ${texto.lowercase()}" );
    println("Contando a quantidade de caracteres no Texto - length :   ${texto.length}" );
    println("O texto começa com ? - startWith :   ${texto.startsWith("H")}" );
    println("O Texto termina com ? - endsWith :   ${texto.endsWith("r")}" );
    println("Pegando uma sustring do Texto, vou pegar muito :   ${texto.substring(10,15)}" );
    println("Buscando um texto no Texto, buscando calor  :   ${texto.contains("calor")}" );
    println("trocando um pedaço do texto, trocando calor por frio  :   ${texto.replace("calor", "frio")}" );
    println("Texto normal : $texto")
    println("Concatenando um texto, veja alguns modos :")
    println(texto + ", e tá dificil");
    println("Estamos aqui e ${texto.lowercase()}");
    val texto2 = "amanha também"
    println("$texto $texto2");


}