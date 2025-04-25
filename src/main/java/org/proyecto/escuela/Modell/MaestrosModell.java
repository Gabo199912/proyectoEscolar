package org.proyecto.escuela.Modell;

import java.util.ArrayList;
import java.util.List;

public class MaestrosModell extends PersonaModell{
    public String especialidad;
    public String claseFisica;

    public static List<MaestrosModell> listaMaestros = new ArrayList();

    public MaestrosModell() {
    }

    public MaestrosModell(String nombre, String apellido, int edad, String especialidad, String claseFisica) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
        this.claseFisica = claseFisica;
    }

    public void agregarMaestro(MaestrosModell maestro) {
        listaMaestros.add(maestro);
    }

    public void eliminarMaestro(int id) {
        listaMaestros.remove(id);
    }

    public void modificarMaestro(int id, MaestrosModell maestro) {
        listaMaestros.set(id, maestro);
    }

    public MaestrosModell listarMaestro(int id) {
        return listaMaestros.get(id);
    }

}
