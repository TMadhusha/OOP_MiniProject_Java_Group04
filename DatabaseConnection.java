/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pro.mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Asfaque
 */
public class DatabaseConnection {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/tecmis";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    public Connection getCon() {
        return con;
    }
    
    

    
}
