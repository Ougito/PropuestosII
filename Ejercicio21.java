import java.util.Scanner;

/*  
    Realiza un programa que dada una cantidad de euros (múltiplo de 5) realice el desglose de
    billetes (500, 200, 100, 50, 20, 10, 5), siempre intentando dar el mínimo de billetes posible.
*/

public class Ejercicio21 {
    public static void ejercicio21() {
        Scanner input = new Scanner(System.in);
        
        int dinero;
        do {
            System.out.print("Introduce un número múltiplo de 5: ");
            dinero = input.nextInt(); input.nextLine();
            if (dinero % 5 != 0) System.out.println("La cantidad de dinero debe ser múltiplo de 5.");
        } while (dinero % 5 != 0);
        
        int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;
        
        while (dinero != 0) {
            b500 = dinero/500;
            dinero -= b500*500;
            b200 = dinero/200;
            dinero -= b200*200;
            b100 = dinero/100;
            dinero -= b100*100;
            b50 = dinero/50;
            dinero -= b50*50;
            b20 = dinero/20;
            dinero -= b20*20;
            b10 = dinero/10;
            dinero -= b10*10;
            b5 = dinero/5;
            dinero -= b5*5;
        }
        
        System.out.println("Billetes de 5 = " + b5);
        System.out.println("Billetes de 10 = " + b10);
        System.out.println("b20 = " + b20);
        System.out.println("b50 = " + b50);
        System.out.println("b100 = " + b100);
        System.out.println("b200 = " + b200);
        System.out.println("b500 = " + b500);
    }
    
    public static void main(String[] args) {
        ejercicio21();
    }
}
