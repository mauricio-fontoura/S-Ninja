module com.example.sopraninja {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.sopraninja to javafx.fxml;
    exports com.example.sopraninja;
    exports com.example.sopraninja.controller;
    opens com.example.sopraninja.controller to javafx.fxml;
}