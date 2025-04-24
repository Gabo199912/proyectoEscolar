package org.proyecto.escuela.Controller;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javax.swing.text.html.ImageView;

public class generalViewController {



    @FXML
    private AnchorPane pnMaestros;

    @FXML
    private AnchorPane pnDirector;

    @FXML
    private AnchorPane pnAlumnos;




    @FXML
    private void encenderPaneMaestros(MouseEvent event) {
        pnMaestros.setVisible(!pnMaestros.isVisible());

    }

    @FXML
    private void encenderPaneDirector(MouseEvent event) {
        pnDirector.setVisible(!pnDirector.isVisible());
    }

    @FXML
    private void encenderPaneAlumnos(MouseEvent event) {
        pnAlumnos.setVisible(!pnAlumnos.isVisible());
    }

}
