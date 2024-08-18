package com.example.sopraninja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class BootApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(BootApplication.class.getResource("views/screen-main.fxml"));
        Image image = new Image(String.valueOf(getClass().getResource("images/flauta.png")));
        stage.getIcons().add(image);

        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setResizable(false);
        stage.setTitle("S-NINJA");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}