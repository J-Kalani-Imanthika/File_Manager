package pro.file_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import pro.file_manager.model.UserModel;

import java.io.File;

public class FileregController {

        @FXML
        private Button btnInsrt;

        @FXML
        private Button btnbrow;

        @FXML
        private Button btnclear;


        @FXML
        private AnchorPane fxc;

        @FXML
        private TextField txtfl33;

        @FXML
        private TextField txtfn33;

        @FXML
        private TextField txtft33;

        @FXML
        void BrowseFM(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                final FileChooser fc = new FileChooser();
                fc.setTitle("My File Chooser");
                fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All Files", "*.*"));

                File file = fc.showOpenDialog(null);
        }

        @FXML
        void ClearFM(ActionEvent event) {
                txtfn33.setText("");
                txtft33.setText("");
                txtfl33.setText("");
        }

        @FXML
        void InsertFM(ActionEvent event) {
                String file_name = txtfn33.getText();
                String file_type = txtft33.getText();
                String location = txtfl33.getText();

                if (file_name.isBlank() ||
                        file_type.isBlank() ||
                        location.isBlank()
                ) {
                        System.out.println("Error Text");

                } else {
                        UserModel UserModel = new UserModel();
                        UserModel.InsertFM(file_name, file_type, location);

                }
        }





}

