module com.example.prostat_projet3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prostat_projet3 to javafx.fxml;
    exports com.example.prostat_projet3;
    exports com.example.prostat_projet3.controllers;
    opens com.example.prostat_projet3.controllers to javafx.fxml;
}