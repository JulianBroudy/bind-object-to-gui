module com.broudy {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.broudy to javafx.fxml;
    exports com.broudy;
}