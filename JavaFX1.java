package com.example.tp5.JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;


// create lable, text field and button
public class JavaFX1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);


        Label lb = new Label("your name : ");
        lb.setLayoutX(20);
        lb.setLayoutY(20);
        root.getChildren().add(lb);

        TextField tf = new TextField();
        tf.setLayoutX(20);
        tf.setLayoutY(40);
        root.getChildren().add(tf);

        Button bt = new Button("Enter");
        bt.setLayoutX(20);
        bt.setLayoutY(80);
        root.getChildren().add(bt);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}