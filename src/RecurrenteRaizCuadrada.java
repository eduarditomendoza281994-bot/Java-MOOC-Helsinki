import java.util.Scanner;
public class RecurrenteRaizCuadrada {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el 1° numero...");
            int numero1 = Integer.parseInt(scanner.nextLine().trim());
            System.out.println("Ingrese el 2° numero...");
            int numero2 = Integer.parseInt(scanner.nextLine().trim());

            if (numero1 >= 0 && numero2 >= 0) {
                int suma = numero1 + numero2;
                double sqrt = Math.sqrt(suma);
                System.out.printf("%.2f%n", sqrt);
            } else {
                System.out.println("Solo numero positivos...");
            }
        } catch (NumberFormatException e) {
            System.out.println("Numero no valido...");
        }

    }
}
