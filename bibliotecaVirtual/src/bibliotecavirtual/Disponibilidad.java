/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

public class Disponibilidad {
    // Enum para las modalidades
    public enum Tipo {
        VIRTUAL,
        PRESENCIAL
    }

    private Tipo tipoModalidad;

    // Constructor
    public Disponibilidad(Tipo tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    // Métodos para obtener y establecer la modalidad
    public Tipo getTipoModalidad() {
        return tipoModalidad;
    }

    public void setTipoModalidad(Tipo tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }
}