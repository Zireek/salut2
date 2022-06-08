module com.example.salut2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.salut2 to javafx.fxml;
    exports com.example.salut2;
}