/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author fiza
 */
public class ConnectionProvider {
    public static Connection getCon() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pms_system?useSSL=false&serverTimezone=UTC", 
            "root", 
            "Sm@rtlady25."
        );
        return con;
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "MySQL Driver not found!");
        return null;
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
        return null;
    }
}

    
}
