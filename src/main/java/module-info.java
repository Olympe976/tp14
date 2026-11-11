module sn.ucad.esp.glsi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens sn.ucad.esp.glsi to javafx.fxml;
    exports sn.ucad.esp.glsi;
}
