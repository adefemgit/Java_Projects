module org.example.weatherinterface {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens org.example.weatherinterface to javafx.fxml;
    exports org.example.weatherinterface;
}