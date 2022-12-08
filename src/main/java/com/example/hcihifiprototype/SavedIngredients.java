package com.example.hcihifiprototype;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class SavedIngredients{
    @FXML private Image searchButton;
    @FXML private TextField ingredientField;
    @FXML private VBox listVBox;
    @FXML private Button backButton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void back(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void add(){
        if(!this.ingredientField.getText().isEmpty()){
            String input = this.ingredientField.getText();

            Button item = new Button();
            item.setText(input);
            item.setStyle("-fx-background-color: #FBD03A");
            item.setOnAction(actionEvent -> {
                this.listVBox.getChildren().remove(item);
            });

            this.ingredientField.clear();
            this.listVBox.getChildren().add(item);
        }
    }
}
