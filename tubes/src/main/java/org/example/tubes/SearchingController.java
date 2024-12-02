package org.example.tubes;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import java.io.File;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javafx.scene.control.Label;

public class SearchingController {
        @FXML
        private AnchorPane searchingPane;
        @FXML
        private TextField searchbar;
        @FXML
        private Button cari;
        @FXML
        private Label hasil;
        @FXML
        private VBox vboxResult;
        @FXML
        private Button clean;
        @FXML
        private ToggleButton toggel;
        @FXML
        private Label labelresult;
        @FXML
        private ImageView ImageGimmick;
        @FXML
        private Label timeLabel;

        private rbt<String, String> dictionary = new rbt();

        public void click(ActionEvent actionEvent) {
                // System.out.println("hello");
        }

        // public void fill(ActionEvent actionEvent) {
        // System.out.println("jisung ganteng");

        public void enter(KeyEvent keyEvent) {

        }

        public void enter1(KeyEvent keyEvent) {

        }

        public int countResults(String searchText) {
                int count = 0;
                List<Node<String, String>> results = dictionary.searchBySubstring(searchText.toLowerCase());

                return results.size();
        }

        public int countResultsIND(String searchText) {
                int countIND = 0;

                // Menambahkan .toLowerCase() untuk normalisasi input pencarian
                List<Node<String, String>> results = dictionary.searchBySubstring(searchText.toLowerCase());

                return results.size();
        }

        // public int countResults(String searchText) {
        // int count = 0;
        // List<Node<String, String>> results =
        // dictionary.searchBySubstring(searchText);

        // for (Node<String, String> result : results) {
        // if (result.key.toLowerCase().contains(searchText)) {
        // count++;
        // }

        // }
        // return count;
        // }

        // public int countResultsIND(String searchText) {
        // int countIND = 0;

        // List<Node<String, String>> results =
        // dictionary.searchBySubstring(searchText);

        // for (Node<String, String> result : results) {
        // if (result.value.toLowerCase().contains(searchText)) {
        // countIND++;
        // }
        // }

        // return countIND;
        // }

        public void initialize() {
                loadSampleData();
        }

