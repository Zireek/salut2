package com.example.salut2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Estadisticas implements Initializable {

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
    private Button volver;

    @FXML
    private BarChart<String, Integer> barChart;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series<String, Integer> anim = new XYChart.Series();
        XYChart.Series fisic = new XYChart.Series();
        anim.setName("Estat d’ànim");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("valor.csv"));

            String line = reader.readLine();
            while (line !=null){
                 String[] values = line.split(",");
                 valoranim.add(values[0]);
                 valorfisic.add(values[1]);

            }reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < valoranim.size(); i++) {
            anim.getData().add(new XYChart.Data(String.valueOf(i), valoranim.get(i)));

        }
        for (int i = 0; i < valorfisic.size(); i++) {
            fisic.getData().add(new XYChart.Data(String.valueOf(i), valorfisic.get(i)));

        }


//       anim.getData().add(new XYChart.Data("1", 5));
//       anim.getData().add(new XYChart.Data("2", 3));
//       anim.getData().add(new XYChart.Data("3", 2));
//       anim.getData().add(new XYChart.Data("4", 2));
//       anim.getData().add(new XYChart.Data("5", 4));



//        XYChart.Series fisic = new XYChart.Series();
//        fisic.setName("Estat fisic");
//        fisic.getData().add(new XYChart.Data("1", 2));
//        fisic.getData().add(new XYChart.Data("2", 4));
//        fisic.getData().add(new XYChart.Data("3", 1));
//        fisic.getData().add(new XYChart.Data("4", 5));
//        fisic.getData().add(new XYChart.Data("5", 5));


        barChart.getData().addAll(anim,fisic);

    }
}
