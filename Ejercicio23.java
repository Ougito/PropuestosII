import java.util.Scanner;

/*
    Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los
    números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor
*/

public class Ejercicio23 {
    
    public static void ejercicio23() {
        Scanner input = new Scanner(System.in);
        byte num = -1;

        while (num < 0 || num > 20) {
            System.out.print("Introduce un numero entre 0 y 20: ");
            num = input.nextByte();
            input.nextLine();
            if (num < 0 || num > 20) System.out.println("El numero debe estar entre 0 y 20.");
        } 
        
        for (byte i = 1;i <= num; i++){
            for (byte j = 1; j <= i; j++){
                if (j!=i) System.out.printf("%02d", i);
                else System.out.printf("%02d%n", i);
            }
        }
    }
    
    public static void main(String[] args) {
        ejercicio23();
    }
}