        private void loadSampleData() {
                dictionary.put("apple", "apel", "A sweet fruit that is typically red, green, or yellow.", "buah manis");
                dictionary.put("banana", "pisang", "A long, curved fruit that is yellow when ripe.",
                                "buah panjang dan melengkung yang berwarna kuning saat matang");
                dictionary.put("fruit", "buah", "The sweet and fleshy product of a tree or other plant.",
                                "Produk manis dan berdaging dari pohon atau tanaman lain");
                dictionary.put("grape", "anggur", "A small, round fruit, typically green or purple.",
                                "Buah kecil berbentuk bulat, biasanya berwarna hijau atau ungu");
                dictionary.put("orange", "jeruk", "A round, citrus fruit with a tough skin and juicy flesh.",
                                "Buah jeruk bulat dengan kulit keras dan daging yang berair");

                dictionary.put("cat", "kucing", "A small domesticated carnivorous mammal.",
                                "Mamalia karnivora kecil yang dipelihara");
                dictionary.put("kitten", "anak kucing", "A young cat.", "Kucing muda");
                dictionary.put("dog", "anjing", "A domesticated carnivorous mammal, often kept as a pet.",
                                "Mamalia karnivora yang dijinakkan, sering dipelihara sebagai hewan peliharaan");
                dictionary.put("puppy", "anak anjing", "A young dog.", "Anjing muda");

                dictionary.put("elephant", "gajah", "The largest land animal, known for its trunk.",
                                "Hewan darat terbesar, dikenal dengan belalainya");
                dictionary.put("tusks", "taring", "Long, protruding teeth of some animals, including elephants.",
                                "Gigi panjang yang menonjol dari beberapa hewan, termasuk gajah");

                dictionary.put("fish", "ikan", "A cold-blooded vertebrate animal that lives in water.",
                                "Hewan bertulang belakang berdarah dingin yang hidup di air");
                dictionary.put("shark", "hiu", "A large, aggressive fish known for its sharp teeth.",
                                "Ikan besar dan agresif yang dikenal dengan gigi tajam");
                dictionary.put("whale", "paus", "A large marine mammal that breathes air.",
                                "Mamalia laut besar yang bernapas dengan udara");

                dictionary.put("house", "rumah", "A building for human habitation.",
                                "Bangunan untuk tempat tinggal manusia");
                dictionary.put("home", "rumah", "A place where one lives, especially as a member of a family.",
                                "Tempat tinggal seseorang, terutama sebagai anggota keluarga");
                dictionary.put("apartment", "apartemen",
                                "A set of rooms forming an individual residence within a building.",
                                "Sekumpulan kamar yang membentuk tempat tinggal individu dalam sebuah bangunan");

                dictionary.put("igloo", "iglu", "A dome-shaped shelter built from blocks of snow.",
                                "Tempat perlindungan berbentuk kubah yang dibangun dari balok salju");
                dictionary.put("cabin", "kabina", "A small wooden house or shelter, often in a rural area.",
                                "Rumah kecil dari kayu atau tempat perlindungan, sering ditemukan di daerah pedesaan");

                dictionary.put("jellyfish", "ubur-ubur", "A gelatinous marine animal with stinging tentacles.",
                                "Hewan laut berbentuk gelatin dengan tentakel yang menyengat");
                dictionary.put("sea anemone", "anemon laut",
                                "A marine animal that resembles a flower and has stinging tentacles.",
                                "Hewan laut yang menyerupai bunga dan memiliki tentakel yang menyengat");

                dictionary.put("kangaroo", "kanguru",
                                "A large marsupial from Australia known for its powerful hind legs.",
                                "Marsupial besar dari Australia yang dikenal dengan kaki belakang yang kuat");
                dictionary.put("wallaby", "walabi", "A small or medium-sized marsupial related to kangaroos.",
                                "Marsupial kecil atau berukuran sedang yang berkerabat dengan kanguru");

                dictionary.put("lemon", "lemon", "A yellow citrus fruit with a sour taste.",
                                "Buah jeruk kuning dengan rasa asam");
                dictionary.put("lime", "limau", "A green citrus fruit similar to a lemon but smaller and sweeter.",
                                "Buah jeruk hijau yang mirip dengan lemon tetapi lebih kecil dan lebih manis");

                dictionary.put("monkey", "monyet", "A primate that is typically smaller and has a long tail.",
                                "Primata yang umumnya lebih kecil dan memiliki ekor panjang");
                dictionary.put("ape", "kera", "A large primate that lacks a tail, such as a gorilla.",
                                "Primata besar yang tidak memiliki ekor, seperti gorila");

                dictionary.put("nurse", "perawat", "A person trained to care for the sick.",
                                "Orang yang dilatih untuk merawat orang sakit");
                dictionary.put("doctor", "dokter", "A qualified practitioner of medicine.",
                                "Praktisi medis yang memenuhi syarat");

                dictionary.put("ocean", "laut", "A vast body of saltwater that covers most of the Earth.",
                                "Sebagian besar tubuh air asin yang menutupi sebagian besar Bumi");
                dictionary.put("sea", "laut", "A large body of saltwater that is smaller than an ocean.",
                                "Tubuh air asin yang lebih besar dari laut tetapi lebih kecil dari samudra");

                dictionary.put("penguin", "penguin", "A flightless bird that lives in the Southern Hemisphere.",
                                "Burung yang tidak dapat terbang dan hidup di Hemisfer Selatan");
                dictionary.put("seagull", "burung camar", "A bird that is often found near the sea.",
                                "Burung yang sering ditemukan di dekat laut");

                dictionary.put("queen", "ratu", "The female ruler of a kingdom.",
                                "Penguasa perempuan dari sebuah kerajaan");
                dictionary.put("princess", "putri", "The daughter of a king or queen.",
                                "Anak perempuan dari seorang raja atau ratu");

                dictionary.put("rainbow", "pelangi", "A multicolored arc that appears in the sky after rain.",
                                "Busur berwarna-warni yang muncul di langit setelah hujan");
                dictionary.put("spectrum", "spektum", "The range of colors produced when light is dispersed.",
                                "Rentang warna yang dihasilkan ketika cahaya terpecah");

                dictionary.put("snake", "ular", "A long, legless reptile.", "Reptil panjang tanpa kaki");
                dictionary.put("lizard", "cicak", "A small reptile with four legs and a long tail.",
                                "Reptil kecil dengan empat kaki dan ekor panjang");

                dictionary.put("tiger", "harimau", "A large wild cat with a striped coat.",
                                "Kucing besar liar dengan bulu belang");
                dictionary.put("lion", "singa", "A large wild cat known as the king of the jungle.",
                                "Kucing besar liar yang dikenal sebagai raja hutan");

                dictionary.put("airplane", "pesawat", "A powered flying vehicle with fixed wings.",
                                "Kendaraan terbang yang digerakkan dengan sayap tetap");
                dictionary.put("train", "kereta api", "A series of connected vehicles that run on rails.",
                                "Serangkaian kendaraan yang terhubung dan berjalan di rel");
                dictionary.put("bicycle", "sepeda", "A two-wheeled vehicle that is powered by pedaling.",
                                "Kendaraan dua roda yang digerakkan dengan mengayuh");
                dictionary.put("car", "mobil",
                                "A motor vehicle with four wheels, typically powered by an internal combustion engine.",
                                "Kendaraan bermotor dengan empat roda, biasanya digerakkan dengan mesin pembakaran dalam");

                dictionary.put("computer", "komputer", "An electronic device for storing and processing data.",
                                "Perangkat elektronik untuk menyimpan dan memproses data");
                dictionary.put("phone", "telepon", "A device used for communication over long distances.",
                                "Perangkat yang digunakan untuk komunikasi jarak jauh");

                dictionary.put("book", "buku", "A set of written, printed, or blank pages fastened together.",
                                "Sekumpulan halaman yang ditulis, dicetak, atau kosong yang diikat bersama");
                dictionary.put("notebook", "buku catatan", "A small book for writing notes.",
                                "Buku kecil untuk menulis catatan");

                dictionary.put("mountain", "gunung", "A large landform that rises prominently above its surroundings.",
                                "Bentang alam besar yang menjulang tinggi di atas sekitarnya");
                dictionary.put("river", "sungai",
                                "A large natural stream of water flowing towards an ocean, lake, or another river.",
                                "Aliran besar air alami yang mengalir menuju lautan, danau, atau sungai lain");

                dictionary.put("forest", "hutan", "A large area covered chiefly with trees and undergrowth.",
                                "Area besar yang sebagian besar tertutup oleh pohon dan tumbuhan bawah");
                dictionary.put("desert", "gurun", "A barren area of land where little precipitation occurs.",
                                "Area tanah tandus di mana sedikit curah hujan terjadi");

                dictionary.put("star", "bintang", "A luminous point in the night sky.",
                                "Titik bercahaya di langit malam");
                dictionary.put("planet", "planet", "A celestial body moving in an elliptical orbit around a star.",
                                "Benda langit yang bergerak dalam orbit elips mengelilingi bintang");

                dictionary.put("keyboard", "papan ketik", "A set of keys that operate a computer or typewriter.",
                                "Sekumpulan tombol yang mengoperasikan komputer atau mesin ketik");
                dictionary.put("mouse", "mouse",
                                "A small handheld device used to control the pointer on a computer screen.",
                                "Perangkat genggam kecil yang digunakan untuk mengontrol penunjuk di layar komputer");
                dictionary.putNode(
                                new NodeGimmick<String, String>("Rotate", "rotasi", "j", "j", performRotationGimmick));
                // dictionary.putNode(new NodeGimmick<String,String>("Fade", "Pudar", "When
                // things get Fade or dissapearing", "Ketika sesuatu mulai memudar tingkat
                // kecerahan atau", performFadingGimmick));
                dictionary.putNode(new NodeGimmick<String, String>("Ramadhan", "Ramadhan", null, null,
                                showRamadhanCountdown));
                dictionary.putNode(new NodeGimmick<String, String>("what time is it", "ini jam berapa", null, null,
                                showAnimatedClock));
        }

