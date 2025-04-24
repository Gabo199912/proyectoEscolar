package org.proyecto.escuela.Modell;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Stack;

public class loginModell {
    private String nombreUsuario;
    private String contrasenia;




    public boolean IngresarUsuario(String _nombreUsuario, String _Contrasenia) {
            nombreUsuario = "";
            contrasenia = "";

            return nombreUsuario.equals(_nombreUsuario) && contrasenia.equals(_Contrasenia);
    }




}
