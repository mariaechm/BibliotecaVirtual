/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

import java.util.ArrayList;

public class tipoLibro {
   public enum TipoLibro {
        NOVELA,
        ENSAYO,
        POESIA,
        CIENCIA_FICCION,
        HISTORIA,
        BIOGRAFIA,
    }

    // Método para agregar tipos de libro a un ArrayList
    public static ArrayList<TipoLibro> agregarTiposLibro() {
        ArrayList<TipoLibro> tiposLibro = new ArrayList<>();
        tiposLibro.add(TipoLibro.NOVELA);
        tiposLibro.add(TipoLibro.ENSAYO);
        tiposLibro.add(TipoLibro.POESIA);
        // Puedes agregar más tipos de libro según sea necesario
        return tiposLibro;
    }

    // Método para mostrar los tipos de libro en un ArrayList
    public static void mostrarTiposLibro(ArrayList<TipoLibro> tiposLibro) {
        System.out.println("Tipos de libro en la lista:");
        for (TipoLibro tipo : tiposLibro) {
            System.out.println(tipo);
        }
    }
}

