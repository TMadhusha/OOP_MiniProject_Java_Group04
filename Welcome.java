/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pro.mini;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Welcome extends javax.swing.JFrame {
    LecturerLog leclog=new LecturerLog();
    
    private String uname;
    File f=null;
    String path=null;
    private ImageIcon format=null;
    byte[] pimage=null;
    
    public Welcome(String uname) {
        initComponents(); 
        this.uname=uname;
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            Statement stm1=db.getCon().createStatement();
            
            String sql="select lec_id,f_name,l_name,address,email,Image from lecturer where lec_id='"+this.uname+"'";
            String sql1="select lec_phone from lec_phone where lec_id='"+this.uname+"'";
            ResultSet rs=stm.executeQuery(sql);
            ResultSet rs1=stm1.executeQuery(sql1);
            
            if(rs.next()){
                txtid.setText(rs.getString(1));
                txtfname.setText(rs.getString(2));
                txtlname.setText(rs.getString(3));
                txtadd.setText(rs.getString(4));
                txtemail.setText(rs.getString(5));
                
                byte[] pimage=rs.getBytes(6);
                ImageIcon image=new ImageIcon(pimage);
                Image im=image.getImage();
                Image myImg=im.getScaledInstance(lblpro.getWidth(), lblpro.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage=new ImageIcon(myImg);
                lblpro.setIcon(newImage);
            }
            if(rs1.next()){
                txtphone.setText(rs1.getString(1));
            }
        }
        catch(SQLException e){
         System.out.println("Error: "+e.getMessage());  
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblpro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblfname = new javax.swing.JLabel();
        lbllname = new javax.swing.JLabel();
        lbladd = new javax.swing.JLabel();
        lblemail = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtadd = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btncontinue = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btnupdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblphone = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        btnpro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));

        jPanel2.setBackground(new java.awt.Color(91, 36, 8));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("WELCOME TO TECMIS");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        lblfname.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblfname.setForeground(new java.awt.Color(153, 102, 0));
        lblfname.setText("First Name");

        lbllname.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbllname.setForeground(new java.awt.Color(153, 102, 0));
        lbllname.setText("Last Name");

        lbladd.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lbladd.setForeground(new java.awt.Color(153, 102, 0));
        lbladd.setText("Address");

        lblemail.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblemail.setForeground(new java.awt.Color(153, 102, 0));
        lblemail.setText("E-mail");

        txtfname.setEnabled(false);
        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });

        txtlname.setEnabled(false);

        txtadd.setEnabled(false);

        txtemail.setEnabled(false);

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/pencil.png"))); // NOI18N
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btncontinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/contiinue.png"))); // NOI18N
        btncontinue.setBorderPainted(false);
        btncontinue.setContentAreaFilled(false);
        btncontinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontinueActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel3.setText("Lec_ID");

        txtid.setEnabled(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(255, 255, 204));
        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(153, 102, 0));
        btnupdate.setText("UPDATE");
        btnupdate.setBorderPainted(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblphone.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblphone.setForeground(new java.awt.Color(153, 102, 0));
        lblphone.setText("Phone No");

        txtphone.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblfname)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbladd)
                                    .addComponent(lbllname)
                                    .addComponent(lblemail)
                                    .addComponent(lblphone)))
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEdit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtadd)
                    .addComponent(txtemail)
                    .addComponent(txtfname)
                    .addComponent(txtlname)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(26, 26, 26)
                                .addComponent(btncontinue)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtphone, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnupdate)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfname)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllname)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbladd)
                    .addComponent(txtadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblphone)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEdit)
                                .addGap(26, 26, 26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btncontinue)
                                .addContainerGap(27, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        btnpro.setBackground(new java.awt.Color(102, 51, 0));
        btnpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/plus.png"))); // NOI18N
        btnpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblpro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpro))
                .addGap(0, 29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblpro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnpro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void btncontinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontinueActionPerformed
        // TODO add your handling code here
        dispose();
        Lecturer lec=new Lecturer();
        lec.setVisible(true);
        
    }//GEN-LAST:event_btncontinueActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        
        txtfname.setEnabled(true);
        txtlname.setEnabled(true);
        txtadd.setEnabled(true);
        txtemail.setEnabled(true);
        txtphone.setEnabled(true);
        //btnupdate.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        //btnupdate.setEnabled(true);
        String fname=txtfname.getText();
        String lname=txtlname.getText();
        String add=txtadd.getText();
        String email=txtemail.getText();
        String phone=txtphone.getText();
        try{          
            DB_Connect db=new DB_Connect();
                       
            String sql2="update lecturer set f_name='"+fname+"',l_name='"+lname+"',address='"+add+"',email='"+email+"',Image=? where lec_id='"+this.uname+"'";
            String sql3="update lec_phone set lec_phone='"+phone+"' where lec_id='"+this.uname+"'";
            
            PreparedStatement pst=db.getCon().prepareStatement(sql2);
            PreparedStatement pst1=db.getCon().prepareStatement(sql3);
            
            pst.execute();
            pst.setBytes(1, pimage);
            
            pst1.execute();
            JOptionPane.showMessageDialog(this,"Information updated...");            
        }
        
        catch(SQLException e){
         System.out.println("Error: "+e.getMessage());  
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        firstGUI fr=new firstGUI();
        fr.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_btnproActionPerformed

    public static void main(String args[]) {
//       Welcome wel=new Welcome();
//       wel.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btncontinue;
    private javax.swing.JButton btnpro;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblfname;
    private javax.swing.JLabel lbllname;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblpro;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