        // public void search(ActionEvent actionEvent) {
        //         String searchText = searchbar.getText().toLowerCase();
        //         int count = countResults(searchText);
        //         int countIND = countResultsIND(searchText);
        //         if (searchText.length() < 1) {
        //                 return;
        //         }

        //         vboxResult.getChildren().clear();

        //         if (searchText.equals("rotate")) {
        //                 performRotationGimmick.apply("rotate");
        //                 return;
        //         }

        //         if (searchText.equals("fade")) {
        //                 performFadingGimmick.apply("fade");
        //                 return;
        //         }

        //         if (searchText.equals("what time is it")) {
        //                 showAnimatedClock.apply("what time is it");
        //                 return;
        //         }

        //         if (searchText.equals("ramadhan")) {
        //                 showRamadhanCountdown.apply("ramadhan");
        //                 return;
        //         }
        //         if (toggel.isSelected()) {
        //                 List<Node<String, String>> results = dictionary.searchByValueSubstrings(searchText);
        //                 for (Node<String, String> result : results) {
        //                         Label labelInd = new Label("IND : " + result.value);
        //                         labelInd.setFont(new Font(20));
        //                         Label labelEng = new Label("ENG : " + result.key);
        //                         labelEng.setFont(new Font(20));

        //                         Label description2 = new Label("Indonesia : " + result.descriptionIND);
        //                         Label description1 = new Label("English : " + result.descriptionENG);
        //                         vboxResult.getChildren().addAll(labelInd, labelEng, description2, description1);
        //                         labelresult.setText("About " + results.size() + " Found");
        //                         labelresult.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        //                 }
        //         } else {
        //                 List<Node<String, String>> results = dictionary.searchBySubstring(searchText);
        //                 if (!results.isEmpty() && results.get(0) instanceof NodeGimmick) {
        //                         NodeGimmick nodeGimmick = (NodeGimmick) results.get(0);
        //                         nodeGimmick.getGimmick();
        //                         System.out.println("Found a NodeGimmick: " + nodeGimmick.toString());
        //                         for (Node<String, String> result : results) {
        //                                 Label labelEng = new Label("ENG : " + result.key);
        //                                 labelEng.setFont(new Font(20));
        //                                 Label labelInd = new Label("IND : " + result.value);
        //                                 labelInd.setFont(new Font(20));

