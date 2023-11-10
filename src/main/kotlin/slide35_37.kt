/*vamos criar uma extrutura de decisão if - else if - else para verificar se um
aluno foi aprovado reprovado ou de recuperação m*/

//pegando a nora do aluno

fun main() {
    situacaoAluno();
}


//extruturas de decisão

fun situacaoAluno() {

    print("Digite a nota do aluno: ")
    val entrada = readlnOrNull()

    val nota = entrada?.toInt()

    var resultado = ""

    if (nota != null) {
        if (nota >= 6) {
            resultado = "Aprovado";
        } else if (nota < 4) {
            resultado = "Reprovado";
        } else {
            resultado = "Recuperação"
        }

        println(resultado)
    }
//outra maneira
    if (nota != null) {
        resultado = if (nota >= 6) {
            "Aprovado";
        } else if (nota < 4) {
            "Reprovado";
        } else {
            "Recuperação"
        }

        println(resultado)
    }
    //outra maneira

    if (nota != null) {
        if (nota >= 6)
            println("Aprovado");
        else if (nota < 4)
            println("Reprovado");
        else
            println("Recuperação")
    }
//outra maneira
    if (nota != null) {
        println(if (nota >= 6)
            "Aprovado"
        else if (nota < 4)
            "Reprovado"
        else
            "Recuperação")
    }

    //maneira mais curta
    if (nota != null) {
        println(if (nota >= 6) "Aprovado" else if (nota < 4) "Reprovado" else "Recuperação")
    }
}
