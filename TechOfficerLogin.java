package com.pro.mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TechOfficerLogin {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/tecmis";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    
    private String userName, deparment;

    public TechOfficerLogin() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            st = con.createStatement();
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    public boolean checkUser(String username) {
        try {
            String query = "select * from technicalOfficers where tecoff_id='" + username + "'";
            rs = st.executeQuery(query);
            if (rs.next()) {
                return true;
            }
           
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return false;
    }

    public boolean checkPassword(String username, String password) {
        try {
            String query = "select * from technicalOfficers where tecoff_id='" + username + "' and l_name='" + password + "'";
            rs = st.executeQuery(query);
            if (rs.next()) {
                this.userName= rs.getString("f_name");
                this.deparment = rs.getString("dep_id");
                return true;
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        return false;
    }

    public boolean authenticate(String username, String password) {
        if (checkUser(username)) {
            if (checkPassword(username, password)) {
                return true;
            }
        }
        return false;
    }
    
    public String getUserName(){
        return userName;
    }

    
    public String getDepartment(){
        return deparment;
    }

}
