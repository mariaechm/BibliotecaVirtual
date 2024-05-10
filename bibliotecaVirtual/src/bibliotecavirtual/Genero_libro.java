/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

import java.util.ArrayList;

public class Genero_libro {
   public enum GeneroLibro {
        NOVELA,
        ENSAYO,
        POESIA,
        CIENCIA_FICCION,
        HISTORIA,
        BIOGRAFIA,
        CUENTOS,
    }

    // Método para agregar tipos de libro a un ArrayList
    public static ArrayList<GeneroLibro> agregarTiposLibro() {
        ArrayList<GeneroLibro> tiposLibro = new ArrayList<>();
        tiposLibro.add(GeneroLibro.NOVELA);
        tiposLibro.add(GeneroLibro.ENSAYO);
        tiposLibro.add(GeneroLibro.POESIA);
        tiposLibro.add(GeneroLibro.CUENTOS);
        tiposLibro.add(GeneroLibro.HISTORIA);
        // Se puede agregar más generos de libro según sea necesario
        return tiposLibro;
    }

    // Método para mostrar los tipos de libro en un ArrayList
    public static void mostrarTiposLibro(ArrayList<GeneroLibro> tiposLibro) {
        System.out.println("Tipos de libro en la lista:");
        for (GeneroLibro tipo : tiposLibro) {
            System.out.println(tipo);
        }
    }
}

