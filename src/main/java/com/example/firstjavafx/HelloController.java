package com.example.firstjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    int i = 1;


    @FXML
    protected void onHelloButtonClick() {


        System.out.println("Tlačítko na zničení světa bylo aktivováno");
        System.out.println("tlačítko bylo stisknuto " + i+ " krát");
        i +=1;

            if(i%5==0){
                welcomeText.setText("Václav " + i + " Tlačítko je už vyčerpáno" );
            }
            else{
                welcomeText.setText("Václav " + i  );
            }
        }

}