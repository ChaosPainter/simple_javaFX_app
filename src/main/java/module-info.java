module com.example.simple_javafx_app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simple_javafx_app to javafx.fxml;
    exports com.example.simple_javafx_app;
}