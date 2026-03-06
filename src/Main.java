import java.util.TreeMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //     <Entero ,Cadena> nombre del tremap
        TreeMap<Integer,String> notas = new TreeMap<>();

        // notas en el rango
        //       (key ,   value)
        notas.put(0,"Nota: Fallido");//0-49
        notas.put(50,"Nota: 1");     //50-59
        notas.put(60,"Nota: 2");     //60-69
        notas.put(70,"Nota: 3");     //70-79
        notas.put(80,"Nota: 4");     //80-89
        notas.put(90,"Nota: 5");     //90-100

        //ENTRADA
        System.out.println("Ingrese puntos de [0-100]");
        int ingresepuntos =  Integer.parseInt(scanner.nextLine());

        //OPERACION
        if (ingresepuntos < 0) {
            System.out.println("¡Imposible¡");
        } else if (ingresepuntos > 100) {
            System.out.println("¡Increíble!");
        } else {
            //valor de la lista notas (key,value)
            String resultado = notas.floorEntry(ingresepuntos).getValue();
            System.out.println(resultado); //SALIDA
        }


    }
}