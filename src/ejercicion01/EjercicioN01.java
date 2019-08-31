/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicion01;
import java.util.*;


import java.time.Clock;

/**
 *
 * @author s109e4
 */
public class EjercicioN01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirNombre();
        
        Scanner miScanner = new Scanner (System.in);
        
        System.out.print("Ingrese el numero uno para realizar las operaciones:"); 
        double numeroUno = miScanner.nextDouble();
        System.out.println("El dato ingresado es:"+ numeroUno); 
        
        double resultadoSuma = sumarNumeros(5,10);
        imprimirResultado(resultadoSuma,"SUMA");
        
        double resultadoResta = restarNumeros (2019,1961);
        imprimirResultado (resultadoResta, "RESTA");
        
        double resultadoMultiplicacion=multiplicarNumeros(50,2);
        imprimirResultado(resultadoMultiplicacion, "MULTIPLICACION");
        
        double resultadoDivirNumero=dividirNumeros(27,3);
        imprimirResultado(resultadoDivirNumero, "DIVISION");
                
        
    }
    /**
     * Procedimiento para imprimir un nombre
     */
    private static void imprimirNombre(){
        // Comando para imprimir en consola
        System.out.println("Mi nombre es Jenny Paola Valencia Blandón");
        
    }
    private static double sumarNumeros(double numeroUno, double numeroDos){
       
       double resultadoSuma = numeroUno + numeroDos;
      
        return resultadoSuma; 
        
      //  System.out.println("Suma: " + resultadoSuma);
    }
    
    private static double restarNumeros ( double numeroUno, double numeroDos){
     
      double resultadoResta = numeroUno - numeroDos;

        
        return resultadoResta;       
    }
    
    private static double multiplicarNumeros ( double numeroUno,double numeroDos ){
        
        double resultadoMultiplicacion = numeroUno * numeroDos;
        
        return resultadoMultiplicacion; 
    }
    
   private static double dividirNumeros (double numeroUno, double numeroDos){
       
       double resultadoDivision = numeroUno / numeroDos;
            
       
       
      return resultadoDivision; 
       
        
   }
   /**
    * Procedimiento para imprimir resultados de cualquier operacion
    */
   private static void  imprimirResultado (double resultado, String tipoOperacion){
       System.out.println("La operacion realizada es;" + tipoOperacion);
        System.out.println("El resultado es:"+ resultado);
       
       
   }
}
