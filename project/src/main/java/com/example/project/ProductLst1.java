package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ProductLst1 {
    @FXML
    private Label label1;

    @FXML
    protected void handleButtonClick() {
        label1.setText("Button Clicked!");
    }
}
