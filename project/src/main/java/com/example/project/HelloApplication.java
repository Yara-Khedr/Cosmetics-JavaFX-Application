package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {











        //this is the code that works

        FXMLLoader ProductLoader = new FXMLLoader(ProductLst1.class.getResource("PLst1.fxml"));
        Scene scene1 = new Scene(ProductLoader.load(), 832, 800);
        ProductLst1 ProductController = ProductLoader.getController();


        //this is the code that works
//        FXMLLoader homeLoader = new FXMLLoader(HomePageController.class.getResource("HomePage.fxml"));
//        Scene scene1 = new Scene(homeLoader.load(), 741, 657);
//        HomePageController homeController = homeLoader.getController();

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(/*"hello-view.fxml"*/"/hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}