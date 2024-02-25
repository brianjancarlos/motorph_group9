/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group9.MotorPH_Frames;
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author nativ
 */
public class database_connection {
    
    // Static method to establish a database connection
    Connection conn = null;
    public static Connection java_database_connection(){
          //to establish a database connection
          
        try{
            
            
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/payroll_system", "admin","1234");
            return conn;
            
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
             return null;
        }
       
        
    }
    
}
