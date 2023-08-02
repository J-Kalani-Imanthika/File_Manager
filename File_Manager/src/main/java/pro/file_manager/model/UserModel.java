package pro.file_manager.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import pro.file_manager.FileDataview;
import pro.file_manager.UserDataview;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserModel {
    public static Boolean DeleteFR(String file_name) {
        Boolean result = false;
        Connection conn = Db.getconn();
        String sql = "DELETE FROM file_location_register WHERE file_name = ?";

        try {
            PreparedStatement stmt;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, file_name);
            result = stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static Boolean DeleteFU(String f_name) {
        Boolean result = false;
        Connection conn = Db.getconn();
        String sql = "DELETE FROM user_register WHERE f_name = ?";

        try {
            PreparedStatement stmt;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, f_name);
            result = stmt.executeUpdate() == 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }


    public static ObservableList<UserDataview> RefreshRU() {
        ObservableList<UserDataview> list = FXCollections.observableArrayList();
        Connection conn = Db.getconn();
        String sql = "SELECT * FROM `user_register`";

        try {
            PreparedStatement stmt;
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String initial = rs.getString("initial");
                String f_name = rs.getString("f_name");
                String l_name = rs.getString("l_name");
                String birth_d = rs.getString("birth_d");
                String gender = rs.getString("gender");
                String nic = rs.getString("nic");
                String mobile = rs.getString("mobile");
                String email = rs.getString("email");
                String address = rs.getString("address");

                list.add(new UserDataview(id, initial, f_name, l_name, birth_d, gender, nic, mobile, email, address));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static ObservableList<FileDataview> RefreshFR() {
        ObservableList<FileDataview> list = FXCollections.observableArrayList();
        Connection conn = Db.getconn();
        String sql = "SELECT * FROM `file_location_register`";

        try {
            PreparedStatement stmt;
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String id = rs.getString("id");
                String file_name = rs.getString("file_name");
                String file_type = rs.getString("file_type");
                String location = rs.getString("location");

                list.add(new FileDataview(id, file_name, file_type, location));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }


    public boolean Login_form(String f_name, String l_name, String mobile_no, String email, String password, String repassword) {

        boolean result = false;
        Connection conn = Db.getconn();

        String sql = "SELECT `f_name`, `l_name`, `mobile_no`, `email`, `password`, `repassword` FROM `user_login` WHERE `f_name`=? LIMIT 1";

        try {
            PreparedStatement stmt;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, f_name);

            System.out.println(stmt);
            ResultSet rs = stmt.executeQuery();

            if(rs.next()){
                return true;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
        return result;
    }
    public boolean RegUser(String initial, String f_name, String l_name, String birth_d, String gender, String nic, String mobile, String email, String address) {

        boolean result = false;
        Connection conn = Db.getconn();

        String sql = "INSERT INTO user_register(initial,f_name,l_name,birth_d,gender,nic,mobile,email,address) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, initial);
            stmt.setString(2, f_name);
            stmt.setString(3, l_name);
            stmt.setString(4, birth_d);
            stmt.setString(5, gender);
            stmt.setString(6, nic);
            stmt.setString(7, mobile);
            stmt.setString(8, email);
            stmt.setString(9, address);
            result = stmt.executeUpdate() == 1;
            if (result) {
                System.out.println("Insert Success");
            }
        } catch (SQLException ex) {
            //throw new RuntimeException(se);
            System.out.println(ex.getMessage());
        }
        return result;
    }


    public boolean InsertFM(String file_name, String file_type, String location) {
        boolean result = false;
        Connection conn = Db.getconn();

        String sql = "INSERT INTO file_location_register(file_name,file_type,location) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = null;
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, file_name);
            stmt.setString(2, file_type);
            stmt.setString(3, location);

            result = stmt.executeUpdate() == 1;
            if (result) {
                System.out.println("Insert Success");
            }
        } catch (SQLException se) {
            //throw new RuntimeException(e);
            System.out.println(se.getMessage());
        }
        return result;
    }


}

