package com.example.salut2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;


import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 500);
        stage.setTitle("Autoavaluació de salut");
        stage.setScene(scene);
        stage.show();
    }

//    private Stage primaryStage;


//    @Override
//    public void start(Stage primaryStage) {
////        this.primaryStage = primaryStage;
////        this.primaryStage.setTitle("Autoavaluació de salut");
////
////        salut();
//
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setLocation(HelloApplication.class.getResource("view/Menu.fxml"));
//            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
//            Menu menu = fxmlLoader.getController();
//            menu.setHelloApplication(this);
//
//        }catch (IOException e) {
//            e.printStackTrace();
//
//        }
//
//    }

//    public void pantalla (){
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader();
//            fxmlLoader.setLocation(HelloApplication.class.getResource("Menu.fxml"));
//            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
//            Menu menu = fxmlLoader.getController();
//            menu.setHelloApplication(this);
//
//        }catch (IOException e) {
//            e.printStackTrace();
//
//        }
//    }

//    public void salut (){
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("prueba.fxml"));
//            Scene scene = new Scene(fxmlLoader.load(), 350, 500);
//            HelloController helloController = fxmlLoader.getController();
//            helloController.setHelloApplication(this);
//
//        }catch (IOException e) {
//            e.printStackTrace();
//
//        }
//    }

    public static void main(String[] args) {
        launch();
    }
}



