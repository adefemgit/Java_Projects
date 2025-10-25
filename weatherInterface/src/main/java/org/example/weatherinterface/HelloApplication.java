package org.example.weatherinterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Image image = new Image(getClass().getResource("/images/pexels-vikashkr50-17845104.jpg").toExternalForm());

        ImageView imageview = new ImageView(image);
        imageview.setPreserveRatio(false);
        imageview.setFitWidth(200);



        Text text = new Text("Geo Weather");
        text.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        text.setFill(Color.WHITE);

        Text weatherDisplay = new Text();
        weatherDisplay.setFill(Color.WHITE);
        weatherDisplay.setFont(Font.font("Verdana", 16));


        TextField searchBar = new TextField();
        searchBar.setPromptText("Search your city");
        searchBar.setOnAction(e -> {
            String city = searchBar.getText().trim();
            if (!city.isEmpty()) {
                WeatherService service = new WeatherService();
                WeatherApp weather = service.getWeather(city);
                weatherDisplay.setText("Weather for " + city + ":\n" + weather.displayWeather());
            }
            else {
                weatherDisplay.setText(" Please enter a city name.");
            }
        });
        searchBar.setMaxWidth(200);
        searchBar.setMaxHeight(30);



        VBox vbox = new VBox(20, text, searchBar, weatherDisplay);
        vbox.setAlignment(Pos.CENTER);
        vbox.setMaxWidth(400);


        StackPane root = new StackPane();
        root.getChildren().addAll(imageview, vbox);


        StackPane.setAlignment(vbox, Pos.CENTER);





        Scene scene = new Scene(root, 800, 800);
        imageview.fitWidthProperty().bind(scene.widthProperty());
        imageview.fitHeightProperty().bind(scene.heightProperty());
        stage.setScene(scene);
        stage.setTitle("Geo Weather ");


        stage.show();
    }
}
