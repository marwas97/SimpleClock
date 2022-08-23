module com.example.simpleclock {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simpleclock to javafx.fxml;
    exports com.example.simpleclock;
}