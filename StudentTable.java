/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pro.mini;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends javax.swing.JFrame {
        String st_id;
        String fname;
        String lname;
        String add;
        String gender;
        String dob;
        String email;
        String dep_id;
        String level;
        String sem;
        
    public StudentTable() {    
        initComponents();
        dispose();
        
        try{
        DB_Connect db=new DB_Connect();
        Statement stm=db.getCon().createStatement();

            String sql="select * from students";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)studentTable.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("st_id");
                fname=rs.getString("f_name");
                lname=rs.getString("l_name");
                add=rs.getString("address");
                gender=rs.getString("gender");
                dob=rs.getString("dob");
                email=rs.getString("email");
                dep_id=rs.getString("dep_id");
                level=rs.getString("current_level");
                sem=rs.getString("current_sem");
                String stutbl[]={st_id,fname,lname,add,gender,dob,email,dep_id,level,sem};
                
                tmdl.addRow(stutbl);
            }

        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtst_id = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 29, 3));

        jScrollPane1.setBackground(new java.awt.Color(72, 29, 3));

        studentTable.setBackground(new java.awt.Color(255, 255, 204));
        studentTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "St_id", "F_name", "L_name", "Address", "Gender", "DOB", "E-mail", "Dep_id", "Current_level", "Current_sem"
            }
        ));
        studentTable.setEnabled(false);
        studentTable.setSelectionBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(studentTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/students.png"))); // NOI18N
        jLabel1.setText("Students Details");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID :");

        txtst_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtst_idActionPerformed(evt);
            }
        });

        btnok.setBackground(new java.awt.Color(72, 29, 3));
        btnok.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtst_id, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtst_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnok)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtst_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtst_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtst_idActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        String id=txtst_id.getText();
        
        try{
        DB_Connect db=new DB_Connect();
        Statement stm=db.getCon().createStatement();

            String sql="select * from students where st_id='"+id+"'";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)studentTable.getModel();
            tmdl.setRowCount(0);
            
            if(rs.next()){
                st_id=rs.getString("st_id");
                fname=rs.getString("f_name");
                lname=rs.getString("l_name");
                add=rs.getString("address");
                gender=rs.getString("gender");
                dob=rs.getString("dob");
                email=rs.getString("email");
                dep_id=rs.getString("dep_id");
                level=rs.getString("current_level");
                sem=rs.getString("current_sem");
                String stutbl[]={st_id,fname,lname,add,gender,dob,email,dep_id,level,sem};
                
                tmdl.addRow(stutbl);
            }

        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }//GEN-LAST:event_btnokActionPerformed

    public static void main(String args[]) {
        StudentTable stbl=new StudentTable();
        stbl.setDefaultCloseOperation(EXIT_ON_CLOSE);
        stbl.setVisible(true);
     }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField txtst_id;
    // End of variables declaration//GEN-END:variables
}
