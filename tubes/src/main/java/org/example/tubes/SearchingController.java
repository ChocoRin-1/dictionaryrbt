// package org.example.tubes;

// import java.security.Key;
// import java.util.ArrayList;
// import java.util.List;

// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.AnchorPane;
// import javafx.scene.layout.VBox;
// import javafx.scene.text.Font;

// public class SearchingController {
//     @FXML
//     private AnchorPane rootPane;
//     @FXML
//     private TextField searchbar;
//     @FXML
//     private Button cari;
//     @FXML
//     private Label hasil;
//     @FXML
//     private VBox vboxResult;
//     @FXML
//     private Button clean;

//     // public HashMap data = new HashMap(); //ganti jadi rbt yak nanti, ini aku
//     // nyoba aja pake hashmap
//     private rbt<String, String> dictionary = new rbt();

//     public void click(ActionEvent actionEvent) {
//         System.out.println("hello");
//     }

//     public void fill(ActionEvent actionEvent) {
//         System.out.println("jisung ganteng");
//     }

//     public void initialize() {
//         loadSampleData();
//     }

//     private void loadSampleData() {
//         dictionary.put("apple", "apel", "A sweet fruit that is typically red, green, or yellow.");
//         dictionary.put("banana", "pisang", "A long, curved fruit that is yellow when ripe.");
//         dictionary.put("fruit", "buah", "The sweet and fleshy product of a tree or other plant.");
//         dictionary.put("grape", "anggur", "A small, round fruit, typically green or purple.");
//         dictionary.put("orange", "jeruk", "A round, citrus fruit with a tough skin and juicy flesh.");

//         dictionary.put("cat", "kucing", "A small domesticated carnivorous mammal.");
//         dictionary.put("kitten", "anak kucing", "A young cat.");
//         dictionary.put("dog", "anjing", "A domesticated carnivorous mammal, often kept as a pet.");
//         dictionary.put("puppy", "anak anjing", "A young dog.");

//         dictionary.put("elephant", "gajah", "The largest land animal, known for its trunk.");
//         dictionary.put("tusks", "taring", "Long, protruding teeth of some animals, including elephants.");

//         dictionary.put("fish", "ikan", "A cold-blooded vertebrate animal that lives in water.");
//         dictionary.put("shark", "hiu", "A large, aggressive fish known for its sharp teeth.");
//         dictionary.put("whale", "paus", "A large marine mammal that breathes air.");

//         dictionary.put("house", "rumah", "A building for human habitation.");
//         dictionary.put("home", "rumah", "A place where one lives, especially as a member of a family.");
//         dictionary.put("apartment", "apartemen", "A set of rooms forming an individual residence within a building.");

//         dictionary.put("igloo", "iglu", "A dome-shaped shelter built from blocks of snow.");
//         dictionary.put("cabin", "kabina", "A small wooden house or shelter, often in a rural area.");

//         dictionary.put("jellyfish", "ubur-ubur", "A gelatinous marine animal with stinging tentacles.");
//         dictionary.put("sea anemone", "anemon laut",
//                 "A marine animal that resembles a flower and has stinging tentacles.");

//         dictionary.put("kangaroo", "kanguru", "A large marsupial from Australia known for its powerful hind legs.");
//         dictionary.put("wallaby", "walabi", "A small or medium-sized marsupial related to kangaroos.");

//         dictionary.put("lemon", "lemon", "A yellow citrus fruit with a sour taste.");
//         dictionary.put("lime", "limau", "A green citrus fruit similar to a lemon but smaller and sweeter.");

//         dictionary.put("monkey", "monyet", "A primate that is typically smaller and has a long tail.");
//         dictionary.put("ape", "kera", "A large primate that lacks a tail, such as a gorilla.");

//         dictionary.put("nurse", "perawat", "A person trained to care for the sick.");
//         dictionary.put("doctor", "dokter", "A qualified practitioner of medicine.");

//         dictionary.put("ocean", "laut", "A vast body of saltwater that covers most of the Earth.");
//         dictionary.put("sea", "laut", "A large body of saltwater that is smaller than an ocean.");

