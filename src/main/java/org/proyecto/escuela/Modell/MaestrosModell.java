package org.proyecto.escuela.Modell;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MaestrosModell extends PersonaModell{
    public String especialidad;
    public String claseFisica;

    public static List<MaestrosModell> listaMaestros = new ArrayList();

    public MaestrosModell() {
    }

    public MaestrosModell(String nombre, String apellido, String edad, String especialidad, String claseFisica) {
        super(nombre, apellido, edad);
        this.especialidad = especialidad;
        this.claseFisica = claseFisica;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getClaseFisica() {
        return claseFisica;
    }

    public void setClaseFisica(String claseFisica) {
        this.claseFisica = claseFisica;
    }

    public void agregarMaestro(MaestrosModell maestro) {
        listaMaestros.add(maestro);
    }

    public void eliminarMaestro(int id) {
            listaMaestros.remove((id-1));
            JOptionPane.showMessageDialog(null,"El maestro fue eliminado exitosamente");


    }

    public void modificarMaestro(int id, MaestrosModell maestro) {
        listaMaestros.set(id, maestro);
    }

    public MaestrosModell listarMaestro(int id) {

        return listaMaestros.get(id);
    }

    public static List<MaestrosModell> getListaMaestros() {
        return listaMaestros;
    }
}
