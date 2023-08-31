package com.example.prostat_projet3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("accueilview.fxml"));

        //stage.initStyle(StageStyle.TRANSPARENT);

        Scene scene = new Scene(fxmlLoader.load(), 1000, 600);

        //scene.setFill(Color.TRANSPARENT);
        stage.setTitle("Accueil");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}