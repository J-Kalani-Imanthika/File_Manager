package pro.file_manager;

import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import pro.file_manager.model.UserModel;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.function.Predicate;

public class TableUserController implements Initializable {

    @FXML
    private Button btndelfu;

    @FXML
    private Button btnreru;

    @FXML
    private AnchorPane fxee;

    @FXML
    private TableView<UserDataview> tableureg;


    @FXML
    private TableColumn<UserDataview, String> txta5;

    @FXML
    private TableColumn<UserDataview, String> txtbd5;

    @FXML
    private TableColumn<UserDataview, String> txte5;

    @FXML
    private TableColumn<UserDataview, String> txtfn5;

    @FXML
    private TableColumn<UserDataview, String> txtgen5;

    @FXML
    private TableColumn<UserDataview, String> txtid2;

    @FXML
    private TableColumn<UserDataview, String> txtin;

    @FXML
    private TableColumn<UserDataview, String> txtln5;

    @FXML
    private TableColumn<UserDataview, String> txtm5;

    @FXML
    private TableColumn<UserDataview, String> txtnic5;

    @FXML
    void DeleteFU(ActionEvent event) {
        String f_name = tableureg.getSelectionModel().getSelectedItem().f_name;

        UserModel userModel = new UserModel();
        boolean result = UserModel.DeleteFU(f_name);
    }


    @FXML
    void RefreshRU() {

        UserModel userModel = new UserModel();

        txtid2.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("id")));
        txtin.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("initial")));
        txtfn5.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("f_name")));
        txtln5.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("l_name")));
        txtbd5.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("birth_d")));
        txtgen5.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("gender")));
        txtnic5.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("nic")));
        txtm5.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("mobile")));
        txte5.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("email")));
        txta5.setCellValueFactory((new PropertyValueFactory<UserDataview, String>("address")));

        tableureg.setItems(UserModel.RefreshRU());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        RefreshRU();
    }
}


