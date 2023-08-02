package pro.file_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard {

    @FXML
    private Button btnclose;

    @FXML
    private Button btnfilesearch;

    @FXML
    private Button btnfm11;

    @FXML
    private Button btnur;

    @FXML
    private Button btnuserserch;

    @FXML
    private AnchorPane fxaa;

    @FXML
    private AnchorPane fxab;

    @FXML
    void Close_dashbrd(ActionEvent event) {
        Stage stage = (Stage)fxaa.getScene().getWindow();
        stage.close();
    }

    @FXML
    void Load_FileReg(ActionEvent event) throws IOException {

        AnchorPane pane = new FXMLLoader().load(FileManager.class.getResource("file-reg-view.fxml"));
        fxab.getChildren().setAll(pane);

    }

    @FXML
    void Load_tablefile(ActionEvent event) throws IOException {

        AnchorPane pane1 = new FXMLLoader().load(FileManager.class.getResource("table-filereg-view.fxml"));
        fxab.getChildren().setAll(pane1);

    }

    @FXML
    void Load_tableuser(ActionEvent event) throws IOException {

        AnchorPane pane2 = new FXMLLoader().load(FileManager.class.getResource("table-userreg-view.fxml"));
        fxab.getChildren().setAll(pane2);

    }

    @FXML
    void Load_userReg(ActionEvent event) throws IOException {

        AnchorPane pane3 = new FXMLLoader().load(FileManager.class.getResource("user-reg-view.fxml"));
        fxab.getChildren().setAll(pane3);

    }

}


