package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gPane = new GridPane();
        int count = 0;
        ArrayList<Integer> cards = new ArrayList<>();

        fillArray(cards);
        Collections.shuffle(cards);


        for (int column = 0; column < 3; column++) {
            Image cardsPath = new Image("card/" + cards.get(count) + ".png");
            ImageView image = new ImageView(cardsPath);
            image.setFitHeight(60);
            image.setFitWidth(45);

            gPane.add(image, column, 0);

            count++;
        }

        Scene scene = new Scene(gPane, 135, 60);
        primaryStage.setTitle("3 cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void fillArray(ArrayList<Integer> cards) {
        for (int ammount = 1; ammount <= 54; ammount++) {
            cards.add(ammount);
        }
    }
}