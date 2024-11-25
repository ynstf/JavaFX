package com.example.tp5.JavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;


// create shadow effect and add image into a button
public class JavaFX3 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 320, 240);


        Label lb = new Label("your Data : ");
        lb.setLayoutX(20);
        lb.setLayoutY(20);
        root.getChildren().add(lb);

        TextField tf = new TextField();
        tf.setLayoutX(20);
        tf.setLayoutY(40);
        root.getChildren().add(tf);

        // get image from resources
        InputStream imageStream = getClass().getResourceAsStream("/images/valid.png");
        if (imageStream == null) {
            throw new FileNotFoundException("Resource not found: valid.png");
        }
        Image image = new Image(imageStream);
        ImageView imageView= new ImageView(image);

        // Resize the image by setting fitWidth and fitHeight
        double desiredWidth = 40;  // For example, 200px width
        double desiredHeight = 40; // For example, 150px height
        imageView.setFitWidth(desiredWidth);
        imageView.setFitHeight(desiredHeight);

        // integrate image into button
        Button bt = new Button("Enter");
        bt.setGraphic(imageView);


        bt.setLayoutX(20);
        bt.setLayoutY(80);
        root.getChildren().add(bt);



        // Add shadow on hover
        DropShadow shadow = new DropShadow();
        bt.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)-> {
            bt.setEffect(shadow);
        });

        bt.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)-> {
            bt.setEffect(null);
        });

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}