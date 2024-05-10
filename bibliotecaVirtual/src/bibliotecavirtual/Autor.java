/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mechm
 */
public class Autor {

    /**
     * @return el nombresAutor
     */
    public ArrayList<String> getNombresAutor() {
        return nombresAutor;
    }

    /**
     * @param nombresAutor el nombresAutor to set
     */
    public void setNombresAutor(ArrayList<String> nombresAutor) {
        this.nombresAutor = nombresAutor;
    }

    /**
     * @return la nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad la nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return la fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento la fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private ArrayList<String> nombresAutor;
    private String nacionalidad;
    private Date fechaNacimiento;
}
