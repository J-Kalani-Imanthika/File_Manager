package pro.file_manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import pro.file_manager.model.UserModel;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button btnclear;

    @FXML
    private Button btnclose;


    @FXML
    private Button btnlog;

    @FXML
    private AnchorPane fxb;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    @FXML
    private Label lbl4;

    @FXML
    private Label lbl5;

    @FXML
    private Label lbl6;

    @FXML
    private TextField txte;

    @FXML
    private TextField txtfn;

    @FXML
    private TextField txtfp;

    @FXML
    private TextField txtln;

    @FXML
    private TextField txtmn;

    @FXML
    private TextField txtpass;

    @FXML
    private TextField txtpass1;

    @FXML
    private Label welcomeText;

    @FXML
    void Clear_form(ActionEvent event) {
        txtfn.setText("");
        txtln.setText("");
        txtmn.setText("");
        txte.setText("");
        txtpass.setText("");
        txtpass1.setText("");
    }


    @FXML
    void Close_form(ActionEvent event) {
        Stage stage = (Stage)fxb.getScene().getWindow();
        stage.close();
    }

    @FXML
    void Login_form(ActionEvent event) throws IOException {
        String f_name = txtfn.getText();
        String l_name = txtln.getText();
        String mobile_no = txtmn.getText();
        String email = txte.getText();
        String password = txtpass.getText();
        String repassword = txtpass1.getText();



if(Validation.isEmpty(f_name) ||
        (Validation.isEmpty(l_name)) ||
                (Validation.isEmpty(mobile_no)) ||
                        (Validation.isEmpty(email)) ||
                                (Validation.isEmpty(f_name)) ||
                                        (Validation.isEmpty(password)) ||
                                                (Validation.isEmpty(repassword))){

                                                    lbl1.setText("Required Fields");
                                                    lbl2.setText("Required Fields");
                                                    lbl3.setText("Required Fields");
                                                    lbl4.setText("Required Fields");
                                                    lbl5.setText("Required Fields");
                                                    lbl6.setText("Required Fields");

                  } else {
            UserModel UserModel = new UserModel();

        boolean result  = UserModel.Login_form(f_name, l_name, mobile_no, email, password, repassword);

            if (result) {
                Parent dash = FXMLLoader.load(FileManager.class.getResource("dashboard-view.fxml"));
                Scene scene = new Scene(dash);
                Stage Dashboard = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Dashboard.setScene(scene);
                Dashboard.show();

            }else {
                lbl1.setText("Incorrect Fields");
                lbl2.setText("Incorrect Fields");
                lbl3.setText("Incorrect Fields");
                lbl4.setText("Incorrect Fields");
                lbl5.setText("Incorrect Fields");
                lbl6.setText("Incorrect Fields");
            }

        }
    }

}

