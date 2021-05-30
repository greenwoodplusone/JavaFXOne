package sample;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField data;

    @FXML
    private TextField tool;

    @FXML
    private TextField cost;

    @FXML
    private Button delButton;

    @FXML
    private Button addButton;

    @FXML
    void initialize() {
        addButton.setOnAction(event -> {
            System.out.println("Привет мир!");
        });
    }

}
