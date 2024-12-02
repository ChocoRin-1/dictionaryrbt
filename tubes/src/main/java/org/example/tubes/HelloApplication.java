package org.example.tubes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style/style.css")).toExternalForm());
        
        stage.setTitle("KAMUS!");
        stage.setScene(scene);
        
        // Enable full screen
        stage.setFullScreen(false);
        // stage.setFullScreenExitHint("Tekan ESC untuk keluar dari layar penuh");
        stage.setFullScreenExitKeyCombination(null); 
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
