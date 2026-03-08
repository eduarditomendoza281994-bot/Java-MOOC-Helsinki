import java.util.Objects;
import java.util.Scanner;

public class CondicionalesIgual {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean acceso = false;
        //TERMINA EL BUCLE HASTA QUE LAS CADENAS SEAN IGUALES
        while (!acceso){
            System.out.println("Entra la primera cadena: ");
            String primeracadena = scanner.nextLine().trim();
            System.out.println("Entra la segunda cadena: ");
            String segundacadena = scanner.nextLine().trim();
            //IGNORA SI SON MINUSCULAS O MAYUSCULAS
            if (primeracadena.equalsIgnoreCase(segundacadena)){
                System.out.println("Igual");
                acceso = true;
            } else {
                System.out.println("Diferente");
            }
        }


    }

}
