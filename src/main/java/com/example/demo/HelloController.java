package com.example.demo;

import com.sun.javafx.charts.Legend;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField Input1;

    @FXML
    private TextField Input2;

//    @FXML
//    void onClick(){
//        Result.setText("Clicked!");
//        System.out.println("Hello I am planet destroyer");
//    }

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

    @FXML
    private Label Result;

    @FXML
    void add(){
           String s1=Input1.getText();
           String s2=Input2.getText();

           double res = Double.parseDouble(s1)+Double.parseDouble(s2);
           Result.setText(res+"");
    }

    @FXML
    void multiply(){
        String s1=Input1.getText();
        String s2=Input2.getText();

        double res = Double.parseDouble(s1)*Double.parseDouble(s2);
        Result.setText(res+"");

    }

    @FXML
    private ChoiceBox choiceBox;

    @FXML
            public void initialize() {
        choiceBox.setItems(FXCollections.observableArrayList("Add","Substract","Multiply","Divide"));
    }
    @FXML
      void changescene(ActionEvent event) throws IOException{
        Parent parent = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Scene scene2 = new Scene(parent);

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(scene2);


    }



    @FXML
    private void back(ActionEvent event) throws IOException{
        Parent p2 = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(p2);
        Stage wind = (Stage)  ((Node)event.getSource()).getScene().getWindow();
        wind.setScene(scene);
    }


//    @FXML
//    void back(ActionEvent event) throws IOException{
//        Parent parent = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(parent);
//
//        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
//
//        window.setScene(scene);
//        window.show();
//
//    }
}