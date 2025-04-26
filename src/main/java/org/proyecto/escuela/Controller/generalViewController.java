package org.proyecto.escuela.Controller;


import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    private TextField txtNombre, txtApellido, txtEdad, txtEspecialidad, txtClase, txtIDMaestro;

    @FXML
    private TableView<MaestrosModell> tblMaestros;

    @FXML
    private TableColumn<MaestrosModell, String> colNombre;

    @FXML
    private TableColumn<MaestrosModell, String> colApellido;

    @FXML
    private TableColumn<MaestrosModell, String> colEdad;

    @FXML
    private TableColumn<MaestrosModell, String> colEspecialidad;

    @FXML
    private TableColumn<MaestrosModell, String> colClase;

    @FXML
    private TableColumn<MaestrosModell, Integer> colIDMaestro;


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


    public void agregarListaMaestros(){
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String especialidad = txtEspecialidad.getText();
        String clase = txtClase.getText();
        String edad = txtEdad.getText();


        maestro.agregarMaestro(new MaestrosModell(nombre, apellido, edad, especialidad, clase));
        //MaestrosModell.listaMaestros.add(new MaestrosModell(nombre, apellido, especialidad, clase, edad));
        actualizarTabla();

    }

    public void eliminarMaestro(){
        int ID = Integer.parseInt(txtIDMaestro.getText());

        maestro.eliminarMaestro(ID);
        actualizarTabla();
    }


    @FXML
    public void initialize() {
        iniciarTabla();
    }

    @FXML
    public void iniciarTabla() {

        colIDMaestro.setCellValueFactory(cellData -> {
            int index = tblMaestros.getItems().indexOf(cellData.getValue());
            return new SimpleIntegerProperty(index + 1).asObject();
        });

        colNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        colEdad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEdad()));
        colEspecialidad.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEspecialidad()));
        colClase.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getClaseFisica()));

        actualizarTabla();
    }

    public void actualizarTabla() {
        tblMaestros.getItems().setAll(maestro.getListaMaestros());
        limpiarEspacios();
    }


    public void limpiarEspacios(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtClase.setText("");
        txtIDMaestro.setText("");
        txtEspecialidad.setText("");
    }


}
