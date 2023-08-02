package pro.file_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import pro.file_manager.model.UserModel;

public class UserregController {

    @FXML
    private Button btnclear1;

    @FXML
    private Button btnreg;

    @FXML
    private DatePicker datepic;

    @FXML
    private AnchorPane fxff;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton r1;

    @FXML
    private RadioButton r2;

    @FXML
    private TextField txtadrs;

    @FXML
    private TextField txte2;

    @FXML
    private TextField txtfn2;

    @FXML
    private TextField txtini;

    @FXML
    private TextField txtln2;

    @FXML
    private TextField txtmn2;

    @FXML
    private TextField txtnic;

    @FXML
    void ClearUser(ActionEvent event) {
        txtini.setText("");
        txtfn2.setText("");
        txtln2.setText("");
        txtnic.setText("");
        txtmn2.setText("");
        txte2.setText("");
        txtadrs.setText("");
    }

    @FXML
    void RegUser(ActionEvent event) {
        String initial = txtini.getText();
        String f_name = txtfn2.getText();
        String l_name = txtln2.getText();
        String birth_d = String.valueOf(datepic.getValue());
        String gender = "";
        String nic = txtnic.getText();
        String mobile = txtmn2.getText();
        String email = txte2.getText();
        String address = txtadrs.getText();

        if (r1.isSelected()) {
            gender = "Male";
        }else {
            gender = "Female";}

        UserModel UserModel = new UserModel();
        UserModel.RegUser(initial, f_name, l_name, birth_d, gender, nic, mobile, email, address);
    }


}





