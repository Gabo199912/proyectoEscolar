package org.proyecto.escuela.Modell;

public class DirectorModell extends PersonaModell{
    private String PuestoDireccion;

    public DirectorModell() {
    }

    public DirectorModell(String nombre, String apellido, int edad, String puestoDireccion) {
        super(nombre, apellido, edad);
        PuestoDireccion = puestoDireccion;
    }

    public String getPuestoDireccion() {
        return PuestoDireccion;
    }

    public void setPuestoDireccion(String puestoDireccion) {
        PuestoDireccion = puestoDireccion;
    }

}
