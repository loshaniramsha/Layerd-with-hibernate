package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch();
    }

@Override
    public void start(Stage stage) throws IOException {

        Parent load = FXMLLoader.load(this.getClass().getResource("/view/student.fxml"));

        Scene scene = new Scene(load);
        stage.setTitle("Student Details");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}

