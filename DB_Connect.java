/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pro.mini;
import java.sql.*;

public class DB_Connect {
    private Connection con;
    

    private static final String DB_URL = "jdbc:mysql://localhost:3306/tecmis_DB";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public DB_Connect() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        }
    }

    public Connection getCon() {
        return con;
    }
}    

