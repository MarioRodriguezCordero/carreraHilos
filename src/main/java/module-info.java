module com.example.hiloscarrera {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.hiloscarrera to javafx.fxml;
    exports com.example.hiloscarrera;
}