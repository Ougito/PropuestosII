import java.util.Scanner;

/*
    Realiza un programa que lea y acepte números double de forma consecutiva teniendo en cuenta
    que se deben introducir valores superiores a los anteriores.Únicamente se aceptarán aquellos
    que sean mayores que el último dado. La introducción de números finalizará con la introducción
    de un 0.
*/

public class Ejercicio22 {
    public static void ejercicio22() {
        Scanner input = new Scanner(System.in);
        double num = 0, num2 = 0;
        int correcto = 0, incorrecto = 0, iterador = 0;
        do {
            System.out.print("Introduce numero (0 para finalizar): ");
            num = input.nextDouble(); input.nextLine();
            if (iterador == 0) {
                num2 = num;
                iterador++;
            }
            else if (iterador != 0 && num != 0) {
                if (num > num2) {
                    correcto++;
                    num2 = num;
                }
                else {
                    incorrecto++;
                    num2 = num;
                }   
            }
            else {
                System.out.println("Saliendo del programa...");
            }
        } while (num != 0);
        
        System.out.println("Total = " + (correcto + incorrecto));
        System.out.println("incorrecto = " + incorrecto);
    }
    
    public static void main(String[] args) {
        ejercicio22();
    }
}
