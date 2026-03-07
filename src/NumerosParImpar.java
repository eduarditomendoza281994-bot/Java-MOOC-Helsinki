import java.util.TreeMap;
import java.util.Scanner;

public class NumerosParImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar){
            try {
                System.out.println("Da un numero:");
                int numero = Integer.parseInt(scanner.nextLine().trim());

                if (numero%2==0) {
                    System.out.println("Number " + numero + " is even.");
                } else {
                    System.out.println("Number " + numero + " is odd.");
                }
                continuar = false;
            } catch (NumberFormatException e){
                System.out.println("Ingrese un numero valido: ");
            }
        }









    }
}