        //                                 Label description1 = new Label("English : " + result.descriptionENG);
        //                                 Label description2 = new Label("Indonesia : " + result.descriptionIND);
        //                                 vboxResult.getChildren().addAll(labelEng, labelInd, description1, description2);
        //                                 labelresult.setText("about " + results.size() + " Results found");
        //                                 labelresult.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        //                         }
        //                 }
        //         }

        // }

        public void search(ActionEvent actionEvent) {
                String searchText = searchbar.getText().toLowerCase();
                if (searchText.length() < 1) {
                    return;
                }
            
                vboxResult.getChildren().clear();
            
                // Check for gimmick keywords first
                if (searchText.equals("rotate")) {
                    performRotationGimmick.apply("rotate");
                    return;
                }
            
                if (searchText.equals("fade")) {
                    performFadingGimmick.apply("fade");
                    return;
                }
            
                if (searchText.equals("what time is it")) {
                    showAnimatedClock.apply("what time is it");
                    return;
                }
            
                if (searchText.equals("ramadhan")) {
                    showRamadhanCountdown.apply("ramadhan");
                    return;
                }
            
                // Proceed with normal dictionary search if no gimmick was triggered
                List<Node<String, String>> results;
                if (toggel.isSelected()) {
                    results = dictionary.searchByValueSubstrings(searchText);
                } else {
                    results = dictionary.searchBySubstring(searchText);
                }
            
                // Display results
                if (!results.isEmpty()) {
                    for (Node<String, String> result : results) {
                        Label labelEng = new Label("ENG : " + result.key);
                        labelEng.setFont(new Font(20));
                        Label labelInd = new Label("IND : " + result.value);
                        labelInd.setFont(new Font(20));
            
                        Label description1 = new Label("English : " + result.descriptionENG);
                        Label description2 = new Label("Indonesia : " + result.descriptionIND);
                        vboxResult.getChildren().addAll(labelEng, labelInd, description1, description2);
                    }
                    labelresult.setText("About " + results.size() + " results found");
                    labelresult.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
                } else {
                    labelresult.setText("No results found");
                    labelresult.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
                }
            }

        public void addWord(String word, String definition) {
                // dictionary.put(word.toLowerCase(), definition);
        }

        public void clearResult(ActionEvent actionEvent) {
                vboxResult.getChildren().clear();
                searchbar.clear();

        }

        NodeGimmick.ValueFunction<String> performRotationGimmick = (key) -> {
                RotateTransition rotateTransition = new RotateTransition();
                rotateTransition.setNode(searchbar);
                rotateTransition.setDuration(Duration.seconds(1));
                rotateTransition.setByAngle(360);
                rotateTransition.setCycleCount(1);

                rotateTransition.play();
                return "";
        };

        public void toggleSearch(ActionEvent event) {

        }

        NodeGimmick.ValueFunction<String> performFadingGimmick = (key) -> {
                FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2));
                fadeTransition.setNode(searchbar);
                fadeTransition.setFromValue(1);
                fadeTransition.setToValue(0);
                fadeTransition.play();
                return "";

        };

        NodeGimmick.ValueFunction<String> showAnimatedClock = (key) -> {
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                if (!vboxResult.getChildren().contains(timeLabel)) {
                        timeLabel = new Label();
                        timeLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
                        vboxResult.getChildren().add(timeLabel);
                }

                Timeline timeline = new Timeline(
                                new KeyFrame(Duration.seconds(1), event -> {
                                        String currentTime = LocalTime.now().format(timeFormatter);
                                        timeLabel.setText("Waktu: " + currentTime);
                                }));

                timeline.setCycleCount(Animation.INDEFINITE);
                timeline.play();
                return "";
        };

        NodeGimmick.ValueFunction<String> showRamadhanCountdown = (key) -> {

                LocalDate ramadhanStart = LocalDate.of(2025, 2, 28);
                LocalDate today = LocalDate.now();

                if (today.isAfter(ramadhanStart)) {
                        ramadhanStart = ramadhanStart.plusYears(1);
                }

                long daysUntilRamadhan = ChronoUnit.DAYS.between(today, ramadhanStart);

                Label countdownLabel = new Label("Sisa hari menuju Ramadhan: " + daysUntilRamadhan + " hari.");
                countdownLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

                vboxResult.getChildren().clear();
                vboxResult.getChildren().add(countdownLabel);
                return "";
        };

}
