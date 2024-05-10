/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author Dannn
 */
public class copia {
    private String isbn;
    private estado_copia estado;
    private int num_copia;

    public copia(String isbn, estado_copia estado, int num_copia) {
        this.isbn = isbn;
        this.estado = estado;
        this.num_copia = num_copia;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public estado_copia getEstado() {
        return estado;
    }

    public void setEstado(estado_copia estado) {
        this.estado = estado;
    }

    public int getNum_copia() {
        return num_copia;
    }

    public void setNum_copia(int num_copia) {
        this.num_copia = num_copia;
    }
}
