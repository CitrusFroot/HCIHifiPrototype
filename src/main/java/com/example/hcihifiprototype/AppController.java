package com.example.hcihifiprototype;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppController{
    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlLoader;

    public void switchSavedIngredients(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        scene = new Scene(fxmlLoader.load());

        stage.show();
    }
}
