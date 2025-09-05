package com.example.firstjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickMe  extends Application {
    Button tlacitko;



    @Override
    public void start(Stage primaryStage){
        tlacitko = new Button();
        tlacitko.setText("PAGE_START");
        BorderPane pane = new BorderPane();
        pane.setTop(tlacitko);

        tlacitko = new Button();
        tlacitko.setText("LINE_START");
        pane.setLeft(tlacitko);

        tlacitko = new Button();
        tlacitko.setText("CENTER");
        pane.setCenter(tlacitko);

        tlacitko = new Button();
        tlacitko.setText("LINE_END");
        pane.setRight(tlacitko);

        tlacitko = new Button();
        tlacitko.setText("PAGE_END");
        pane.setBottom(tlacitko);







        Scene scene = new Scene(pane,300,200);
        primaryStage.setScene(scene);
        primaryStage.show();





    }
    public static void main(String[] args) {
        launch(args);
    }
}
