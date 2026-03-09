import java.util.Scanner;
public class CondicionalesEdad {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){//mientras sea verdadero
            System.out.println("¿Cuántos años tienes?");//muestro el mensaje
            try { //permite que el programa no se cierre bruscamente
                //leo el entero ingresado y lo analizo con parseInt               //
                int anios = Integer.parseInt(scanner.nextLine().trim());
                //si estan dentro del rango se termina el bucle
                if (anios >= 0 && anios < 121){
                    System.out.println("OK");
                    break;
                }
                System.out.println("¡Imposible!");//si no continua preguntando
            } catch (Exception e){// si el parseInt lo detecta que no es entero
                System.out.println("por favor ingresa un número");
            }
        }
        scanner.close();

    }

}
