package com.example.hcihifiprototype;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class DietaryRestrictions{
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private CheckBox otherBox;
    @FXML private TextField otherField;

    @FXML
    public void back(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    @FXML
    public void enableTextbox(){
        if(this.otherBox.isSelected()){
            this.otherField.setDisable(false);
        }
        else{
            this.otherField.clear();
            this.otherField.setDisable(true);
        }
    }
}
