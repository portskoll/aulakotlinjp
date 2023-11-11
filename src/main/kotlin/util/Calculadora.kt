package util

class Calculadora(var n1: Float,var  n2: Float) {

    fun soma() = n1 + n2
    fun subtrair() = n1 - n2
    fun produto() = n1 * n2

    fun divisao() = if (n2.toInt() != 0) n1 / n2 else "erro"

}