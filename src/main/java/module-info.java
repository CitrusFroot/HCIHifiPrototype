module com.example.hcihifiprototype {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hcihifiprototype to javafx.fxml;
    exports com.example.hcihifiprototype;
}