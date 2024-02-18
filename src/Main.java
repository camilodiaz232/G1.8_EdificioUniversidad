import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        // Lectura de variables
        double estudiantes = 0;
        double capacidadSalon = 0;
        double salonesPiso = 0;

        //Objeto de lectura de los valores
        Scanner lectura = new Scanner(System.in);

        //Captura de variables
        System.out.println("Ingrese el numero de estudiantes: ");
        estudiantes = Integer.parseInt(lectura.next());

        System.out.println("Ingrese la capacidad de cada salon: ");
        capacidadSalon=Integer.parseInt(lectura.next());

        System.out.println("Ingrese la cantidad de salones por piso: ");
        salonesPiso = Integer.parseInt(lectura.next());

        //Presentacion de los resultados
        System.out.println("El cantidad de salones del edificio son: "+calcularSalones(estudiantes,capacidadSalon));
        System.out.println("EL numero de pisos del edificio son: "+calcularPisos(calcularSalones(estudiantes,capacidadSalon),salonesPiso));
    }

    //Funcion para calcular el numero de salones
    public static double calcularSalones (double estudiantes, double capacidadSalon){
        return Math.ceil(estudiantes/capacidadSalon);
    }

    //Funcion para calcular el numero de pisos
    public static double calcularPisos (double salones, double salonesPiso ){
        return  Math.ceil(salones/salonesPiso);
    }
}
