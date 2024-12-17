import java.util.Scanner;

/*
    Realiza un programa donde el usuario piensa un número del 1 al 100 y el ordenador lo adivina. El
    usuario deberá ir indicando al ordenador si es mayor, menor o igual a cada una de las propuestas
*/

public class Ejercicio24 {
   public static void ejercicio24(){
       int limiteSuperior = 100, limiteInferior = 0;
       int intento;
       Scanner input = new Scanner(System.in);
       String opcion = "mayor";
       
       System.out.println("Piensa en un número entre 0 y 100.");
       System.out.println("Responde con 'mayor', 'menor' o 'igual' segun corresponda.");
       
       while (!opcion.toLowerCase().equals("igual")){
           intento = (limiteSuperior + limiteInferior)/2;
           System.out.print("Estas pensando en el numero " +  intento + "? (mayor / menor / igual): ");
           opcion = input.nextLine();
           if (opcion.equals("mayor")) {
               limiteInferior = intento;
           }
           else if (opcion.equals("menor")) {
                limiteSuperior = intento;
           }
           else if (opcion.equals("igual")) {
                System.out.println("Acertado");
           }
           else System.out.println("Por favor, responde con 'mayor', 'menor' o 'igual'.");
        }
    }
   
   public static void main (String[] Args) {
       ejercicio24();
   }
}