//         dictionary.put("penguin", "penguin", "A flightless bird that lives in the Southern Hemisphere.");
//         dictionary.put("seagull", "burung camar", "A bird that is often found near the sea.");

//         dictionary.put("queen", "ratu", "The female ruler of a kingdom.");
//         dictionary.put("princess", "putri", "The daughter of a king or queen.");

//         dictionary.put("rainbow", "pelangi", "A multicolored arc that appears in the sky after rain.");
//         dictionary.put("spectrum", "spektum", "The range of colors produced when light is dispersed.");

//         dictionary.put("snake", "ular", "A long, legless reptile.");
//         dictionary.put("lizard", "cicak", "A small reptile with four legs and a long tail.");

//         dictionary.put("tiger", "harimau", "A large wild cat with a striped coat.");
//         dictionary.put("lion", "singa", "A large wild cat known as the king of the jungle.");

//     }

//     // Fungsi pencarian data
//     // public void search(ActionEvent actionEvent) {
//     //     String searchText = searchbar.getText().toLowerCase();
//     //     if (searchText.length() < 1) {
//     //         return;
//     //     } // Case insensitive
//     //     vboxResult.getChildren().clear();
//     //     List<Node<String, String>> results = dictionary.searchBySubstring(searchText);
//     //     for (Node<String, String> result : results) {
//     //         System.out.println(results);
//     //         Label labelEng = new Label("ENG : " + result.key);
//     //         labelEng.setFont(new Font(20));

//     //         Label labelInd = new Label("IND : " + result.value);
//     //         Label description = new Label("Description : " + result.description);
//     //         vboxResult.getChildren().add(labelEng);
//     //         vboxResult.getChildren().add(labelInd);
//     //         vboxResult.getChildren().add(description);
//     //         ImageView imageView = new ImageView();
//     //         String imagePath = getImagePathForWord(result.key);
//     //         Image image = new Image("file:" + imagePath); // Use file path for local images
//     //         imageView.setImage(image);
//     //         imageView.setFitHeight(100); // Set size as needed
//     //         imageView.setFitWidth(100);  // Set size as needed
//     //     }

//     // }

//     // Tambahkan fungsi untuk menambahkan data baru ke kamus
//     public void addWord(String word, String definition) {
//         // dictionary.put(word.toLowerCase(), definition);
//     }

//     public void clearResult(ActionEvent actionEvent) {
//         vboxResult.getChildren().clear();
//         searchbar.clear();

//     }

//     public void search(ActionEvent actionEvent) {
//         String searchText = searchbar.getText().toLowerCase();
//         if (searchText.isEmpty()) {
//             return;
//         }

//         vboxResult.getChildren().clear();
//         List<Node<String, String>> results = dictionary.searchBySubstring(searchText);

//         for (Node<String, String> result : results) {
//             Label labelEng = new Label("ENG: " + result.key);
//             labelEng.setFont(new Font(20));

//             Label labelInd = new Label("IND: " + result.value);
//             Label description = new Label("Description: " + result.description);

//             // Menambahkan gambar atau GIF terkait kata kunci
//             ImageView imageView = new ImageView();
//             String imagePath = getImagePathForWord(result.key);

//             try {
//                 Image image = new Image("file:" + imagePath);
//                 imageView.setImage(image);
//                 imageView.setFitHeight(100); // Ukuran yang diinginkan
//                 imageView.setFitWidth(100);  // Ukuran yang diinginkan
//             } catch (Exception e) {
//                 System.err.println("Error loading image: " + imagePath);
//             }

//             vboxResult.getChildren().addAll(labelEng, labelInd, description, imageView);
//         }

//         // Gimmick: jika kata kunci tertentu ditemukan, tambahkan efek khusus
//         if (searchText.equals("apple")) {
//             addGimmickGif("resources/org/example/tubes/aset/logo/apple.gif");
//         }
//     }

//     /**
//      * Mengembalikan jalur file gambar atau GIF berdasarkan kata kunci.
//      *
//      * @param word Kata kunci yang dicari.
//      * @return Jalur file gambar atau GIF.
//      */
//     private String getImagePathForWord(String word) {
//         switch (word.toLowerCase()) {
//             case "apple":
//                 return "resources/org/example/tubes/aset/logo/apple.gif";
//             case "banana":
//                 return "resources/org/example/tubes/aset/logo/banana.png";
//             // Tambahkan case lain jika diperlukan
//             default:
//                 return "resources/org/example/tubes/aset/logo/default.png"; // Default image
//         }
//     }

