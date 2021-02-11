
/*
   1) Programa que mueste la sumatoria de numeros enteros desde un limite inicial hasta un limite final
   2) Programa que muestre los DIVISORES de un numero dado
   3) Programa que muestre el FACTORIAL de un numero dado
   4) Programa que muestre los cocientes enteros de la division entre entre dos números dados
   5) Programa que muestre cuantos son los divisores enteros entre dos números dados
   6) Programa que muestre la conversión de un numero decimal a su representación en sistema binario.
   7)Programa que calcule a cantidad de vocales en una cadena
 */
import scala.io.StdIn._

object PruebaRecursividad {
  
  
  def main(args: Array[String]): Unit = {
    var menu=0
    while(menu<8){
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
      
    }
  }
  
}