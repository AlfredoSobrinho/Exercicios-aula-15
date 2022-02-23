import java.lang.Math.sqrt
import kotlin.math.pow

fun main() {

    // exercicio 1
    /*Faça um programa que receba três
     inteiros e diga qual deles é o maior.

    print("DIGITE O PRIMEIRO NUMERO: ")
    val num1= readLine()!!.toInt()
    print("DIGITE O SEGUNDO NUMERO: ")
    val num2= readLine()!!.toInt()
    print("DIGITE O TERCEIRO NUMERO: ")
    val num3= readLine()!!.toInt()

    var local = num3

    if(num1 > local) {
        local = num1

    }else if (num2 > local) {
        local = num2
    }
    else{local=num3}

    println("o numero maior é : $local")
*/





//Exercicio 5
    //Faça um programa que o usuário digite um número
    // e o programa retorne o mês referente ao valor.

/*
    println(
        "DIGITE UM NUMERO DE 1 A 12 REFERENTE " +
                "AO MÊS DO ANO A SER MOSTRADO:"
    )
    val mes = readLine()!!.toInt()

    when (mes) {

        1 -> println("O mês referente ao numero é janeiro")
        2 -> println("O mês referente ao numero é Fevereiro")
        3 -> println("O mês referente ao numero é Março")
        4 -> println("O mês referente ao numero é Abril")
        5 -> println("O mês referente ao numero é Maio")
        6 -> println("O mês referente ao numero é Junho")
        7 -> println("O mês referente ao numero é Julho")
        8 -> println("O mês referente ao numero é Agosto")
        9 -> println("O mês referente ao numero é Setembro")
        10 -> println("O mês referente ao numero é Outubro")
        11 -> println("O mês referente ao numero é Novembro")
        12 -> println("O mês referente ao numero é Dezembro")


        else -> println("Mês invalido")
/*



        //exercicio 2
        Faça um programa que entre com três
        números e coloque em ordem crescente.


    print("DIGITE O PRIMEIRO NUMERO: ")
    val num1= readLine()!!.toInt()
    print("DIGITE O SEGUNDO NUMERO: ")
    val num2= readLine()!!.toInt()
    print("DIGITE O TERCEIRO NUMERO: ")
    val num3 = readLine()!!.toInt()


    if (num1<num2&&num1<num3&&num2<num3){
        println("$num1 - $num2 - $num3")

    } else if (num1<num3&&num1<num2&&num3<num2){
        println("$num1- $num3 - $num2")}

    else if (num2<num1&&num2<num3&&num1<num3){
        println("$num2- $num1 - $num3")}

    else if (num2<num3&&num2<num1&&num3<num1){
        println("$num2- $num3 - $num1")}

    else if (num3<num1&&num3<num2&&num1<num2){
        println("$num3- $num1 - $num2")}

    else{ println("$num3 - $num2 - $num1")}

     */


    }

*/


    //Exercicio 3
    //    3- Faça um programa que receba a idade de uma
    //       pessoa e mostre na saída em qual categoria ela se encontra:
    //    • 10-14 infantil
    //    • 15-17 juvenil
    //    • 18-25 adulto

/*
    print("DIGITE SUA IDADE: ")
    val idade = readLine()!!.toInt()


    when(idade){

        in 10..14 -> print("sua categoria é infantil")
        in 15..17 -> print("sua categoria é Juvenil")
        in 18..25 -> print("sua categoria é Adulto")

        else -> println("idade invalida")
    }

 */


    //Exercicio 4
    //Faça um programa em que permita a entrada de um número qualquer e
    // exiba se este número é par ou ímpar. Se for par exiba também a raiz
    // quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.


    println("DIGITE UM NUMERO QUALQUER:  ")
    val num = readLine()!!.toDouble()

    if ((num % 2 == 0.0) && (num % 3 != 0.0)) {
        println("O NUMERO DIGITADO FOI: $num " +
                "E SUA RAIZ QUADRADA É:  ${sqrt(num)}")

    } else
        println("O NUMERO DIGITADO FOI: $num O NUMERO ELEVADO AO QUADRADO É: ${num.pow(2)}")

}
 













