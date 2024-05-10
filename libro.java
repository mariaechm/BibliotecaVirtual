/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

public class libro {

    private String titulo;
    private tipoLibro.TipoLibro tipo;
    private String editorial;
    private int anio;

    // Constructor
    public libro(String titulo, tipoLibro.TipoLibro tipo, String editorial, int anio) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.anio = anio;
    }

    // Métodos getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public tipoLibro.TipoLibro getTipo() {
        return tipo;
    }

    public void setTipo(tipoLibro.TipoLibro tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}