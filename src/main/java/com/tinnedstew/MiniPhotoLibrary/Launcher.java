package com.tinnedstew.MiniPhotoLibrary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainWindowController mainWindowController = (MainWindowController)SpringFXMLLoader.load("/fxml/MainWindow.fxml");
        Scene scene = new Scene((Parent)mainWindowController.getView(), 640, 480);

        stage.setTitle("MiniPhotoLibrary");
        stage.setScene(scene);
        stage.show();
    }
}
