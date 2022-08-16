package clases;

import herencia.Camion;
import herencia.Carro;
import herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {

        // 1. CLASES Y OBJETOS
        /* Crear un objeto con constructor vacio */
        Vehiculo Ford1 = new Vehiculo();

        /* Crear un atributo subclase que pertenece a la clase padre */
        Motor motorMazdaGTI = new Motor("GTI", 400, 360, 100, 4);

        /* Crear un objeto con constructor con argumentos */
        Vehiculo Mazda1 = new Vehiculo("MazdaXQZ30", "Mazda", "Rojo", 2022, 4, "carroceria", motorMazdaGTI);

        /* Encapsulacion con variables privadas */
        Mazda1.setAño(2010);
        System.out.println(Mazda1.toString());

        /* Cambiar velocidad --> cambiar comportamiento */
        System.out.println("Velocidad cero:" + Mazda1.velocidad + "Km"); // 0
        Mazda1.acelerar(120);
        System.out.println("Iniciando Velocidad maxima: " + Mazda1.velocidad + "Km");// 120

        // 2. HERENCIA
        Motocicleta yamahaMT03 = new Motocicleta();
        yamahaMT03.marca = "YAMAHA";

        System.out.println("Fin del programa");

        // 3. POLIMORFISMO
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(110);

        vehiculo = new Carro();
        vehiculo.acelerar(130);

        vehiculo = new Camion();
        vehiculo.acelerar(80);
    }

    // 4. CLASES ABSTRACTAS : No se pueden instanciar, solo instancian las clases hijas
}
