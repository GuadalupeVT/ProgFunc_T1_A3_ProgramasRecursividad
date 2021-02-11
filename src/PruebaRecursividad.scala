
/*
  
   4) Programa que muestre los cocientes enteros de la division entre entre dos números dados
   5) Programa que muestre cuantos son los divisores enteros entre dos números dados
   6) Programa que muestre la conversión de un numero decimal a su representación en sistema binario.
   7)Programa que calcule a cantidad de vocales en una cadena
 */
import scala.io.StdIn._

object PruebaRecursividad {
  
  // 1) Metodo para la sumatoria de numeros enteros desde un limite inicial hasta un limite final
  def sumatoriaConLimite(limiteInicial:Int, limiteFinal:Int): Int ={
    if(limiteFinal == limiteInicial)
      limiteInicial
    else
      limiteFinal + sumatoriaConLimite(limiteInicial,limiteFinal-1)
  }
  
  // 2) Metodo que muestre los DIVISORES de un numero dado
  def divisores(num:Int, div:Int): Unit = {
    if (div <= num){
      if( (num%div) == 0){
        println("El numero "+div+" es divisor de "+num)
        divisores(num,div+1)
      }else
        divisores(num,div+1)
    }
  }
  
  //  3) Programa que muestre el FACTORIAL de un numero dado
  def factorial(inicio:Int,num:Int): Int ={
    if(num == inicio)
      inicio
    else
      num * factorial(inicio,num-1)
  }
  
 
  
  
  def main(args: Array[String]): Unit = {
    var menu=0
    while(menu<8){
      //Impresion de menu
      println("-----------------MENU-------------")
      println("Selecciona una opcion...")
      println("1) Sumatoria de numeros de un limite inicial a un limite final")
      println("2) Divisores de un numero")
      println("3) Factorial de un numero")
      println("4) Cocientes enteros de la division entre entre dos números")
      println("5) Divisores enteros entre dos números")
      println("6) Conversión de un numero decimal a sistema binario")
      println("7) Cantidad de vocales de una palabra")
      println("8) Salir")
      menu = readInt()
      
      //Evaluacion de las opciones
      
      //Opcion 1
      if(menu==1){
        println("Ingresa el limite inicial: ")
        val limInicial=readInt()
         println("Ingresa el limite final: ")
        val limFinal=readInt()
        println("Resultado de la sumatoria: " + sumatoriaConLimite(limInicial,limFinal))
      }
      
      //Opcion 2
      if(menu ==2){
        println("Ingresa un numero para calcular divisores: ")
        val num=readInt()
        divisores(num,1)
      }
      
      //Opcion 3
      if(menu ==3){
        println("Ingresa un numero para calcular factorial: ")
        val num=readInt()
        println("Resultado: "+factorial(1,num))
      }
      
      
    }
  }
  
}