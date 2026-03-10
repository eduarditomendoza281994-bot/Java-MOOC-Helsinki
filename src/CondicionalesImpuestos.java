import java.util.Scanner;
public class CondicionalesImpuestos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //ENTRADA
        boolean continuar = true;
        while (continuar){
            System.out.println("¿Valor del regalo?");
            try {
                //esta linea es la que se encarga de validar si la entrada es
                //valida o no
                int valorRegalo = Integer.parseInt(scanner.nextLine().trim());
                double impuesto;
                if (valorRegalo > 0 ){
                    if (valorRegalo < 5000){
                        System.out.println("¡Sin impuestos!");
                    } else if (valorRegalo <= 25000){
                        impuesto = 100 + (valorRegalo - 5000) * 0.08;
                        System.out.printf("Impuesto: %.2f%n", impuesto);
                    } else if (valorRegalo <= 55000){
                        impuesto = 1700 + (valorRegalo - 25000) * 0.1;
                        System.out.println("Impuesto: " + impuesto);
                    } else if (valorRegalo <= 200000){
                        impuesto = 4700 + (valorRegalo - 55000) * 0.12;
                        System.out.println("Impuesto: " + impuesto);
                    } else if (valorRegalo <= 1000000){
                        impuesto = 22100 + (valorRegalo - 200000) * 0.15;
                        System.out.println("Impuesto: " + impuesto);
                    } else {
                        impuesto = 142100 + (valorRegalo - 1000000) * 0.17;
                        System.out.println("Impuesto: " + impuesto);
                    }
                    continuar = false;
                } else {
                    System.out.println("numero no valido...");
                }
            } catch (NumberFormatException e){
                System.out.println("numero no valido...");
            }
        }

        scanner.close();

    }


}
