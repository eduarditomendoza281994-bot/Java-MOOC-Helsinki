
import java.util.Scanner;

public class CondiicionalesContraseña {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String claveCorrecta = "eduardo mendoza";
        boolean accesoConcedido = false;

        while (!accesoConcedido){//la variable no es false, entra al bucle
            System.out.println("Password?");//pido que se ingrese una cadena
            String contra = scan.nextLine();//leo la cadena ingresada, guardo en la variable
            if (contra.equalsIgnoreCase(claveCorrecta)) {//comparo en una condicion si coincide con la variable "claveCorrecta"
                System.out.println("¡Bienvenido!");//si es la contraseña accedo al sistema
                accesoConcedido = true;//termino el bucle
            } else {
                System.out.println("¡Fuera de aquí!");//si la condicion no se cumple, muestro el mensaje
                //y regresa al inicio del bucle, hasta que sea la verdadera contraseña
            }

        }




    }


}
