/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pro.mini;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FinalResult extends javax.swing.JFrame {
        String st_id,cou_id;               
        String finalmarks;
        int fm;
        String grd = null;        
        
    public FinalResult() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnc1 = new javax.swing.JButton();
        btnc2 = new javax.swing.JButton();
        btnc3 = new javax.swing.JButton();
        btnc4 = new javax.swing.JButton();
        btngpa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FinalMarks = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 29, 3));

        btnc1.setBackground(new java.awt.Color(72, 29, 3));
        btnc1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnc1.setForeground(new java.awt.Color(255, 255, 255));
        btnc1.setText("Course 01");
        btnc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnc1ActionPerformed(evt);
            }
        });

        btnc2.setBackground(new java.awt.Color(72, 29, 3));
        btnc2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnc2.setForeground(new java.awt.Color(255, 255, 255));
        btnc2.setText("Course 02");
        btnc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnc2ActionPerformed(evt);
            }
        });

        btnc3.setBackground(new java.awt.Color(72, 29, 3));
        btnc3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnc3.setForeground(new java.awt.Color(255, 255, 255));
        btnc3.setText("Course 03");
        btnc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnc3ActionPerformed(evt);
            }
        });

        btnc4.setBackground(new java.awt.Color(72, 29, 3));
        btnc4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnc4.setForeground(new java.awt.Color(255, 255, 255));
        btnc4.setText("Course 04");
        btnc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnc4ActionPerformed(evt);
            }
        });

        btngpa.setBackground(new java.awt.Color(72, 29, 3));
        btngpa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btngpa.setForeground(new java.awt.Color(255, 255, 255));
        btngpa.setText("Get GPA");
        btngpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngpaActionPerformed(evt);
            }
        });

        FinalMarks.setBackground(new java.awt.Color(255, 255, 153));
        FinalMarks.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FinalMarks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Course_ID", "Final_Marks", "Grade"
            }
        ));
        jScrollPane1.setViewportView(FinalMarks);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/check-list.png"))); // NOI18N
        jLabel1.setText("Final Results Of Students");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(btnc1)
                            .addGap(46, 46, 46)
                            .addComponent(btnc2)
                            .addGap(41, 41, 41)
                            .addComponent(btnc3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnc4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btngpa)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnc1)
                    .addComponent(btnc2)
                    .addComponent(btnc3)
                    .addComponent(btnc4)
                    .addComponent(btngpa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void btnc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnc1ActionPerformed
        // TODO add your handling code here:        
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            
            String sql="select * from finalmarks_ict01";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)FinalMarks.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("exm_st_id");
                cou_id=rs.getString("exm_cou_id");
                finalmarks=Integer.toString(rs.getInt("final_marks_ict01"));
                fm=rs.getInt("final_marks_ict01");
                
                if(fm<=100 && fm>=95){
                    grd="A+";                    
                }
                else if(fm>=90){
                    grd="A";                    
                }
                else if(fm>=85){
                    grd="A-";
                }
                else if(fm>=80){
                    grd="B+";                    
                }
                else if(fm>=75){
                    grd="B";                    
                }
                else if(fm>=70){
                    grd="B-";                    
                }
                else if(fm>=65){
                    grd="C+";                    
                }
                else if(fm>=60){
                    grd="C";                   
                }
                else if(fm>=55){
                    grd="C-";                    
                }
                else if(fm>=45){
                    grd="D+";                   
                }
                else if(fm>=35){
                    grd="D";                    
                }
                else if(fm<35 && fm>=0){
                    grd="F";                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Information..."); 
                }
                String cou1[] = {st_id,cou_id,finalmarks,grd};
                tmdl.addRow(cou1);
            }
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnc1ActionPerformed

    private void btnc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnc2ActionPerformed
        // TODO add your handling code here:
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            
            String sql="select * from finalmarks_ict02";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)FinalMarks.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("exm_st_id");
                cou_id=rs.getString("exm_cou_id");
                finalmarks=Integer.toString(rs.getInt("final_marks_ict02"));
                fm=rs.getInt("final_marks_ict02");
                
                if(fm<=100 && fm>=95){
                    grd="A+";
                }
                else if(fm>=90){
                    grd="A";
                    
                }
                else if(fm>=85){
                    grd="A-";
                    
                }
                else if(fm>=80){
                    grd="B+";
                }
                else if(fm>=75){
                    grd="B";
                }
                else if(fm>=70){
                    grd="B-";
                }
                else if(fm>=65){
                    grd="C+";
                }
                else if(fm>=60){
                    grd="C";
                }
                else if(fm>=55){
                    grd="C-";
                }
                else if(fm>=45){
                    grd="D+";
                }
                else if(fm>=35){
                    grd="D";
                }
                else if(fm<35 && fm>=0){
                    grd="F";
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Information..."); 
                }
                
                String cou2[]={st_id,cou_id,finalmarks,grd};
                tmdl.addRow(cou2);
            }
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnc2ActionPerformed

    private void btnc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnc3ActionPerformed
        // TODO add your handling code here:
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            
            String sql="select * from finalmarks_ict03";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)FinalMarks.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("exm_st_id");
                cou_id=rs.getString("exm_cou_id");
                finalmarks=Integer.toString(rs.getInt("final_marks_ict03"));
                fm=rs.getInt("final_marks_ict03");
                
                if(fm<=100 && fm>=95){
                    grd="A+";
                }
                else if(fm>=90){
                    grd="A";
                }
                else if(fm>=85){
                    grd="A-";
                }
                else if(fm>=80){
                    grd="B+";                    
                }
                else if(fm>=75){
                    grd="B";                    
                }
                else if(fm>=70){
                    grd="B-";                    
                }
                else if(fm>=65){
                    grd="C+";                    
                }
                else if(fm>=60){
                    grd="C";                    
                }
                else if(fm>=55){
                    grd="C-";
                }
                else if(fm>=45){
                    grd="D+";                    
                }
                else if(fm>=35){
                    grd="D";                    
                }
                else if(fm<35 && fm>=0){
                    grd="F";                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Information..."); 
                }
               
                String cou3[]={st_id,cou_id,finalmarks,grd};
                tmdl.addRow(cou3);
            }
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnc3ActionPerformed

    private void btnc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnc4ActionPerformed
        // TODO add your handling code here:
         try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            
            String sql="select * from finalmarks_ict04";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)FinalMarks.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("exm_st_id");
                cou_id=rs.getString("exm_cou_id");
                finalmarks=Integer.toString(rs.getInt("final_marks_ict04"));
                fm=rs.getInt("final_marks_ict04");
                
                if(fm<=100 && fm>=95){
                    grd="A+";
                }
                else if(fm>=90){
                    grd="A";
                }
                else if(fm>=85){
                    grd="A-";
                }
                else if(fm>=80){
                    grd="B+";
                }
                else if(fm>=75){
                    grd="B";
                }
                else if(fm>=70){
                    grd="B-";
                }
                else if(fm>=65){
                    grd="C+";
                }
                else if(fm>=60){
                    grd="C";
                }
                else if(fm>=55){
                    grd="C-";
                }
                else if(fm>=45){
                    grd="D+";
                }
                else if(fm>=35){
                    grd="D";
                }
                else if(fm<35 && fm>=0){
                    grd="F";
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Information..."); 
                }
                String cou4[]={st_id,cou_id,finalmarks,grd};
                tmdl.addRow(cou4);
            }
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnc4ActionPerformed

    private void btngpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngpaActionPerformed
        // TODO add your handling code here:
        gpa mark=new gpa();
        mark.setVisible(true);
        mark.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btngpaActionPerformed

    public static void main(String args[]) {
       FinalResult fr=new FinalResult();
        fr.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FinalMarks;
    private javax.swing.JButton btnc1;
    private javax.swing.JButton btnc2;
    private javax.swing.JButton btnc3;
    private javax.swing.JButton btnc4;
    private javax.swing.JButton btngpa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
