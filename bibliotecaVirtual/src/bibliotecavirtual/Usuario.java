/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

public class Usuario {

    private String nombre;
    private String email;
    private String contrasenia;

    public Usuario(String nombre, String email, String contrasenia) throws IllegalArgumentException {
        setNombre(nombre);
        setEmail(email);
        setContrasenia(contrasenia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe proporcionar un nombre");
        }
        this.nombre = nombre.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe proporcionar un email");
        }
        this.email = email.trim();
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) throws IllegalArgumentException {
        if (contrasenia == null || contrasenia.trim().isEmpty()) {
            throw new IllegalArgumentException("Debe proporcionar una contrasenia");
        }
        this.contrasenia = contrasenia;
    }
}
