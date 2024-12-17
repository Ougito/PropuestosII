import java.util.Scanner;

public class Ejercicio19 {

    /*
    Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos
    por teclado.
    */

    public static void ejercicio19() {

        Scanner input = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = input.nextInt(); input.nextLine();
        int multiplos = 0;
        for (int i = 1; i <= num; i++) {
          if (i % 3 == 0) multiplos++;
        }
        System.out.printf("Hay %d números múltiplos de 3.%n", multiplos);
    }
    
    public static void main(String[] args) {
        ejercicio19();        
    }
}
