/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author shashank
 */
public class MySqlConnect {
    Connection conn=null;
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/3300/mini project","root","root");
            JOptionPane.showMessageDialog(null,"connected to database");
            return conn;
        }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }
}

