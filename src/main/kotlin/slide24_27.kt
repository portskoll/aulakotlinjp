// criando a função principal

fun main() {
    //abaixo chamarei vaias funções
    tipoDeDados("Tipo de dados abaixo:");
}

// declarando uma variavel
var a = 1;
var b = 3;
// declaração de constantes
val x = 3;
//val x = 5; não pode fzer isso

/* as variáveis podem ser alteradas
 as contantes não.
 */



fun tipoDeDados(texto : String) {
    a = 5;
    b =10;
    val c : Int = 50;
    println("A+B = ${a+b+c+x}" )
    //alguns tipos de dados:
    val numeroInteiro = 4 // Int
    val numeroDouble = 7.8 // Double
    val umaLetra = 's' // Char
    val umBoolean = true // Boolean
    val umTexto = "Kotlin é legal" // String

    //Imprimindo os tipos de dados:
    println(texto);
    println("Valor inteiro $numeroInteiro tipo: Int");
    println("Valor Double $numeroDouble tipo: Double");
    println("Uma letra $umaLetra tipo: Char");
    println("um boolean $umBoolean tipo: Boolean");
    println("Um texto $umTexto tipo: String")


}