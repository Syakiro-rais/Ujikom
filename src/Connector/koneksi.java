/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class koneksi {
        static Connection akses;
        public static Connection akses() throws ClassNotFoundException{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                akses = DriverManager.getConnection("jdbc:mysql://localhost:3306/laundry","root","");
                } catch (SQLException ex) {
                    System.out.println(""+ex);
                }
            return akses;
            } 
        }
       

