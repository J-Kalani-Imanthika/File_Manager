package pro.file_manager.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    public static Connection DbConn;
    public static Connection getconn() {

        try {

            DbConn = DriverManager.getConnection("jdbc:mysql://localhost/file_manager", "root", "");
            System.out.println("Success");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return DbConn;
    }
}
