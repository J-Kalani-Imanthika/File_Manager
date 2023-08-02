package pro.file_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import pro.file_manager.model.UserModel;

import java.net.URL;
import java.util.ResourceBundle;

public class TableFileController implements Initializable {

    @FXML
    private Button btndelfr;

    @FXML
    private Button btnrefre;

    @FXML
    private AnchorPane fxdd;

    @FXML
    private TableView<FileDataview> tablefilereg;

    @FXML
    private TableColumn<FileDataview, String> txtfn3;

    @FXML
    private TableColumn<FileDataview, String> txtft3;

    @FXML
    private TableColumn<FileDataview, String> txtid;

    @FXML
    private TableColumn<FileDataview, String> txtl3;

    @FXML
    void DeleteFR(ActionEvent event) {
    String file_name = tablefilereg.getSelectionModel().getSelectedItem().file_name;

    UserModel userModel = new UserModel();
    boolean result = UserModel.DeleteFR(file_name);

    }

    @FXML
    void RefreshFR() {
        UserModel userModel =new UserModel();

        txtid.setCellValueFactory((new PropertyValueFactory<FileDataview, String>("id")));
        txtfn3.setCellValueFactory((new PropertyValueFactory<FileDataview, String>("file_name")));
        txtft3.setCellValueFactory((new PropertyValueFactory<FileDataview, String>("file_type")));
        txtl3.setCellValueFactory((new PropertyValueFactory<FileDataview, String>("location")));

        tablefilereg.setItems(UserModel.RefreshFR());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
      RefreshFR();



    }
}
