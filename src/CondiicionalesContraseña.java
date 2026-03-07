import java.util.Scanner;

public class CondiicionalesContraseña {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String claveCorrecta = "Caput Draconis";
        boolean accesoConcedido = false;

        while (!accesoConcedido){

            System.out.println("Password?");
            String contra = scan.nextLine();

            if (contra.equals(claveCorrecta)) {
                System.out.println("¡Bienvenido!");
                accesoConcedido = true;
            } else {
                System.out.println("¡Fuera de aquí!");
            }

        }




    }


}
