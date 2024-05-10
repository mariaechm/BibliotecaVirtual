/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class menu {
    public static void mostrarMenu(Scanner scanner, libro libroNuevo, usuario usuario, lector lector1,
            prestamo prestamo1, copia copia1, modalidad modalidad1) {
        // Mostrar el menú
        System.out.println("\nMenu:");
        System.out.println("1. Ver datos ingresados.");
        System.out.println("2. Prestar libro.");
        System.out.println("3. Devolver libro.");
        System.out.println("4. Salir.");

        // Leer la opción del usuario
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        switch (opcion) {
            case 1:
                // Mostrar los datos ingresados
                mostrarDatos(libroNuevo, usuario, lector1, prestamo1, copia1, modalidad1);
                break;
            case 2:
                // Lógica para prestar el libro
                System.out.println("Prestar libro...");
                break;
            case 3:
                // Lógica para devolver el libro
                System.out.println("Devolver libro...");
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void mostrarDatos(libro libroNuevo, usuario usuario, lector lector1, prestamo prestamo1,
            copia copia1, modalidad modalidad1) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Mostrar los datos ingresados
        System.out.println("\nInformacion del libro ingresado:");
        System.out.println("Titulo: " + libroNuevo.getTitulo());
        System.out.println("Tipo: " + libroNuevo.getTipo());
        System.out.println("Editorial: " + libroNuevo.getEditorial());
        System.out.println("Ano: " + libroNuevo.getAnio());
        System.out.println("\nInformacion del usuario ingresado:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Contrasenia: " + usuario.getContrasenia());
        System.out.println("\nInformacion del lector ingresado:");
        System.out.println("Nombre: " + lector1.getNombre());
        System.out.println("Email: " + lector1.getEmail());
        System.out.println("Contrasenia: " + lector1.getContrasenia());
        System.out.println("Estado: " + lector1.getEstado());
        System.out.println("\nInformacion del prestamo ingresado:");
        System.out.println("Fecha de entrega: " + sdf.format(prestamo1.getFechaEntrega())); // Imprimir la fecha formateada
        System.out.println("Fecha de devolucion: " + prestamo1.getFechaDevolucion()); // Esto puede imprimir null
        System.out.println("Multa: " + prestamo1.getMulta());
        System.out.println("\nInformacion de la copia ingresada:");
        System.out.println("ISBN: " + copia1.getIsbn());
        System.out.println("Estado: " + copia1.getEstado());
        System.out.println("Numero de copia: " + copia1.getNum_copia());
        System.out.println("\nInformacion de la modalidad ingresada:");
        System.out.println("Tipo: " + modalidad1.getTipoModalidad());
    }
}