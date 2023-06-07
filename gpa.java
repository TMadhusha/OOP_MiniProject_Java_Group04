/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pro.mini;

import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class gpa extends javax.swing.JFrame {

    public gpa() {
        initComponents();
        
        String st_id,marks01,marks02,marks03,marks04;
        int c1Index;
        int c2Index;
        int c3Index;
        int c4Index;
        double qn_points1=0.0;
        double qn_points2=0.0;
        double qn_points3=0.0;
        double qn_points4=0.0;
        double final_gpa;
        double f_gpa;
        String gpa,cgpa,grd = null;
        
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            
            String sql="SELECT * FROM final_summary";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl;
            tmdl = (DefaultTableModel)gpatbl.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){                
                for (int i = 0; i <= gpatbl.getRowCount(); i++) {
                c1Index=rs.getInt("final_marks_ict01");
                 if(c1Index<=100 && c1Index>=95){
                    qn_points1=4.0*2;
                }
                else if(c1Index>=90){
                    qn_points1=4.0*2;
                }
                else if(c1Index>=85){                          
                    qn_points1=3.7*2;
                }
                else if(c1Index>=80){                    
                    qn_points1=3.3*2;
                }
                else if(c1Index>=75){
                    qn_points1=3.0*2;
                }
                else if(c1Index>=70){                    
                    qn_points1=2.7*2;
                }
                else if(c1Index>=65){                    
                    qn_points1=2.3*2;
                }
                else if(c1Index>=60){                    
                    qn_points1=2.0*2;
                }
                else if(c1Index>=55){                    
                    qn_points1=1.7*2;
                }
                else if(c1Index>=45){                    
                    qn_points1=1.3*2;
                }
                else if(c1Index>=35){                    
                    qn_points1=1.0*2;
                }
                else if(c1Index<35 && c1Index>=0){                    
                    qn_points1=0.0*2;
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Information..."); 
                }
                
                 c2Index=rs.getInt("final_marks_ict02");
                 if(c2Index<=100 && c2Index>=95){
                    qn_points2=4.0*2;
                }
                else if(c2Index>=90){
                    qn_points2=4.0*2;
                }
                else if(c2Index>=85){                          
                    qn_points2=3.7*2;
                }
                else if(c2Index>=80){                    
                    qn_points2=3.3*2;
                }
                else if(c2Index>=75){
                    qn_points2=3.0*2;
                }
                else if(c2Index>=70){                    
                    qn_points2=2.7*2;
                }
                else if(c2Index>=65){                    
                    qn_points2=2.3*2;
                }
                else if(c2Index>=60){                    
                    qn_points2=2.0*2;
                }
                else if(c2Index>=55){                    
                    qn_points2=1.7*2;
                }
                else if(c2Index>=45){                    
                    qn_points2=1.3*2;
                }
                else if(c2Index>=35){                    
                    qn_points2=1.0*2;
                }
                else if(c2Index<35 && c1Index>=0){                    
                    qn_points2=0.0*2;
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Information..."); 
                }
                 c3Index=rs.getInt("final_marks_ict03");
                 if(c3Index<=100 && c3Index>=95){
                    qn_points1=4.0*2;
                }
                else if(c3Index>=90){
                    qn_points3=4.0*2;
                }
                else if(c3Index>=85){                          
                    qn_points3=3.7*2;
                }
                else if(c3Index>=80){                    
                    qn_points3=3.3*2;
                }
                else if(c3Index>=75){
                    qn_points3=3.0*2;
                }
                else if(c3Index>=70){                    
                    qn_points3=2.7*2;
                }
                else if(c3Index>=65){                    
                    qn_points3=2.3*2;
                }
                else if(c3Index>=60){                    
                    qn_points3=2.0*2;
                }
                else if(c3Index>=55){                    
                    qn_points3=1.7*2;
                }
                else if(c3Index>=45){                    
                    qn_points3=1.3*2;
                }
                else if(c3Index>=35){                    
                    qn_points3=1.0*2;
                }
                else if(c3Index<35 && c3Index>=0){                    
                    qn_points3=0.0*2;
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Information..."); 
                }
                 c4Index=rs.getInt("final_marks_ict04");
                 if(c4Index<=100 && c4Index>=95){
                    qn_points1=4.0*2;
                }
                else if(c4Index>=90){
                    qn_points4=4.0*2;
                }
                else if(c4Index>=85){                          
                    qn_points4=3.7*2;
                }
                else if(c4Index>=80){                    
                    qn_points4=3.3*2;
                }
                else if(c4Index>=75){
                    qn_points4=3.0*2;
                }
                else if(c4Index>=70){                    
                    qn_points4=2.7*2;
                }
                else if(c4Index>=65){                    
                    qn_points4=2.3*2;
                }
                else if(c4Index>=60){                    
                    qn_points4=2.0*2;
                }
                else if(c4Index>=55){                    
                    qn_points4=1.7*2;
                }
                else if(c4Index>=45){                    
                    qn_points4=1.3*2;
                }
                else if(c4Index>=35){                    
                    qn_points4=1.0*2;
                }
                else if(c4Index<35 && c4Index>=0){                    
                    qn_points4=0.0*2;
                }
                else{
                    JOptionPane.showMessageDialog(this,"Invalid Information..."); 
                }
                }
                final_gpa=(qn_points1+qn_points2+qn_points3+qn_points4)/8;
                if(final_gpa==4.0){
                    grd="A+";
                }
                else if(final_gpa>3.7){
                    grd="A";
                }
                else if(final_gpa==3.7){
                    grd="A-";
                }
                else if(final_gpa>=3.3){
                    grd="B+";
                }
                else if(final_gpa>=3.0){
                    grd="B";
                }
                else if(final_gpa>=2.7){
                    grd="B-";
                }
                else if(final_gpa>=2.3){
                    grd="C+";
                }
                else if(final_gpa>=2.0){
                    grd="C";
                }
                else if(final_gpa>=1.7){
                    grd="C-";
                }
                else if(final_gpa>=1.3){
                    grd="D+";
                }
                else if(final_gpa>=1.0){
                    grd="D-";
                }
                else if(final_gpa<1.0 && final_gpa>=0.0){
                    grd="F";
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid GPA");
                }
                DecimalFormat df = new DecimalFormat("#.##");
                gpa = df.format(final_gpa);
                cgpa=df.format(final_gpa);
                st_id=rs.getString("exm_st_id");
                marks01=Integer.toString(rs.getInt("final_marks_ict01"));
                marks02=Integer.toString(rs.getInt("final_marks_ict02"));
                marks03=Integer.toString(rs.getInt("final_marks_ict03"));
                marks04=Integer.toString(rs.getInt("final_marks_ict04"));
                String gpacal[]={st_id,marks01,marks02,marks03,marks04,gpa,grd,cgpa};
                tmdl.addRow(gpacal);
                
                String sql1="insert into gpaGrades(st_id,SGPA,Grade,CGPA)values('"+st_id+"','"+gpa+"','"+grd+"','"+cgpa+"')";
                PreparedStatement pst=db.getCon().prepareStatement(sql1);
                pst.execute();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        gpatbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 29, 3));

        gpatbl.setBackground(new java.awt.Color(255, 255, 153));
        gpatbl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gpatbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "ICT01", "ICT02", "ICT03", "ICT04", "SGPA", "Grade", "CGPA"
            }
        ));
        jScrollPane1.setViewportView(gpatbl);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/grade.png"))); // NOI18N
        jLabel1.setText("GPA and Grades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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

    public static void main(String args[]) {
        gpa mark=new gpa();
        mark.setVisible(true);
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gpatbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
