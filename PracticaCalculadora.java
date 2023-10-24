
package practicacalculadora;
import java.util.Scanner;

public class PracticaCalculadora {

    
    public static void main(String[] args) {
   Scanner opciones = new Scanner(System.in);       
     
     double[] elementos = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
     
    
     
    
     System.out.println("*** Menu inicio***");
    
     
     System.out.println("Eliga una opcion ");
     
     System.out.println("1. Sumar**");
     
     System.out.println("2. Multiplicar**");
     
     System.out.println("3. Salir**");
        
        int opcion = opciones.nextInt();
    
        
        switch (opcion) {
            case 1:
                double suma = 0;
                for (int i = 0; i < elementos.length; i++) {
                    suma += elementos[i];
                    System.out.println("El resultado de la suma es :   *  " + suma);
                }
                break;
            case 2:
                double multiplicacion = 1.0;
                for (int i = 0; i < elementos.length; i++) {
                    multiplicacion *= elementos[i];
                    System.out.println("La multiplicación de los elementos  es:  *   " + multiplicacion);
                }
                break;
            case 3: 
                System.out.println("Salir");
                break;
            default:
            
                System.out.println("***La opcion no es valida***");
                break;

        
    
        }
        }
        }
    