module pro.file_manager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens pro.file_manager to javafx.fxml;
    exports pro.file_manager;
    exports pro.file_manager.model;
    opens pro.file_manager.model to javafx.fxml;
}