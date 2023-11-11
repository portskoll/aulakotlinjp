import util.Calculadora
import java.lang.NumberFormatException
import kotlin.math.roundToInt

/*
criando um pacote util
classe calculadora
sobrecarga
cast
smart cast
exceções
 */

fun main() {
    var r: Any = "s"
    var n1: String = ""
    var n2: String = ""
    var soma: Float = 0F
    var subtracao: Float = 0F
    var multiplicao: Float = 0F
    var divisao: Any = ""
    do {
        try {
            print("Digite s para sair \n 1- somar \n 2- subtrair \n 3- multiplicar \n 4- dividir \n ou qualquer letra para continuar\n >> ")
            r = readln()

            if (r == "s"){
                break
            }else{
                println()
                print("Digite um valor: ")
                n1 = readln()
                println()
                print("Digite um valor: ")
                n2 = readln()
                val calcular = Calculadora(n1.toFloat(),n2.toFloat())
                soma = calcular.soma()
                subtracao = calcular.subtrair()
                multiplicao = calcular.produto()
                divisao = when(calcular.divisao()){
                    is String -> " ${calcular.divisao()} divisão por zero"
                    is Float -> calcular.divisao()
                    else -> "Sei não"
                }


            }
        }catch (e: NumberFormatException){
            println("Numero, invalido.. Tente novamente")
        }finally {
            if (r.equals("1")){
                println("O valor da soma é $soma")
            }
            if (r.equals("2")){
                println("O valor da subtracao é $subtracao")
            }
            if (r.equals("3")){
                println("O valor da multiplicao é $multiplicao")
            }
            if (r.equals("4")){
                println("O valor da divisao é $divisao")
            }
            else{
                println("Digitou $n1 e $n2")
            }

        }

    }while (r != "s")
}