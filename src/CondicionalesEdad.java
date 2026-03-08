import java.util.Scanner;
public class CondicionalesEdad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("¿Cuántos años tienes?");
            try {
                int anios = Integer.parseInt(scanner.nextLine().trim());
                if (anios >= 0 && anios < 121){
                    System.out.println("OK");
                    break;
                }
                System.out.println("¡Imposible!");
            } catch (Exception e){
                System.out.println("por favor ingresa un número");
            }
        }


    }

}
