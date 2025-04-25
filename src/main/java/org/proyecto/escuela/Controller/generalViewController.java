package org.proyecto.escuela.Controller;


import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import org.proyecto.escuela.Modell.AlumnoModell;
import org.proyecto.escuela.Modell.DirectorModell;
import org.proyecto.escuela.Modell.MaestrosModell;


public class generalViewController {
    private DirectorModell director = new DirectorModell();
    private AlumnoModell alumno = new AlumnoModell();
    private MaestrosModell maestro = new MaestrosModell();

    @FXML
    private AnchorPane pnMaestros;

    @FXML
    private AnchorPane pnDirector;

    @FXML
    private AnchorPane pnAlumnos;


    @FXML
    private void encenderPaneMaestros() {
        pnMaestros.setVisible(!pnMaestros.isVisible());

    }

    @FXML
    private void encenderPaneDirector() {
        pnDirector.setVisible(!pnDirector.isVisible());
    }

    @FXML
    private void encenderPaneAlumnos() {
        pnAlumnos.setVisible(!pnAlumnos.isVisible());
    }





}
