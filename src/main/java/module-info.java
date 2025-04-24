module org.proyecto.escuela {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens org.proyecto.escuela to javafx.fxml;
    opens org.proyecto.escuela.Controller to javafx.fxml;
    exports org.proyecto.escuela;
    exports org.proyecto.escuela.Controller;
}