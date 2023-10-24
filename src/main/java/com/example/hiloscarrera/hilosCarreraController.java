package com.example.hiloscarrera;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

import static java.lang.System.currentTimeMillis;

public class hilosCarreraController {

    @FXML
    private Button btnIniciar;

    @FXML
    private TextField ganador;

    @FXML
    private ProgressBar probarCorredor1;

    @FXML
    private ProgressBar probarCorredor2;

    @FXML
    private ProgressBar probarCorredor3;

    @FXML
    private ProgressBar probarCorredor4;

    @FXML
    void iniciar(ActionEvent event) {
        long initialTime = System.currentTimeMillis();

        Corredor corredor1 = new Corredor("Juan", 3, initialTime);
        Corredor corredor2 = new Corredor("Alberto", 5, initialTime);
        Corredor corredor3 = new Corredor("Jose", 1, initialTime);
        Corredor corredor4 = new Corredor("Mario", 2, initialTime);


    }

}