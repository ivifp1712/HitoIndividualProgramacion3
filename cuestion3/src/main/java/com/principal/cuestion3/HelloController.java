package com.principal.cuestion3;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;


    @FXML
    protected void onAdd() throws IOException {
        //welcomeText.setText("Welcome to JavaFX Application!");
        HelloApplication.setRoot("add");
    }
    @FXML
    protected void onEditar() throws IOException {
        //welcomeText.setText("Welcome to JavaFX Application!");
        HelloApplication.setRoot("editar");
    }
}