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
    while (x < 6){
        x++;
        println(x);
    }
    x = 3;
    println("Decremento")
    while (x > 0){
        x--;
        println(x);
    }
    x = 0;
}



