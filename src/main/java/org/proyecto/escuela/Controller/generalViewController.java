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
    private TextField txtNombreMaestro, txtApellidoMaestro, txtEdadMaestro, txtEspecialidadMaestro, txtClaseMaestro, txtIDMaestro;

    @FXML
    private TextField txtNombreAlumno, txtApellidoAlumno, txtEdadAlumno, txtSeccionAlumno, txtClaveAlumno, txtIDAlumno;

    @FXML
    private TableView<MaestrosModell> tblMaestros;

    @FXML
    private TableColumn<MaestrosModell, String> colNombre, colApellido, colEdad, colEspecialidad, colClase;

    @FXML
    private TableColumn<MaestrosModell, Integer> colIDMaestro;

    @FXML
    private TableColumn<AlumnoModell, String> colNombreAlumno, colApellidoAlumno, colEdadAlumno, colSeccionAlumno, colClaveAlumno;

    @FXML
    private TableColumn<AlumnoModell, Integer> colIDAlumno;

    @FXML
    private  TableView<AlumnoModell> tblAlumnos;


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

    //CONTROLADORES DE MAESTROS---------------------------------------------------------------------------

    public void agregarListaMaestros(){
        String nombre = txtNombreMaestro.getText();
        String apellido = txtApellidoMaestro.getText();
        String especialidad = txtEspecialidadMaestro.getText();
        String clase = txtClaseMaestro.getText();
        String edad = txtEdadMaestro.getText();


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
        iniciarTablaMaestros(); iniciarTablaAlumos();
    }

    @FXML
    public void iniciarTablaMaestros() {

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
        txtNombreMaestro.setText("");
        txtApellidoMaestro.setText("");
        txtEdadMaestro.setText("");
        txtClaseMaestro.setText("");
        txtIDMaestro.setText("");
        txtEspecialidadMaestro.setText("");
    }

    //FINALIZA LOS CONTROLADORES DE MAESTROS-----------------------------------------------------------------------------------




    //INICIAN LOS CONTROLADORES DE ALUMNOS--------------------------------------------------------------------------




    public void agregarListaAlumnos(){
        String nombre = txtNombreAlumno.getText();
        String apellido = txtApellidoAlumno.getText();
        String edad = txtEdadAlumno.getText();
        String seccion = txtSeccionAlumno.getText();
        String clave = txtClaveAlumno.getText();

        alumno.agregarAlumno(new AlumnoModell(nombre, apellido, edad, seccion, clave));
        actualizarTablaAlumnos();
    }

    public void eliminarAlumnos(){
        int ID = Integer.parseInt(txtIDAlumno.getText());
        alumno.eliminarAlumno(ID);
        actualizarTablaAlumnos();
    }

    public void iniciarTablaAlumos(){

        colIDAlumno.setCellValueFactory(cellData -> {
            int index = tblAlumnos.getItems().indexOf(cellData.getValue());
            return new SimpleIntegerProperty(index + 1).asObject();
        });

        colNombreAlumno.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        colApellidoAlumno.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        colEdadAlumno.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEdad()));
        colSeccionAlumno.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSeccion()));
        colClaveAlumno.setCellValueFactory(cellDAta -> new SimpleStringProperty(cellDAta.getValue().getClave()));

        actualizarTablaAlumnos();
    }

    public void actualizarTablaAlumnos(){
        tblAlumnos.getItems().setAll(alumno.getListaAlumnos());
    }


}
