package bibliotecavirtual;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import bibliotecavirtual.Disponibilidad;

public class BibliotecaVirtual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la informacion del Libro
        System.out.println("Ingrese el Titulo del libro:");
        String tituloLibro = scanner.nextLine();

        System.out.println("Ingrese el Genero del Libro \nNOVELA, ENSAYO, POESIA, CIENCIA FICCION, HISTORIA, BIOGRAFIA, CUENTOS(Use MAYUSCULAS):");
        String tipoLibroString = scanner.nextLine(); // Cambiado a String

        // Convertir el tipo de libro ingresado a un Genero_libro.GeneroLibro
       Genero_libro.GeneroLibro tipoLibroEnum = Genero_libro.GeneroLibro.valueOf(tipoLibroString);
     
        System.out.println("Ingrese la Editorial del Libro:");
        String editorialLibro = scanner.nextLine(); // Cambiado a String

        System.out.println("Ingrese el Anio del Libro:");
        int anioLibro = scanner.nextInt();
        scanner.nextLine(); 

        Libro libroNuevo = new Libro(tituloLibro, tipoLibroEnum, editorialLibro, anioLibro);

        // Mostrar informacion del libro ingresado
        System.out.println("\nInformacion del libro ingresado:");
        System.out.println("Titulo: " + libroNuevo.getTitulo());
        System.out.println("Tipo: " + libroNuevo.getTipo());
        System.out.println("Editorial: " + libroNuevo.getEditorial());
        System.out.println("Anio: " + libroNuevo.getAnio());

        
        System.out.println("\nIngrese el nombre del Usuario:");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese el email del Usuario:");
        String emailUsuario = scanner.nextLine();

        System.out.println("Ingrese la contrasenia del Usuario:");
        String contraseniaUsuario = scanner.nextLine();

        Usuario usuario = null;
        try {
            usuario = new Usuario(nombreUsuario, emailUsuario, contraseniaUsuario);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1); // Salir del programa si hay un error en los datos del usuario
        }

        System.out.println("\nInformacion del usuario ingresado:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Contrasenia: " + usuario.getContrasenia());

        // Pedir al usuario que ingrese la informacion del lector
        System.out.println("\nIngrese el nombre del lector:");
        String nombreLector = scanner.nextLine();

        System.out.println("Ingrese el email del lector:");
        String emailLector = scanner.nextLine();

        System.out.println("Ingrese la contrasenia del lector:");
        String contraseniaLector = scanner.nextLine();

        System.out.println("Ingrese el estado del lector (HABILITADO, MUTADO):");
        String estadoLectorString = scanner.nextLine();
        Estado_lector estadoLector = Estado_lector.valueOf(estadoLectorString);

        // Crear instancia de lector con la informacion ingresada por el usuario
        Lector lector1 = new Lector(nombreLector, emailLector, contraseniaLector, estadoLector);

        // Mostrar informacion del lector ingresado
        System.out.println("\nInformacion del lector ingresado:");
        System.out.println("Nombre: " + lector1.getNombre());
        System.out.println("Email: " + lector1.getEmail());
        System.out.println("Contrasenia: " + lector1.getContrasenia());
        System.out.println("Estado: " + lector1.getEstado());

        // Pedir al usuario que ingrese la informacion del prestamo
        System.out.println("\nIngrese la fecha de entrega del prestamo (dd/MM/yyyy):");
        String fechaEntregaString = scanner.nextLine();
        // Aquí deberías convertir la cadena de texto a un objeto de tipo Date
        Date fechaEntrega = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaEntrega = sdf.parse(fechaEntregaString);
        } catch (ParseException e) {
            System.out.println("Fecha de entrega inválida. Ingresa en formato(dd/MM/yyyy).");
            System.exit(1); 
        }

        Prestamo prestamo1 = new Prestamo(fechaEntrega, null, 0.0);

        System.out.println("\nInformacion del prestamo ingresado:");
        System.out.println("Fecha de entrega: " + prestamo1.getFechaEntrega());
        System.out.println("Fecha de devolucion: " + prestamo1.getFechaDevolucion());
        System.out.println("Multa: " + prestamo1.getMulta());

        System.out.println("\nIngrese el ISBN de la copia:");
        String isbnCopia = scanner.nextLine();

        System.out.println("Ingrese el estado de la copia (DISPONIBLE, PRESTADO, ATRASADO, REPARACION):");
        String estadoCopiaString = scanner.nextLine();
        Estado_copia estadoCopia = Estado_copia.valueOf(estadoCopiaString);

        System.out.println("Ingrese el numero de copia:");
        int numCopia = scanner.nextInt();
        scanner.nextLine();

        Copia copia1 = new Copia(isbnCopia, estadoCopia, numCopia);

        System.out.println("\nInformacion de la copia ingresada:");
        System.out.println("ISBN: " + copia1.getIsbn());
        System.out.println("Estado: " + copia1.getEstado());
        System.out.println("Numero de copia: " + copia1.getNum_copia());

        System.out.println("\nIngrese la modalidad (VIRTUAL, PRESENCIAL):");
String modalidadString = scanner.nextLine();
Disponibilidad.Tipo tipoModalidad = Disponibilidad.Tipo.valueOf(modalidadString); // Convierte la entrada a tipo Enum

// Crea una instancia de modalidad con la modalidad ingresada
Disponibilidad modalidad1 = new Disponibilidad(tipoModalidad);

System.out.println("\nInformacion de la modalidad ingresada:");
System.out.println("Tipo: " + modalidad1.getTipoModalidad());

        Menu.mostrarMenu(scanner, libroNuevo, usuario, lector1, prestamo1, copia1, modalidad1);

        scanner.close();
    }
}
