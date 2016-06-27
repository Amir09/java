/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amir
 */

import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:G:\\java\\Project123\\Project123.sqlite");
            JOptionPane.showMessageDialog(null, "COnnection Established");
            return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
