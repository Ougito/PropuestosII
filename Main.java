import java.util.Scanner;

/**
 *
 * @author Eliseu Martínez Monrabal
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        byte ejercicio;
        
        System.out.println("*** PROPUESTOS II ***");
        
        do {
            System.out.println("\n1. Ejercicio 19 - Multiplos de 3.");
            System.out.println("2. Ejercicio 20 - Contador de numeros pares de 1 a N.");
            System.out.println("3. Ejercicio 21 - Desglose de billetes.");
            System.out.println("4. Ejercicio 22 - Doubles mayores consecutivos.");
            System.out.println("5. Ejercicio 23 - Filas N de numeros entre 0 y 20.");
            System.out.println("6. Ejercicio 24 - Adivinar numero.");
            System.out.println("7. Ejercicio 25 - Piramide asteriscos.");
            System.out.println("8. Salir");

            System.out.print("\nQue ejercicio quieres ejecutar? ");
            ejercicio = input.nextByte(); input.nextLine();
            System.out.println("");

            switch(ejercicio) {
                case 1:
                    Ejercicio19.ejercicio19();
                    break;
                case 2:                
                    Ejercicio20.ejercicio20();
                    break;
                case 3:
                    Ejercicio21.ejercicio21();
                    break;
                case 4:
                    Ejercicio22.ejercicio22();
                    break;
                case 5:
                    Ejercicio23.ejercicio23();
                    break;
                case 6:
                    Ejercicio24.ejercicio24();
                    break;
                case 7:
                    Ejercicio25.ejercicio25();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Elige una opcion correcta.");
            }
        } while (ejercicio != 8);
    }
}
