package com.example.simpleclock;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import java.util.Formatter;
import java.util.ResourceBundle;

public class simpleClockController implements Initializable{
    @FXML
    private Label welcomeText;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000),event -> welcomeText.setText(String.valueOf(new Date()))));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
}