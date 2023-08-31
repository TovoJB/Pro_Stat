package com.example.prostat_projet3.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class FenetreController {

    @FXML
    private Button apropos;

    @FXML
    private Button ajout;

    @FXML
    private AnchorPane panePrincipal;

    @FXML
    private Button recherche;

    @FXML
    private Button statistique;

    @FXML
    void onApropos(ActionEvent event) {

    }

    public void switchpane(String name) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(FenetreController.class.getResource(name+".fxml"));
        this.panePrincipal.getChildren().clear();
        this.panePrincipal.getChildren().addAll(newLoadedPane);
    }
}
