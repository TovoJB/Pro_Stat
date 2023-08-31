package com.example.prostat_projet3.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController {
    @FXML
    private Button btn_signin, btn_signup;

    @FXML
    private AnchorPane pn_signin, pn_signup;

    @FXML
    private Button btn_close;

    @FXML
    private Button connexion;

    @FXML
    private PasswordField mdp;

    @FXML
    private TextField utilisateur;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource() == btn_signin)
            pn_signin.toFront();
        else
        if (event.getSource() == btn_signup) {
            pn_signup.toFront();
        }
    }

    @FXML
    void onBtnClose(ActionEvent event) { ViewSwitch.close(event); }

    @FXML
    void onSubmit(ActionEvent event) throws IOException {
        ViewSwitch.switchpane("accueilview", "Accueil", event);
    }

    //@FXML
    //void onSubmit(ActionEvent event) throws IOException {
    //    ViewSwitch.switchpane("A");
    //}
}