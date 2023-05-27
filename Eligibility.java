/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pro.mini;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Eligibility extends javax.swing.JFrame {
    String st_id;
    String cou_id;
    String ca_avg;
    String att_per;
    String status;
    
    public Eligibility() {
        initComponents();
        
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();

            String sql="select * from eligibility_checking";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)Eligibility.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("st_id");
                cou_id=rs.getString("cou_id");
                ca_avg=Double.toString(rs.getDouble("ca_average"));
                att_per=Integer.toString(rs.getInt("attendance_percentage"));
                status=rs.getString("eligibility_status");
                
                String elgtbl[]={st_id,cou_id,ca_avg,att_per,status};
                tmdl.addRow(elgtbl);
            }
            
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Eligibility = new javax.swing.JTable();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 29, 3));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/check.png"))); // NOI18N
        jLabel1.setText("Student Eligibility");

        Eligibility.setBackground(new java.awt.Color(255, 255, 204));
        Eligibility.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Eligibility.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Course ID", "CA_Average", "Attendance Percentage", "Status"
            }
        ));
        Eligibility.setEnabled(false);
        jScrollPane1.setViewportView(Eligibility);

        btnok.setBackground(new java.awt.Color(72, 29, 3));
        btnok.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setText("See Not Eligible");
        btnok.setBorderPainted(false);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
       
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();

            String sql="select * from eligibility_checking where eligibility_status='Not Eligible'";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)Eligibility.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("st_id");
                cou_id=rs.getString("cou_id");
                ca_avg=Double.toString(rs.getDouble("ca_average"));
                att_per=Integer.toString(rs.getInt("attendance_percentage"));
                status=rs.getString("eligibility_status");
                
                String elgtbl[]={st_id,cou_id,ca_avg,att_per,status};
                tmdl.addRow(elgtbl);
            }
            
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnokActionPerformed

    public static void main(String args[]) {
        Eligibility eg=new Eligibility();
        eg.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Eligibility;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
