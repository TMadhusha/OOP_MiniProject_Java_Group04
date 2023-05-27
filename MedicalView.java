/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pro.mini;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class MedicalView extends javax.swing.JFrame {
    String med_id;
    String med_startDate;
    String med_endDate;
    String med_stuId;
    String med_couId;
    String med_con;
    
    public MedicalView() {
        initComponents();
        
        try{

            DB_Connect  db=new DB_Connect();
            Statement stm=db.getCon().createStatement();

            String sql="select * from medical";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)Medical.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                med_id=Integer.toString(rs.getInt("med_id"));
                med_stuId=rs.getString("med_st_id");
                med_startDate=rs.getString("med_start_day");
                med_endDate=rs.getString("med_end_day");
                med_stuId=rs.getString("med_st_id");
                med_couId=rs.getString("med_cou_id");
                med_con=rs.getString("med_condition");
                
                String medtbl[]={med_id,med_startDate,med_endDate,med_stuId,med_couId,med_con};
                tmdl.addRow(medtbl);
            }

        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Medical = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtst_id = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 29, 3));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/medical-report.png"))); // NOI18N
        jLabel1.setText("Medical Details of Student");

        Medical.setBackground(new java.awt.Color(255, 255, 204));
        Medical.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Medical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Med_id", "Med_StratDate", "Med_EndDate", "Med_Student_id", "Med_Course_id", "Med_Condition"
            }
        ));
        Medical.setEnabled(false);
        jScrollPane1.setViewportView(Medical);

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID:");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtst_id, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnok, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtst_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnok)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        String id=txtst_id.getText();
        try{

            DB_Connect  db=new DB_Connect();
            Statement stm=db.getCon().createStatement();

            String sql="select * from medical where med_st_id='"+id+"'";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)Medical.getModel();
            tmdl.setRowCount(0);
            
            if(rs.next()){
                med_id=Integer.toString(rs.getInt("med_id"));
                med_stuId=rs.getString("med_st_id");
                med_startDate=rs.getString("med_start_day");
                med_endDate=rs.getString("med_end_day");
                med_stuId=rs.getString("med_st_id");
                med_couId=rs.getString("med_cou_id");
                med_con=rs.getString("med_condition");
                
                String medtbl[]={med_id,med_startDate,med_endDate,med_stuId,med_couId,med_con};
                tmdl.addRow(medtbl);
            }

        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
        
    }//GEN-LAST:event_btnokActionPerformed

    public static void main(String args[]) {
        MedicalView med=new MedicalView();        
        med.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Medical;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtst_id;
    // End of variables declaration//GEN-END:variables
}
