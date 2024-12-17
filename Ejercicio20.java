import java.util.Scanner;

public class Ejercicio20 {

    /*
    Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
    los números desde A hasta B e indicar cuantos hay que sean pares.
    */

    public static void ejercicio20() {

        Scanner input = new Scanner(System.in);
        int numA, numB, pares = 0;

        do {
            System.out.print("Introduce número A: ");
            numA = input.nextInt();input.nextLine();
            System.out.print("Introduce número B (mayor que A): ");
            numB = input.nextInt();input.nextLine();
            if (numA >= numB) System.out.println("El número B debe ser mayor que el número A\n");
        } while (numA >= numB);
        
        for (int i = numA; i <= numB; i++) {
            if (i  != numB) System.out.print(i + " ");
            else System.out.println(i);
            if (i % 2 == 0) pares++;
        }

        System.out.println("Cantidad de número pares = " + pares);
    }
    
    public static void main(String[] args) {
        ejercicio20();
    }
}
