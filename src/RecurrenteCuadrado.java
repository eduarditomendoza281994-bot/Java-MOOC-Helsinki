import java.util.Scanner;
public class RecurrenteCuadrado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int numero = Integer.parseInt(scanner.nextLine().trim());
            int square = numero * numero;
            System.out.println(square);
        } catch (NumberFormatException e){
            System.out.println("No es un numero");
        }

        scanner.close();


    }
}
