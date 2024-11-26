package org.example.tubes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class SearchingController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField searchbar;
    @FXML
    private Button cariEek;
    @FXML
    private Label hasil;

    // public HashMap data = new HashMap(); //ganti jadi rbt yak nanti, ini aku nyoba aja pake hashmap
    private rbt<String, String> data = new rbt();


    public void click(ActionEvent actionEvent) {
        System.out.println("hello");
    }
    public void fill(ActionEvent actionEvent) {
        System.out.println("jisung ganteng");
    }
    public void search(ActionEvent actionEvent) { //ini contoh bentuk validation teks nya juga
        data.put("rahmah", "uga");
        data.put("Chim", "jihan");
         //coba ntr running aja, terus ketik "rahmah" di text field nya, ntr kluar uga.
         String searchtext = searchbar.getText();
        if (data.containsKey(searchtext)) {
            hasil.setText(data.get(searchbar.getText()).toString());
            //rahmah as a key, uga as a value.
        } else {
            hasil.setText("not found");
        }
    }
}

