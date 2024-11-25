package com.example.tp5.JavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;


// create event on button
public class JavaFX2 extends Application {
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

        // Label to display the greeting message
        Label greetingLabel = new Label();
        greetingLabel.setLayoutX(20);
        greetingLabel.setLayoutY(120);
        root.getChildren().add(greetingLabel);


        // Add action to the button
        bt.setOnAction(e -> {
            String name = tf.getText(); // Get the name from the TextField
            if (!name.isEmpty()) {
                greetingLabel.setText("Hello, " + name + "!");
            } else {
                greetingLabel.setText("Please enter your name.");
            }
        });

        /*
        // other way to call events
        bt.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                String name = tf.getText(); // Get the name from the TextField
                if (!name.isEmpty()) {
                    greetingLabel.setText("Hello, " + name + "!");
                } else {
                    greetingLabel.setText("Please enter your name.");
                }
            }
        });*/
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}