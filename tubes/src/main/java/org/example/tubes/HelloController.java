package org.example.tubes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private Button buttonStart;

    public void click(ActionEvent actionEvent) throws IOException {
        System.out.println("hello");
        Parent root = FXMLLoader
                .load(Objects.requireNonNull(getClass().getResource("/org/example/tubes/view/searching-view.fxml")));
        Scene mainPageScene = new Scene(root);

        Stage stage = (Stage) rootPane.getScene().getWindow();

        // Menentukan ukuran layar sebelumnya (opsional jika ingin mempertahankan ukuran
        // sebelum fullscreen)
        double prevWidth = stage.getWidth();
        double prevHeight = stage.getHeight();

        // Mengganti scene
        stage.setScene(mainPageScene);

        // Mengatur stage ke fullscreen
        stage.setFullScreen(true);

        // (Opsional) Mempertahankan ukuran sebelumnya saat keluar dari fullscreen
        stage.setWidth(prevWidth);
        stage.setHeight(prevHeight);
    }
}