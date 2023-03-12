package com.example.simple_javafx_app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label cameleon;

    @FXML private void on_click_niebieski()
    {
        cameleon.setTextFill(Color.BLUE);
    }

    @FXML private void on_click_zieleony()
    {
        cameleon.setTextFill(Color.GREEN);
    }

    @FXML private void on_click_czerwony()
    {
        cameleon.setTextFill(Color.RED);
    }
}