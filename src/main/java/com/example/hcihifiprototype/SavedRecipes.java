package com.example.hcihifiprototype;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class SavedRecipes{
    @FXML private Button backButtonHP;
    @FXML private Button backButtonSR;
    @FXML private VBox listVBox;
    @FXML private VBox recipeOptionsVBox;
    @FXML private Button findButton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private ArrayList<String> recipeList = new ArrayList<>();
    private ArrayList<Button> recipeListB = new ArrayList<>();


    @FXML
    public void backSR(){
        this.backButtonHP.setVisible(true);
        this.findButton.setVisible(true);
        this.listVBox.setVisible(true);

        this.recipeOptionsVBox.setVisible(false);
        this.backButtonSR.setVisible(false);
    }

    @FXML
    public void backHP(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        this.scene = new Scene(root);
        stage.setScene(scene);

        stage.show();
    }

    public void add(ActionEvent event) throws IOException{
        Button b = (Button) event.getTarget();
        String recipe = b.getText();
        this.recipeList.add(recipe);

        Button item = new Button();
        item.setText(recipe);
        item.setStyle("-fx-background-color:#FBD03A");
        item.setOnAction(actionEvent ->{
            this.listVBox.getChildren().remove(item);
            this.recipeList.remove(item.getText());
        });
        this.listVBox.getChildren().add(item);

        fixDisables();
        backSR();
    }

    @FXML
    public void findRecipes(){
        fixDisables();
        this.backButtonHP.setVisible(false);
        this.findButton.setVisible(false);
        this.listVBox.setVisible(false);

        this.recipeOptionsVBox.setVisible(true);
        this.backButtonSR.setVisible(true);
    }

    @FXML
    public void fixDisables(){
        for(int i = 0; i < this.recipeOptionsVBox.getChildren().size(); i++){
            ((Button) (this.recipeOptionsVBox.getChildren().get(i))).setDisable(false);
            for(int j = 0; j < this.recipeList.size(); j++){
                if(this.recipeList.get(j) == ((Button) (this.recipeOptionsVBox.getChildren().get(i))).getText()){
                    ((Button) (this.recipeOptionsVBox.getChildren().get(i))).setDisable(true);
                }
            }
        }
    }


}
