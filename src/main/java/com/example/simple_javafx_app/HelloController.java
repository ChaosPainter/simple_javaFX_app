package com.example.simple_javafx_app;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Label cameleon;

    @FXML
    ImageView obrazek;

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

    @FXML private void on_click_1()
    {
        cameleon.setText("=1");
    }

    @FXML private void on_click_3()
    {
        cameleon.setText("=3");
    }

    @FXML private void on_click_2()
    {
        cameleon.setText("=2");
    }

    @FXML
    public void on_start_show_obrazek()
    {

    }

    @FXML private void on_click_im1()
    {
        obrazek.setImage(new Image(getClass().getResourceAsStream("Calendar.jpg")));
    }
    @FXML private void on_click_im2()
    {
        obrazek.setImage(new Image(getClass().getResourceAsStream("Contacts.jpg")));
    }
    @FXML private void on_click_im3()
    {
        obrazek.setImage(new Image(getClass().getResourceAsStream("Home.jpg")));
    }

    @FXML private void menu_click_close() //tu dodać Platform.exit()
    {
        Platform.exit();
    }
}