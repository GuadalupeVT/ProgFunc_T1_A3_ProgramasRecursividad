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
  def divisores(num:Int, div:Int, n:Int): Unit = {
    if (div <= num){
      if( (num%div) == 0){
        println("El numero "+div+" es divisor de "+num)
        divisores(num,div+1,n+1)
      }else
        divisores(num,div+1,n)
    }else{
      println("El numero de divisores es: "+n)
    }
  }
  
  //  3) Programa que muestre el FACTORIAL de un numero dado
  def factorial(inicio:Int,num:Int): Int ={
    if(num == inicio)
      inicio
    else
      num * factorial(inicio,num-1)
  }
  
  // 4) Programa que muestre los cocientes enteros de la division entre entre dos n�meros dados
  def cocientes(num1:Int, num2:Int, x:Int): Unit ={
     println(num1+"-"+num2+"="+(num1-num2))
    if((num1-num2)==0 || (num1-num2)==1)
      println("El cociente es: "+x)
    else{
      cocientes(num1-num2,num2,x+1)
    }
  }
  
  // 5) Programa que muestre cuantos son los divisores enteros entre dos n�meros dados
  def divisoresDeDosNumeros(num1:Int, num2:Int, div:Int, n:Int): Unit = {
    if (div <= num1 || div<=num2){
      if( (num1%div) == 0 && (num2%div) ==0){
        println("El numero "+div+" es divisor de "+num1+" y "+num2)
        divisoresDeDosNumeros(num1,num2,div+1,n+1)
      }else
        divisoresDeDosNumeros(num1,num2,div+1,n)
    }else{
      println("El numero de divisores es: "+n)
    }
  }
  
  // 6) Programa que muestre la conversi�n de un numero decimal a su representaci�n en sistema binario.
  def conversionBinario(num:Int): Unit = {
    if(num<2)
      print(num)
    else{
      conversionBinario(num/2)
      print(num%2)
    }
  }
  
  // 7)Programa que calcule a cantidad de vocales en una cadena
  def numVocales(cadena:String, cont:Int): Unit={
    val i=cadena.length()
    if(i>0){
      if(cadena.charAt(0)=='a' || cadena.charAt(0)=='e' || cadena.charAt(0)=='i' || cadena.charAt(0)=='o' || cadena.charAt(0)=='u')
        numVocales(cadena.substring(1),cont+1) 
      else
        numVocales(cadena.substring(1),cont)
    }else
      println("El numero de vocales en la palabra es: "+cont)
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
      println("4) Cocientes enteros de la division entre entre dos n�meros")
      println("5) Divisores enteros entre dos n�meros")
      println("6) Conversi�n de un numero decimal a sistema binario")
      println("7) Cantidad de vocales de una palabra")
      println("8) Salir")
      menu = readInt()
      
      //Evaluacion de las opciones
      
      //Opcion sumatoria con limites
      if(menu==1){
        println("Ingresa el limite inicial: ")
        val limInicial=readInt()
         println("Ingresa el limite final: ")
        val limFinal=readInt()
        println("Resultado de la sumatoria: " + sumatoriaConLimite(limInicial,limFinal))
      }
      
      //Opcion divisores
      if(menu ==2){
        println("Ingresa un numero para calcular divisores: ")
        val num=readInt()
        divisores(num,1,0)
      }
      
      //Opcion factorial
      if(menu ==3){
        println("Ingresa un numero para calcular factorial: ")
        val num=readInt()
        println("Resultado: "+factorial(1,num))
      }
      
      //Opcion cocientes
      if(menu ==4){
        println("Ingresa un dividendo: ")
        val num1=readInt()
        println("Ingresa un divisor: ")
        val num2=readInt()
        cocientes(num1,num2,1)
      }
      
      //Cuantos divisores entre dos numeros enteros
      if(menu == 5){
        println("Ingresa un dividendo: ")
        val num1=readInt()
        println("Ingresa un divisor: ")
        val num2=readInt()
        divisoresDeDosNumeros(num1,num2,1,0)
      }
      
      //Opcion conversion binario
      if(menu == 6){
        println("Ingresa un numero decimal: ")
        val num=readInt()
        println("La conversion a binario es: ")
        conversionBinario(num)
        println()
      }
      
      //opcion numero de vocales en una cadena
      if(menu == 7){
        println("Ingresa una cadena: ")
        val cadena=readLine()
        numVocales(cadena,0)
      }
      
      
    }
  }
  
}