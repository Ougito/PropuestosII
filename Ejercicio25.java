import java.util.Scanner;

/*
    Realiza un programa que pida un número y construya por pantalla una pirámide para ese número
    de filas
*/

public class Ejercicio25 {
    public static void ejercicio25(){
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce los niveles que tendra la piramide: ");
        int niveles = input.nextInt(); input.nextLine();
        for (int i = 1; i <= niveles; i++){
            for (int j = niveles; j >= i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= (i*2-1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        ejercicio25();
    }
}
