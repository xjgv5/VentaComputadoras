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
        Computadora computadora;
        Orden orden1 = new Orden();

        while (!salir){
            mostrarMenu();
            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1:
                    //System.out.println("Ingresaste a la opcion 1");
                    try {
                        computadora = crearPedido(consola);
                        orden1.agregarComputadora(computadora);
                    } catch (Error e){
                        System.out.println("Oops ! ha ocurrido un error " + e);
                    }
                    break;

                case 2:
                    System.out.println("Mostrando las ordenes actuales");
                    orden1.mostrarOrden();
                    break;
                case 3:
                    System.out.println("Hasta pronto ...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida...");

            }
        }
    }

    public static Computadora crearPedido(Scanner consola){
        String tipoEntrada;
        String marca;
        double tamanio;
        String nombreComputadora;

        System.out.println("Iniciando pedido...");
        System.out.println("************************************************");
        System.out.println("Coloca las especificacion de tu ratón : ");
        System.out.print("Tipo de entrada: ");
        tipoEntrada = consola.nextLine();
        System.out.print("Marca: ");
        marca = consola.nextLine();
        //crear el objeto
        Raton raton  = new Raton(tipoEntrada, marca);
        System.out.println("************************************************");
        System.out.println("Coloca las especificacion de tu monitor : ");
        System.out.print("Tamaño (En pulgadas): ");
        tamanio = Double.parseDouble(consola.nextLine());
        System.out.print("Marca: ");
        marca = consola.nextLine();
        Monitor monitor = new Monitor(marca, tamanio);
        System.out.println("************************************************");
        System.out.println("Coloca las especificaciones de tu teclado");
        System.out.print("Tipo de entrada: ");
        tipoEntrada = consola.nextLine();
        System.out.print("Marca: ");
        marca = consola.nextLine();
        Teclado teclado = new Teclado(tipoEntrada, marca);
        // ----------------------------- Creando la computadora ---------------------------
        System.out.print("Ingresa el nombre de la computadora: ");
        nombreComputadora = consola.nextLine();
        System.out.println("Pedido creado con éxito");
        return new Computadora(nombreComputadora, monitor, teclado, raton);

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

