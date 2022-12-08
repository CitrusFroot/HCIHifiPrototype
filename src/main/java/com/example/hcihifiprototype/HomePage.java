package com.example.hcihifiprototype;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class HomePage{
    @FXML private Button savedIngredientsButton;
    @FXML private Button savedRecipesButton;
    @FXML private Button restrictionsButton;
    @FXML private Button storesButton;
    @FXML private Button savedInfoButton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchSavedIngredients(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("SavedIngredients.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void switchSavedRecipes(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("SavedRecipes.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void switchDietaryRestrictions(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("DietaryRestrictions.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void switchGroceryStores(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("GroceryStores.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void switchSavedInfo(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("SavedInfo.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

}
