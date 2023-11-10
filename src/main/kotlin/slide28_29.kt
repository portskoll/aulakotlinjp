/*
Operador    Descrição                   Exemplo
+           Adição                      var a = x + y
-           Subtração                   var a = x - y
*           Multiplicação               var a = x * y
/           Divisão                     var a = x / y
%           Módulo (resto da divisão)   var a = x % y
++          Incremento de 1             x++
--          Decremento                  x--
+=          Incremento de N             x+=2
-=          Decremento de N             x-=2
*=          Substituição pelo produto   x*=2
/=          Substituição pela divisão   x/=2
%=          Substituição pelo módulo    x%=2

 */

// alguns exemplos

fun main() {

    var x = 3;
    println("Incremento")
    while (x < 6) {
        x++;
        println(x);
    }
    x = 3;
    println("Decremento")
    while (x > 0) {
        x--;
        println(x);
    }
    x = 0;
    println("Incremento de 3")
    while (x < 10) {
        x += 3;
        println(x);
    }

    println("Decremento de 3")

    while (x > 0) {
        println(x);
        x -= 3;

    }

    x = 11;
    println("Substituição pelo módulo de 2")

    x %= 2;
    val a = 11 % 2
    println(x);
    println(a);

}
// uama curiosidade sobre modulo
/*
Claro, aqui estão os passos para calcular o resto da divisão de 11 por 2:


Primeiro, você divide 11 por 2. O resultado dessa divisão é 5, porque 2 cabe 5 vezes em 11. Isso é expresso como 211​=5.


Em seguida, você multiplica o quociente (5) pelo divisor (2). O resultado é 10. Isso é expresso como 5 × 2 = 10.


Agora, você subtrai esse resultado (10) do dividendo original (11).
 O resultado dessa subtração é o resto da divisão. Isso é expresso como 11 − 10 = 1.


Portanto, o resto da divisão de 11 por 2 é 1. Isso também pode ser expresso como 11 mod 2 = 1.

Espero que isso ajude! 😊
 */



