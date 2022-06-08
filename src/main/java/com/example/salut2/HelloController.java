package com.example.salut2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    ArrayList<String> valoranim = new ArrayList<>();
    ArrayList<String> valorfisic = new ArrayList<>();


    private Stage stage;
    private Scene scene;

    public void switchmenu (ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load(), 350, 500);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private CheckBox llet, cereals, pasta, fruita, vegetals, llegums, aigua, alcohol, sucs, diaNit;

//    @FXML
//    private ChoiceBox<String> choiceAnim, choiceFisic;
//
//    private String[] valoracio = {"0","1","2","3","4","5"};

    @FXML
    private TextField estatFisic, estatAnim;

     public void Guardar(ActionEvent event) throws IOException {

         valoranim.add(estatAnim.getText());
         valorfisic.add(estatFisic.getText());

         for (int i = 0; i < valoranim.size(); i++) {

             String valor1 = valoranim.get(i);
             String valor2 = valorfisic.get(i);
             String resultado = "" + valor1 + "," + valor2 + "\n";
             String filename ="valor.csv";
             FileWriter fw = new FileWriter(filename, true);
             fw.write(resultado);
             fw.close();

         }

     }


    @FXML
    private Label titulo, labelAnim, labelFisic;

    @FXML
    private ImageView imagen;

    Image sol = new Image(getClass().getResourceAsStream("sol.png"));
    Image luna = new Image(getClass().getResourceAsStream("luna.png"));

    @FXML
    private Button bGuardar, volver;

    @FXML
    private DatePicker fecha;

    private HelloApplication helloApplication;

    public void change(ActionEvent event){
        if (diaNit.isSelected()){
            System.out.println("Nit");
            imagen.setImage(luna);
        }
        else {
            System.out.println("Dia");
            imagen.setImage(sol);

        }
    }

    public void getDate(ActionEvent event){
        LocalDate mifecha = fecha.getValue();
        System.out.println(mifecha.toString());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        choiceAnim.getItems().addAll(valoracio);
//        choiceFisic.getItems().addAll(valoracio);
//
//    }

//    public void setHelloApplication(HelloApplication helloApplication) {
//        this.helloApplication = helloApplication;
//    }
}