package com.example.prostat_projet3.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ViewSwitch {
    public static void switchpane(String name, String title, ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(FenetreController.class.getResource(name+".fxml"));
        Node node = (Node) event.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        thisStage.setTitle(StageStyle.DECORATED.name());
        Scene scene = new Scene(fxmlLoader.load());
        thisStage.setTitle(title);
        thisStage.setScene(scene);
    }

    public static void close(ActionEvent event) {
        Node node = (Node) event.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        thisStage.close();
    }
}
