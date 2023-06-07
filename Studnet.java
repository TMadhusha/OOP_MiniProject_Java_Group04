/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro.mini;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ozone Computers
 */
public class Studnet extends javax.swing.JDialog {
   
    StudentLog stulog=new StudentLog();
      private String uname;
     
    PreparedStatement pst;
    PreparedStatement pst1;
    ResultSet rs;
    ResultSet rs1;
    DB_Connection obj=DB_Connection.getObject();
    Connection conn=obj.getConnection();
    
    File f=null;
    String path=null;
    private ImageIcon format=null;
    byte[] pimage=null;
    
    public Studnet(String uname) {
        initComponents();
        this.uname=uname;
        
        try{
            pst = conn.prepareStatement("select st_id,address,email,Image from students where st_id='"+this.uname+"'");
            pst1 = conn.prepareStatement("select stu_phone from stu_phone where stu_id='"+this.uname+"'");
            rs=pst.executeQuery();
            rs1=pst1.executeQuery();
            
            if(rs.next()){
                ID.setText(rs.getString(1));
                Add.setText(rs.getString(2));
                mail.setText(rs.getString(3));
                
                byte[] pimage=rs.getBytes(4);
                ImageIcon image=new ImageIcon(pimage);
                Image im=image.getImage();
                Image myImg=im.getScaledInstance(lblpro.getWidth(), lblpro.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage=new ImageIcon(myImg);
                lblpro.setIcon(newImage);
            }
            if(rs1.next()){
                PN.setText(rs1.getString(1));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Studnet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        P1 = new javax.swing.JPanel();
        profile = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        Add = new javax.swing.JTextField();
        PN = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        lblpro = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        course = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cou_table = new javax.swing.JTable();
        calcu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        P2 = new javax.swing.JPanel();
        Atten = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        att_combo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        att_table = new javax.swing.JTable();
        CA = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtstid = new javax.swing.JTextField();
        txtcouid = new javax.swing.JTextField();
        GPA = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtst_id = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        other = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        P3 = new javax.swing.JPanel();
        Notice = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        TimeTable = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane9 = new javax.swing.JScrollPane();
        time_table = new javax.swing.JTable();
        Medical = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/fot-logo.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("University of Ruhuna");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Faculty of Technology");

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Management Information System [TECMIS]");

        jButton10.setBackground(new java.awt.Color(255, 255, 204));
        jButton10.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton10.setText("LOG OUT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10)
                                .addGap(89, 89, 89))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton10))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/service.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/agenda.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/stu.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/more.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addGap(101, 101, 101)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P1.setLayout(new java.awt.CardLayout());

        profile.setBackground(new java.awt.Color(255, 255, 153));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 0));
        jLabel23.setText("Update Profile");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Student ID");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Address");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Email");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Phone_No");

        PN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PNActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Clear");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        lblpro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblpro.setForeground(new java.awt.Color(51, 51, 0));
        lblpro.setToolTipText("");

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton13.setText("Choose");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(92, 92, 92)
                .addComponent(jButton9)
                .addGap(493, 493, 493))
            .addGroup(profileLayout.createSequentialGroup()
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PN, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profileLayout.createSequentialGroup()
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24))
                                .addGap(100, 100, 100)
                                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profileLayout.createSequentialGroup()
                                .addComponent(lblpro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13))
                            .addComponent(jLabel23))))
                .addGap(178, 454, Short.MAX_VALUE))
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblpro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profileLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addGap(53, 53, 53)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(206, Short.MAX_VALUE))
        );

        P1.add(profile, "card2");

        course.setBackground(new java.awt.Color(255, 255, 153));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("View course details");

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 51));
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cou_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cou_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "c_id", "c_name", "c_credit", "dep_id", "lec_id", "current_level", "current_Sem", "type", "No_of_quiz", "No_of_assessment"
            }
        ));
        jScrollPane1.setViewportView(cou_table);

        javax.swing.GroupLayout courseLayout = new javax.swing.GroupLayout(course);
        course.setLayout(courseLayout);
        courseLayout.setHorizontalGroup(
            courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseLayout.createSequentialGroup()
                .addGroup(courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(courseLayout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(jLabel9))
                    .addGroup(courseLayout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(jButton1)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        courseLayout.setVerticalGroup(
            courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(427, Short.MAX_VALUE))
        );

        P1.add(course, "card3");

        calcu.setBackground(new java.awt.Color(102, 51, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/attend.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/gpa.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/quarter.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("GPA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("CA marks");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Attendance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jButton4)
                        .addGap(272, 272, 272)
                        .addComponent(jButton3)
                        .addGap(294, 294, 294))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(312, 312, 312)))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jButton2))
                .addGap(198, 198, 198))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        P2.setLayout(new java.awt.CardLayout());

        Atten.setBackground(new java.awt.Color(255, 255, 153));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Select Course");

        att_combo.setBackground(new java.awt.Color(255, 255, 204));
        att_combo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        att_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ICT01", "ICT02", "ICT03", "ICT04" }));
        att_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                att_comboActionPerformed(evt);
            }
        });

        att_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "at_st_id", "at_date", "at_level", "at_cou_id", "at_cou_type", "at_status"
            }
        ));
        jScrollPane2.setViewportView(att_table);

        javax.swing.GroupLayout AttenLayout = new javax.swing.GroupLayout(Atten);
        Atten.setLayout(AttenLayout);
        AttenLayout.setHorizontalGroup(
            AttenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttenLayout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel13)
                .addGap(60, 60, 60)
                .addGroup(AttenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(att_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        AttenLayout.setVerticalGroup(
            AttenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttenLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(AttenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(att_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(336, 336, 336))
        );

        P2.add(Atten, "card2");

        CA.setBackground(new java.awt.Color(255, 255, 153));

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setText("CA Eligibility Check");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/checklist.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "St_id", "Cou_id", "CA_Average", "CA_Status"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("ST_ID");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Course ID");

        javax.swing.GroupLayout CALayout = new javax.swing.GroupLayout(CA);
        CA.setLayout(CALayout);
        CALayout.setHorizontalGroup(
            CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CALayout.createSequentialGroup()
                .addGroup(CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CALayout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel28)
                        .addGroup(CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CALayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel14)
                                .addGap(125, 125, 125))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CALayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(txtstid, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)))
                        .addGroup(CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtcouid, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(CALayout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(450, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        CALayout.setVerticalGroup(
            CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CALayout.createSequentialGroup()
                .addGroup(CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CALayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcouid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jButton11)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CALayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        P2.add(CA, "card3");

        GPA.setBackground(new java.awt.Color(255, 255, 153));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Student ID ");

        txtst_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtst_idActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton12.setText("OK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setText("See GPA and Grade");

        jTable2.setBackground(new java.awt.Color(255, 255, 153));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "SGPA", "Grade", "CGPA"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout GPALayout = new javax.swing.GroupLayout(GPA);
        GPA.setLayout(GPALayout);
        GPALayout.setHorizontalGroup(
            GPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GPALayout.createSequentialGroup()
                .addGap(0, 373, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GPALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(GPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GPALayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtst_id, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButton12)
                        .addGap(404, 404, 404))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GPALayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(460, 460, 460))))
        );
        GPALayout.setVerticalGroup(
            GPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GPALayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel17)
                .addGap(40, 40, 40)
                .addGroup(GPALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12)
                    .addComponent(txtst_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        P2.add(GPA, "card4");

        javax.swing.GroupLayout calcuLayout = new javax.swing.GroupLayout(calcu);
        calcu.setLayout(calcuLayout);
        calcuLayout.setHorizontalGroup(
            calcuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calcuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calcuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        calcuLayout.setVerticalGroup(
            calcuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calcuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        P1.add(calcu, "card4");

        other.setBackground(new java.awt.Color(102, 51, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/notice2.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/timetable.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/medical-history.png"))); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 153));
        jButton5.setText("Notice");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 0, 153));
        jButton6.setText("Time Table");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(153, 0, 153));
        jButton7.setText("Medical");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel18)
                .addGap(323, 323, 323)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(182, 182, 182))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jButton5)
                .addGap(294, 294, 294)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(170, 170, 170))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(24, 24, 24))
        );

        P3.setLayout(new java.awt.CardLayout());

        Notice.setBackground(new java.awt.Color(255, 255, 153));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 0));
        jLabel21.setText("Most Recent Notices");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "subject", "content", "date"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable4);

        Display.setColumns(20);
        Display.setRows(5);
        jScrollPane8.setViewportView(Display);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 0));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/warning.png"))); // NOI18N

        javax.swing.GroupLayout NoticeLayout = new javax.swing.GroupLayout(Notice);
        Notice.setLayout(NoticeLayout);
        NoticeLayout.setHorizontalGroup(
            NoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoticeLayout.createSequentialGroup()
                .addContainerGap(413, Short.MAX_VALUE)
                .addGroup(NoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoticeLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(561, 561, 561))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoticeLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(457, 457, 457))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoticeLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(356, 356, 356))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NoticeLayout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(436, 436, 436))))
        );
        NoticeLayout.setVerticalGroup(
            NoticeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NoticeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        P3.add(Notice, "card2");

        TimeTable.setBackground(new java.awt.Color(255, 255, 153));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Select Department");

        jComboBox1.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DEPICT", "DEPBST", "DEPET" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        time_table.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time_table_id", "dep_id", "level", "semester", "Date", "Course_id", "start_time", "end_time", "location", "type"
            }
        ));
        jScrollPane9.setViewportView(time_table);

        javax.swing.GroupLayout TimeTableLayout = new javax.swing.GroupLayout(TimeTable);
        TimeTable.setLayout(TimeTableLayout);
        TimeTableLayout.setHorizontalGroup(
            TimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeTableLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel22)
                .addGap(45, 45, 45)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(648, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TimeTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        TimeTableLayout.setVerticalGroup(
            TimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimeTableLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(TimeTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        P3.add(TimeTable, "card3");

        Medical.setBackground(new java.awt.Color(255, 255, 153));

        Search.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(0, 153, 51));
        Search.setText("search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jTable5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "med_id", "med_start_day", "med_end_day", "med_st_id", "med_cou_id", "med_condition"
            }
        ));
        jScrollPane10.setViewportView(jTable5);

        javax.swing.GroupLayout MedicalLayout = new javax.swing.GroupLayout(Medical);
        Medical.setLayout(MedicalLayout);
        MedicalLayout.setHorizontalGroup(
            MedicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalLayout.createSequentialGroup()
                .addGap(459, 459, 459)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Search)
                .addContainerGap(416, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedicalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );
        MedicalLayout.setVerticalGroup(
            MedicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedicalLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(MedicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(314, Short.MAX_VALUE))
        );

        P3.add(Medical, "card4");

        javax.swing.GroupLayout otherLayout = new javax.swing.GroupLayout(other);
        other.setLayout(otherLayout);
        otherLayout.setHorizontalGroup(
            otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        otherLayout.setVerticalGroup(
            otherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        P1.add(other, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         P1.removeAll();
         P1.add(profile);
         P1.repaint();
         P1.revalidate();  
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         P1.removeAll();
         P1.add(course);
         P1.repaint();
         P1.revalidate(); 
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
         P1.removeAll();
         P1.add(calcu);
         P1.repaint();
         P1.revalidate(); 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
         P1.removeAll();
         P1.add(other);
         P1.repaint();
         P1.revalidate(); 
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
          try{
       
            pst = conn.prepareStatement("SELECT * FROM cou_mod");
            rs = pst.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            int n=rsmd.getColumnCount();
            DefaultTableModel dtm=(DefaultTableModel)cou_table.getModel();
            dtm.setRowCount(0);
             while(rs.next()){
                 Vector v=new Vector();
                 for(int i=1;i<=n;i++){
                     v.add(rs.getString("cou_id"));
                     v.add(rs.getString("cou_name"));
                     v.add(rs.getString("cou_credit"));
                     v.add(rs.getString("cou_dep_id"));
                     v.add(rs.getString("cou_lec_id"));
                     v.add(rs.getString("current_level"));
                     v.add(rs.getString("current_sem"));
                     v.add(rs.getString("cou_type"));
                     v.add(rs.getString("No_of_quiz"));
                     v.add(rs.getString("No_of_ass"));
                     
                     
                     }
                 dtm.addRow(v);
             }
         
         }catch(Exception ex){
             System.out.println("Error : " + ex.getMessage());
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                   P2.removeAll();
                   P2.add(Atten);
                   P2.repaint();
                   P2.revalidate();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                   P2.removeAll();
                   P2.add(CA);
                   P2.repaint();
                   P2.revalidate();            
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                   P2.removeAll();
                   P2.add(GPA);
                   P2.repaint();
                   P2.revalidate();
                   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void att_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_att_comboActionPerformed
         
        String selectedCouId = att_combo.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) att_table.getModel();
        model.setRowCount(0);
    
    try {
        
        String sql = "SELECT * FROM attendance WHERE at_cou_id = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, selectedCouId);
        
        // Execute the SQL query and populate the JTable with the results
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString("at_st_id"),
                rs.getString("at_date"),
                rs.getString("at_level"),
                rs.getString("at_cou_id"),
                rs.getString("at_cou_type"),
                rs.getString("at_status"),     
            });
        }
    } catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }          
    }//GEN-LAST:event_att_comboActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                P3.removeAll();
                P3.add(Notice);
                P3.repaint();
                P3.revalidate(); 
                
                 try{
                 pst = conn.prepareStatement("SELECT * FROM notice");
                 rs = pst.executeQuery();
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int n=rsmd.getColumnCount();
                 DefaultTableModel dtm=(DefaultTableModel)jTable4.getModel();
                 dtm.setRowCount(0);
                 while(rs.next()){
                 Vector v=new Vector();
                 for(int i=1;i<=n;i++){
                     v.add(rs.getString("notice_id"));
                     v.add(rs.getString("Subject"));
                     v.add(rs.getString("Content"));
                     v.add(rs.getString("Date"));
                     }
                 dtm.addRow(v);
             }
             
             }catch  (Exception ex){
             System.out.println("Error : " + ex.getMessage());
         }     
             
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
                P3.removeAll();
                P3.add(TimeTable);
                P3.repaint();
                P3.revalidate(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
                P3.removeAll();
                P3.add(Medical);
                P3.repaint();
                P3.revalidate(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
                int row = jTable4.rowAtPoint(evt.getPoint());
                if (row >= 0) {
                     String notice_id = jTable4.getValueAt(row, 0).toString();
                     String subject = jTable4.getValueAt(row, 1).toString();
                     String content = jTable4.getValueAt(row, 2).toString();
                     String date = jTable4.getValueAt(row, 3).toString();
        
                     String details = "Notice ID: " + notice_id + "\n"
                     + "Subject: " + subject + "\n"
                     + "Content: " + content + "\n"
                     + "Date: " + date;
                     Display.setText(details);

    }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                     
    String selectedDepartment = jComboBox1.getSelectedItem().toString();
    DefaultTableModel model = (DefaultTableModel)time_table.getModel();
    model.setRowCount(0);
    
    try {
        
        String sql = "SELECT * FROM time_table WHERE department_ID = ?";

        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, selectedDepartment);
        
        // Execute the SQL query and populate the JTable with the results
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getString("Time_Table_ID"),
                rs.getString("Department_ID"),
                rs.getString("Level"),
                rs.getString("Semester"),
                rs.getString("Date"),
                rs.getString("Course_id"),
                rs.getString("Start_time"),
                rs.getString("End_time"),
                rs.getString("Location"),
                rs.getString("Type")       
            });
        }
    } catch (Exception ex) {
        System.out.println("Error: " + ex.getMessage());
    }    
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
                
        String sid =jTextField1.getText();
        String mid,sdate,edate,cid,con;        
            try {
                // Connect to the database and execute the SELECT statement
                String sql="SELECT * FROM medical WHERE med_st_id='"+sid+"'";
                Statement stm=conn.createStatement();
                ResultSet Medi =stm.executeQuery(sql);
                
                // Populate the UI table with the retrieved medical records
                DefaultTableModel df=(DefaultTableModel)jTable5.getModel();
                df.setRowCount(0);
                if (Medi.next()) {
                                
                    mid=Medi.getString("med_id");
                    sdate=Medi.getString("med_start_day");
                    edate=Medi.getString("med_end_day");
                    sid=Medi.getString("med_st_id");
                    cid=Medi.getString("med_cou_id");
                    con=Medi.getString("med_condition");
                    String medi_tbl[]={mid,sdate,edate,sid,cid,con};
     
                    df.addRow(medi_tbl);
                }
                
            } catch (Exception ex) {
                System.out.println("Error : " + ex.getMessage());
            }
        
    }//GEN-LAST:event_SearchActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                                                     
    int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", "Update Record", JOptionPane.YES_NO_OPTION);
    if (p == 0) {
        try {
            String id = ID.getText();
            String address =Add.getText();
            String email =mail.getText();
            String phone =PN.getText();
           
            String sql = "UPDATE students SET Address=?, Email=?,Image=? WHERE st_id='" +this.uname+ "'";
            String sql1="update stu_phone set stu_phone='"+phone+"' where stu_id='"+this.uname+"' ";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            PreparedStatement stmt1 = conn.prepareStatement(sql1);
            
            stmt.setString(1, address);
            stmt.setString(2, email);
            stmt.setBytes(3, pimage);
            
            stmt.execute();
            stmt1.execute();

            
                JOptionPane.showMessageDialog(null, "Record updated successfully.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
   
    }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void PNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PNActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        String sid,cid,avg,status;
        sid=txtstid.getText();
        cid=txtcouid.getText();
        
        try{
           String sql="select * from ca_summary where st_id='"+sid+"'&& cou_id='"+cid+"'";
           Statement stm=conn.createStatement();
           ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)jTable1.getModel();
            tmdl.setRowCount(0);
            
            if(rs.next()){
                sid=rs.getString("st_id");
                cid=rs.getString("cou_id");
                avg=Double.toString(rs.getDouble("CA_average"));
                status=rs.getString("CA_status");
                
                String ca_tbl[]={sid,cid,avg,status};
                tmdl.addRow(ca_tbl);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        dispose();
        new firstGUI().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void txtst_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtst_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtst_idActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        String sid,sgpa,grd,cgpa;
        String id=txtst_id.getText();
        try{
          String sql="select * from gpagrades where st_id='"+id+"'";
          Statement stm= conn.createStatement();
          ResultSet rs=stm.executeQuery(sql);
          DefaultTableModel tmdl=(DefaultTableModel)jTable2.getModel();
          tmdl.setRowCount(0);
          
          if(rs.next()){
              sid=rs.getString("st_id");
              sgpa=rs.getString("SGPA");
              grd=rs.getString("Grade");
              cgpa=rs.getString("CGPA");
              
              String gpa[]={sid,sgpa,grd,cgpa};
              tmdl.addRow(gpa);
          }
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
       JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       File file=chooser.getSelectedFile();
       lblpro.setIcon(new ImageIcon(file.toString()));
       path=file.getAbsolutePath();
       
       try{
           File image=new File(path);
           FileInputStream fis=new FileInputStream(image);
           ImageIcon ii=new ImageIcon(path);
           Image img=ii.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
           ByteArrayOutputStream bos=new ByteArrayOutputStream();
           byte[] buf=new byte[1024];
           
           try{
               for(int readnum;(readnum=fis.read(buf))!=-1;){
                   bos.write(buf,0,readnum);
               }
           }
           catch(IOException ex){
               System.out.println("Error"+ex.getMessage());
            }
           pimage=bos.toByteArray();
       } catch (FileNotFoundException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
             ID.setText("");
             Add.setText("");
             mail.setText("");
             PN.setText("");
             //ProfilePicPath.setText("");
            //jLabel31.setIcon(null);        
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        Studnet st=new Studnet();
//        st.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Add;
    private javax.swing.JPanel Atten;
    private javax.swing.JPanel CA;
    private javax.swing.JTextArea Display;
    private javax.swing.JPanel GPA;
    private javax.swing.JTextField ID;
    private javax.swing.JPanel Medical;
    private javax.swing.JPanel Notice;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JPanel P3;
    private javax.swing.JTextField PN;
    private javax.swing.JButton Search;
    private javax.swing.JPanel TimeTable;
    private javax.swing.JComboBox att_combo;
    private javax.swing.JTable att_table;
    private javax.swing.JPanel calcu;
    private javax.swing.JTable cou_table;
    private javax.swing.JPanel course;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblpro;
    private javax.swing.JTextField mail;
    private javax.swing.JPanel other;
    private javax.swing.JPanel profile;
    private javax.swing.JTable time_table;
    private javax.swing.JTextField txtcouid;
    private javax.swing.JTextField txtst_id;
    private javax.swing.JTextField txtstid;
    // End of variables declaration//GEN-END:variables
}