//     /**
//      * Menambahkan gimmick berupa GIF ke tampilan.
//      *
//      * @param gifPath Jalur file GIF.
//      */
//     private void addGimmickGif(String gifPath) {
//         try {
//             ImageView gifView = new ImageView(new Image("file:" + gifPath));
//             gifView.setFitHeight(150); // Ukuran yang lebih besar untuk gimmick
//             gifView.setFitWidth(150);
//             vboxResult.getChildren().add(gifView);
//         } catch (Exception e) {
//             System.err.println("Error loading GIF: " + gifPath);
//         }
//     }

// }
package org.example.tubes;

import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class SearchingController {
    @FXML
    private AnchorPane rootPane;
    @FXML
    private TextField searchbar;
    @FXML
    private Button cari;
    @FXML
    private VBox vboxResult;
    @FXML
    private Button clean;

    private rbt<String, String> dictionary = new rbt<>();

    public void click(ActionEvent actionEvent) {
        System.out.println("hello");
    }

    public void fill(ActionEvent actionEvent) {
        System.out.println("jisung ganteng");

    }

    public void initialize() {
        loadSampleData();
    }

    private void loadSampleData() {
        dictionary.put("apple", "apel", "A sweet fruit that is typically red, green, or yellow.");
        dictionary.put("banana", "pisang", "A long, curved fruit that is yellow when ripe.");
        dictionary.put("cat", "kucing", "A small domesticated carnivorous mammal.");
        dictionary.put("dog", "anjing", "A domesticated carnivorous mammal, often kept as a pet.");
    }

    public void search(ActionEvent actionEvent) {
        String searchText = searchbar.getText().toLowerCase();
        if (searchText.isEmpty()) {
            return;
        }

        // Clear previous search results
        vboxResult.getChildren().clear();

        // Perform search
        List<Node<String, String>> results = dictionary.searchBySubstring(searchText);

        // Display search results
        for (Node<String, String> result : results) {
            Label labelEng = new Label("ENG: " + result.key);
            labelEng.setFont(new Font(20));

            Label labelInd = new Label("IND: " + result.value);
            Label description = new Label("Description: " + result.description);

            // Add image
            ImageView imageView = new ImageView();
            String imagePath = getImagePathForWord(result.key);

            try {
                Image image = new Image("file:" + imagePath);
                imageView.setImage(image);
                imageView.setFitHeight(100); // Desired height
                imageView.setFitWidth(100); // Desired width
            } catch (Exception e) {
                System.err.println("Error loading image: " + imagePath);
            }

            // Add elements to the VBox
            vboxResult.getChildren().addAll(labelEng, labelInd, description, imageView);
        }

        // Add gimmick PNG for specific keywords
        if (searchText.equals("apple")) {
            addGimmickImage("src/main/resources/apple.png");
        }
    }

    private String getImagePathForWord(String word) {
        switch (word.toLowerCase()) {
            case "apple":
                return "src/main/resources/apple.png";
            case "banana":
                return "src/main/resources/org/example/tubes/aset/logo/banana.png";
            default:
                return "src/main/resources/org/example/tubes/aset/logo/default.png";
        }
    }

    private void addGimmickImage(String imagePath) {
        try {
            // Menggunakan getClass().getResource untuk memuat gambar dari resources
            Image gimmickImage = new Image(getClass().getResource(imagePath).toExternalForm());
            ImageView gimmickView = new ImageView(gimmickImage);
            gimmickView.setFitHeight(150); // Tinggi gimmick
            gimmickView.setFitWidth(150);  // Lebar gimmick
            vboxResult.getChildren().add(gimmickView);
        } catch (Exception e) {
            System.err.println("Error loading PNG gimmick: " + imagePath);
        }
    }

    public void clearResult(ActionEvent actionEvent) {
        vboxResult.getChildren().clear();
        searchbar.clear();
    }
}