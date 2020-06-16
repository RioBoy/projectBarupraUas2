/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectbaruprauas2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Koneksi {
    private static Connection koneksimysql;
    public static Connection koneksiDB() {
        if (koneksimysql==null){
            try {
                String DB="jdbc:mysql://localhost/oop_prauas";
                String user="root";
                String pass="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksimysql = (Connection)DriverManager.getConnection(DB,user,pass);
            } catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
        }
        return koneksimysql;
    }
    
}
