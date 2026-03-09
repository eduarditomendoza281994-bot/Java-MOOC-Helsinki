import java.util.Scanner;
public class CondicionalesAñoBisiesto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Da un año:");
            try {
                int anioBisiesto = Integer.parseInt(scanner.nextLine().trim());
                //la logica del programa año bisiesto
                if (anioBisiesto % 400 == 0 || (anioBisiesto % 4 == 0 && anioBisiesto % 100 != 0)){
                    System.out.println("Año Bisiesto");
                    break;//termina el bucle cuando sea bisiesto
                } else {
                    System.out.println("No es Bisiesto");
                }
            } catch (NumberFormatException e){//atrapo el error de vacio o letras
                System.out.println("Ingrese un numero...");
            }
        }
        scanner.close(); //cerrar el scanner para ahorrar memoria

    }
}
