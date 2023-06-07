/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pro.mini;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Attendance_summary extends javax.swing.JFrame {
    String st_id;
    String st_lvl;
    String cou_id;
    String cou_type;
    String tot_session;
    String present_days;
    String absent_days;
    String attendance_percentage;
    
    public Attendance_summary() {
        initComponents();
        
         try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            
            String sql="select * from attendance_summary";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)att_summary.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("at_st_id");
                st_lvl=rs.getString("at_level");
                cou_id=rs.getString("at_cou_id");
                cou_type=rs.getString("at_cou_type");
                tot_session=Integer.toString(rs.getInt("total_session"));
                present_days=Integer.toString(rs.getInt("present_days"));
                absent_days=Integer.toString(rs.getInt("absent_days"));
                attendance_percentage=Double.toString(rs.getDouble("attendance_percentage"));
                
                String atsum_tbl[]={st_id,st_lvl,cou_id,cou_type,tot_session,present_days,absent_days,attendance_percentage};
                tmdl.addRow(atsum_tbl);
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
        att_summary = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 29, 3));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/checklist.png"))); // NOI18N
        jLabel1.setText("Attendance Summary");

        att_summary.setBackground(new java.awt.Color(255, 255, 153));
        att_summary.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        att_summary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Level", "Course ID", "Course Type", "Total Sessions", "Present_days", "Absent_days", "Attendance Precentage"
            }
        ));
        att_summary.setEnabled(false);
        jScrollPane1.setViewportView(att_summary);

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID :");

        btnok.setBackground(new java.awt.Color(72, 29, 3));
        btnok.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setText("OK");
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
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(321, 321, 321)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnok))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnok, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        String id=txtid.getText();
        
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            
            String sql="select * from attendance_summary where at_st_id='"+id+"'";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)att_summary.getModel();
            tmdl.setRowCount(0);
            
            if(rs.next()){
                st_id=rs.getString("at_st_id");
                st_lvl=rs.getString("at_level");
                cou_id=rs.getString("at_cou_id");
                cou_type=rs.getString("at_cou_type");
                tot_session=Integer.toString(rs.getInt("total_session"));
                present_days=Integer.toString(rs.getInt("present_days"));
                absent_days=Integer.toString(rs.getInt("absent_days"));
                attendance_percentage=Double.toString(rs.getDouble("attendance_percentage"));
                
                String atsum_tbl[]={st_id,st_lvl,cou_id,cou_type,tot_session,present_days,absent_days,attendance_percentage};
                tmdl.addRow(atsum_tbl);
            }
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnokActionPerformed

    public static void main(String args[]) {
            Attendance_summary at_summ=new Attendance_summary();
            at_summ.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable att_summary;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
