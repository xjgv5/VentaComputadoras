package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class VentaComputadorasApp {
    public static void main(String[] args) {

        int opcion;
        Scanner consola = new Scanner(System.in);
        boolean salir = false;
        while (!salir){
            mostrarMenu();
            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1:
                    System.out.println("Ingresaste a la opcion 1");
                    break;
                case 2:
                    System.out.println("Ingresaste a la opcion 2");
                    break;
                case 3:
                    System.out.println("Hasta pronto ...");
                    salir = true;
                    break;

            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("Programa de orden de computadoras \n ¿Qué desea hacer?");
        System.out.println("""
                1.- Crear una orden 
                2.- Mostrar ordenes
                3.- Salir
                """);
    }
}

