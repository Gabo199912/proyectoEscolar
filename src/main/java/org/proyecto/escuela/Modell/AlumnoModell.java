package org.proyecto.escuela.Modell;

import java.util.ArrayList;
import java.util.List;

public class AlumnoModell extends PersonaModell{
    private String seccion;
    private String clave;

    public static List<AlumnoModell> listaAlumnos = new ArrayList<>();

    public AlumnoModell() {
    }

    public AlumnoModell(String nombre, String apellido, String edad, String seccion, String clave) {
        super(nombre, apellido, edad);
        this.seccion = seccion;
        this.clave = clave;
    }


    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void agregarAlumno(AlumnoModell alumno) {
        listaAlumnos.add(alumno);
    }

    public void eliminarAlumno(int id) {
        listaAlumnos.remove(id);
    }

    public void modificarAlumno(int id, AlumnoModell alumno) {
        listaAlumnos.set(id, alumno);
    }

    public AlumnoModell listarAlumno(int id) {
        return listaAlumnos.get(id);
    }


    public static List<AlumnoModell> getListaAlumnos() {
        return listaAlumnos;
    }
}
