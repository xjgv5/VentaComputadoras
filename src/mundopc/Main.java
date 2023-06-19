package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Monitor monitor1 = new Monitor("Lenovo", 27);
        System.out.println(tecladoLenovo);
        System.out.println(ratonLenovo);
        System.out.println(monitor1);

        //objeto tipo computadora
        System.out.println("*********************************");
        Computadora computadoraLenovo = new Computadora("Computadora  lenovo", monitor1,tecladoLenovo,ratonLenovo);
        System.out.println(computadoraLenovo);
    }
}