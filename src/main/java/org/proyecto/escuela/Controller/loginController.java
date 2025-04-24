package org.proyecto.escuela.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.proyecto.escuela.Modell.loginModell;

import javax.swing.*;
import java.io.IOException;

public class loginController{



    @FXML
    private TextField txtUsuario;

    @FXML
    private TextField txtContrasenia;

    @FXML
    private Button btnIngresar;



    @FXML
    public void ingresarUsuario() {
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();
        loginModell login = new loginModell();


        if (login.IngresarUsuario(usuario, contrasenia)) {
            cargarVistaGeneral();
            cerrarVentana();
        }else{
            JOptionPane.showMessageDialog(null,"DATOS INCORRECTOS");
        }

    }


    public void cerrarVentana(){
        Stage stage = (Stage) btnIngresar.getScene().getWindow();
        stage.close();
    }

    public void cargarVistaGeneral(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/proyecto/escuela/vistas/general-view.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root, 760, 500);
            scene.getStylesheets().add(getClass().getResource("/org/proyecto/escuela/Estilos/estilosBotones.css").toExternalForm());



            Stage stage = new Stage();
            stage.setResizable(false);
            stage.setScene(scene);

            stage.show();

        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e);
        }

    }


}
