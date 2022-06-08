package com.example.salut2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Menu implements Initializable {

    private Stage stage;
    private Scene scene;

    public void switchAfegir (ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("prueba.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 350, 500);
        stage.setScene(scene);
        stage.show();
    }
    public void switchEstadisticas (ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Estadisticas.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 350, 500);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private Label menu;

    @FXML
    private Button bAfegir, bVeure;

//    private HelloApplication helloApplication;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

//    public void setHelloApplication(HelloApplication helloApplication) {
//        this.helloApplication = helloApplication;
//
//    }

//    @FXML
//    private void handleAfegir() {
//        helloApplication.salut();
//
//
//    }
}
