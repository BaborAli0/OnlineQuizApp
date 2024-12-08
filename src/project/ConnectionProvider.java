package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/qems1", "root", "0242310005101954");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    void connectDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems1", "root", "0242310005101954");
            if (conn != null) {
            System.out.println("Connection success!");
        }
        } catch(Exception e){
            System.out.println("Failed to connect!");
        }
    }

    public static void main(String[] args) {
        ConnectionProvider con = new ConnectionProvider();
        if (con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Failed to connect!");
        }
    }
}
