/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.pro.mini;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lecturer extends javax.swing.JFrame {
    
    public Lecturer() {
        initComponents();
        setVisible(true);
        student.setVisible(false);
        course.setVisible(false);
        exam.setVisible(false);
        noticeview.setVisible(false);
        studetail.setVisible(false);
        checkeligible.setVisible(false);
        medical.setVisible(false);
        addmat.setVisible(false);
        attendance.setVisible(false);
        uploadmarks.setVisible(false);
        //gpaview.setvisible(false);
    // </editor-fold>
        //studetail.setVisible(false);
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlbuttons = new javax.swing.JPanel();
        btncourse = new javax.swing.JButton();
        btnexam = new javax.swing.JButton();
        btnmore = new javax.swing.JButton();
        btnstudent = new javax.swing.JButton();
        pnlheading = new javax.swing.JPanel();
        lbluor = new javax.swing.JLabel();
        lbltec = new javax.swing.JLabel();
        lbltecmis = new javax.swing.JLabel();
        lbllogo = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        pnlCrd = new javax.swing.JPanel();
        pnlstudent = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnstuDetails = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnEligibility = new javax.swing.JButton();
        btnviewMedical = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        student = new javax.swing.JPanel();
        studetail = new javax.swing.JPanel();
        txtstuid = new javax.swing.JTextField();
        lblstuid = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        btnok = new javax.swing.JButton();
        checkeligible = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Eligibility = new javax.swing.JTable();
        btnnot = new javax.swing.JButton();
        medical = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        medicalView = new javax.swing.JTable();
        iblstuid = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        btn1ok = new javax.swing.JButton();
        pnlcourse = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btncourseedit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnatt = new javax.swing.JButton();
        course = new javax.swing.JPanel();
        addmat = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmatid = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txturl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        attendance = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        stuatt = new javax.swing.JTable();
        btnatt_sum = new javax.swing.JButton();
        pnlexam = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnup_marks = new javax.swing.JButton();
        btngpa = new javax.swing.JButton();
        exam = new javax.swing.JPanel();
        uploadmarks = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtstudent = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtexmtype = new javax.swing.JTextField();
        txtmarks = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        gpaview = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Result = new javax.swing.JPanel();
        ICT = new javax.swing.JPanel();
        btncou1 = new javax.swing.JButton();
        btncou2 = new javax.swing.JButton();
        btncou3 = new javax.swing.JButton();
        btncou4 = new javax.swing.JButton();
        btngetgpa = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        FinalMarks = new javax.swing.JTable();
        BST = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        ET = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        pnlothers = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnnotice = new javax.swing.JButton();
        noticeview = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Notice = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 249, 249));

        pnlbuttons.setBackground(new java.awt.Color(72, 29, 3));

        btncourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/book.png"))); // NOI18N
        btncourse.setBorderPainted(false);
        btncourse.setContentAreaFilled(false);
        btncourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncourseActionPerformed(evt);
            }
        });

        btnexam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/examination.png"))); // NOI18N
        btnexam.setBorderPainted(false);
        btnexam.setContentAreaFilled(false);
        btnexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexamActionPerformed(evt);
            }
        });

        btnmore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/more.png"))); // NOI18N
        btnmore.setBorderPainted(false);
        btnmore.setContentAreaFilled(false);
        btnmore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoreActionPerformed(evt);
            }
        });

        btnstudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/student.png"))); // NOI18N
        btnstudent.setBorderPainted(false);
        btnstudent.setContentAreaFilled(false);
        btnstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlbuttonsLayout = new javax.swing.GroupLayout(pnlbuttons);
        pnlbuttons.setLayout(pnlbuttonsLayout);
        pnlbuttonsLayout.setHorizontalGroup(
            pnlbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlbuttonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnstudent)
                    .addGroup(pnlbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btncourse, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnexam, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(pnlbuttonsLayout.createSequentialGroup()
                        .addComponent(btnmore, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(36, 36, 36))
        );
        pnlbuttonsLayout.setVerticalGroup(
            pnlbuttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbuttonsLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnstudent)
                .addGap(62, 62, 62)
                .addComponent(btncourse)
                .addGap(53, 53, 53)
                .addComponent(btnexam)
                .addGap(68, 68, 68)
                .addComponent(btnmore, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pnlheading.setBackground(new java.awt.Color(72, 29, 3));
        pnlheading.setForeground(new java.awt.Color(255, 255, 255));

        lbluor.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        lbluor.setForeground(new java.awt.Color(255, 204, 0));
        lbluor.setText("University of Ruhuna");

        lbltec.setFont(new java.awt.Font("Courier New", 1, 29)); // NOI18N
        lbltec.setForeground(new java.awt.Color(255, 204, 0));
        lbltec.setText("Faculty of Technology");

        lbltecmis.setFont(new java.awt.Font("Courier New", 1, 19)); // NOI18N
        lbltecmis.setForeground(new java.awt.Color(255, 204, 0));
        lbltecmis.setText("Management Information System [TECMIS]");

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/fot-logo.png"))); // NOI18N

        btnlogout.setBackground(new java.awt.Color(255, 255, 153));
        btnlogout.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(72, 29, 3));
        btnlogout.setText("LOG OUT");
        btnlogout.setBorderPainted(false);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlheadingLayout = new javax.swing.GroupLayout(pnlheading);
        pnlheading.setLayout(pnlheadingLayout);
        pnlheadingLayout.setHorizontalGroup(
            pnlheadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlheadingLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lbllogo)
                .addGroup(pnlheadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlheadingLayout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(lbluor))
                    .addGroup(pnlheadingLayout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(lbltec))
                    .addGroup(pnlheadingLayout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(lbltecmis)
                        .addGap(229, 229, 229)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1441, Short.MAX_VALUE))
        );
        pnlheadingLayout.setVerticalGroup(
            pnlheadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlheadingLayout.createSequentialGroup()
                .addGroup(pnlheadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlheadingLayout.createSequentialGroup()
                        .addGroup(pnlheadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlheadingLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbluor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbltecmis))
                            .addGroup(pnlheadingLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lbllogo)))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlheadingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnlogout)))
                .addContainerGap())
        );

        pnlCrd.setLayout(new java.awt.CardLayout());

        pnlstudent.setBackground(new java.awt.Color(255, 255, 153));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/profile.png"))); // NOI18N

        btnstuDetails.setBackground(new java.awt.Color(252, 251, 251));
        btnstuDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnstuDetails.setForeground(new java.awt.Color(153, 51, 0));
        btnstuDetails.setText("Student Details");
        btnstuDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstuDetailsActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/active-user.png"))); // NOI18N

        btnEligibility.setBackground(new java.awt.Color(252, 251, 251));
        btnEligibility.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEligibility.setForeground(new java.awt.Color(153, 102, 0));
        btnEligibility.setText("Check Eligibility");
        btnEligibility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEligibilityActionPerformed(evt);
            }
        });

        btnviewMedical.setBackground(new java.awt.Color(252, 251, 251));
        btnviewMedical.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnviewMedical.setForeground(new java.awt.Color(153, 102, 0));
        btnviewMedical.setText("View Medicals of Students");
        btnviewMedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewMedicalActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/clipboard.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(122, 66, 10));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/selection-tool.png"))); // NOI18N
        jLabel8.setText("Select your option");

        student.setBackground(new java.awt.Color(51, 51, 51));
        student.setLayout(new java.awt.CardLayout());

        studetail.setBackground(new java.awt.Color(102, 51, 0));

        txtstuid.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        txtstuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstuidActionPerformed(evt);
            }
        });

        lblstuid.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lblstuid.setForeground(new java.awt.Color(255, 255, 255));
        lblstuid.setText("Student ID :");

        studentTable.setBackground(new java.awt.Color(255, 255, 153));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stu_Id", "First Name", "Last Name", "Address", "Gender", "DOB", "Email", "Dep_Id", "Current_level", "Current_Sem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        btnok.setBackground(new java.awt.Color(102, 51, 0));
        btnok.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studetailLayout = new javax.swing.GroupLayout(studetail);
        studetail.setLayout(studetailLayout);
        studetailLayout.setHorizontalGroup(
            studetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studetailLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(studetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studetailLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studetailLayout.createSequentialGroup()
                        .addComponent(lblstuid)
                        .addGap(36, 36, 36)
                        .addComponent(txtstuid, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnok)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        studetailLayout.setVerticalGroup(
            studetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studetailLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(studetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstuid)
                    .addComponent(txtstuid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        student.add(studetail, "card3");

        checkeligible.setBackground(new java.awt.Color(102, 51, 0));

        Eligibility.setBackground(new java.awt.Color(255, 255, 153));
        Eligibility.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "St_ID", "Cou_ID", "CA_Avearge", "Attendance Percentage", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Eligibility);

        btnnot.setBackground(new java.awt.Color(102, 51, 0));
        btnnot.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnnot.setForeground(new java.awt.Color(255, 255, 255));
        btnnot.setText("See Not Eligibles");
        btnnot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout checkeligibleLayout = new javax.swing.GroupLayout(checkeligible);
        checkeligible.setLayout(checkeligibleLayout);
        checkeligibleLayout.setHorizontalGroup(
            checkeligibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkeligibleLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnnot, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, checkeligibleLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        checkeligibleLayout.setVerticalGroup(
            checkeligibleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(checkeligibleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        student.add(checkeligible, "card2");

        medical.setBackground(new java.awt.Color(102, 51, 0));

        medicalView.setBackground(new java.awt.Color(255, 255, 153));
        medicalView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Med_Id", "Med_start_date", "Med_end_date", "Med_st_id", "Med_cou_id", "Med_condition"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(medicalView);

        iblstuid.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        iblstuid.setForeground(new java.awt.Color(255, 255, 255));
        iblstuid.setText("Student ID:");

        txtid.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        btn1ok.setBackground(new java.awt.Color(102, 51, 0));
        btn1ok.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btn1ok.setForeground(new java.awt.Color(255, 255, 255));
        btn1ok.setText("OK");
        btn1ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1okActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout medicalLayout = new javax.swing.GroupLayout(medical);
        medical.setLayout(medicalLayout);
        medicalLayout.setHorizontalGroup(
            medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalLayout.createSequentialGroup()
                .addGroup(medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medicalLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(iblstuid)
                        .addGap(18, 18, 18)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn1ok))
                    .addGroup(medicalLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        medicalLayout.setVerticalGroup(
            medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(medicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iblstuid)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1ok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        student.add(medical, "card4");

        javax.swing.GroupLayout pnlstudentLayout = new javax.swing.GroupLayout(pnlstudent);
        pnlstudent.setLayout(pnlstudentLayout);
        pnlstudentLayout.setHorizontalGroup(
            pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlstudentLayout.createSequentialGroup()
                .addGroup(pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlstudentLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(btnstuDetails))
                        .addGap(204, 204, 204)
                        .addGroup(pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlstudentLayout.createSequentialGroup()
                                .addComponent(btnEligibility)
                                .addGap(233, 233, 233)
                                .addComponent(btnviewMedical))
                            .addGroup(pnlstudentLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(253, 253, 253)
                                .addComponent(jLabel14))))
                    .addGroup(pnlstudentLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel8))
                    .addGroup(pnlstudentLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1421, Short.MAX_VALUE))
        );
        pnlstudentLayout.setVerticalGroup(
            pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlstudentLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlstudentLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnstuDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlstudentLayout.createSequentialGroup()
                        .addGroup(pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEligibility, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnviewMedical, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCrd.add(pnlstudent, "card5");

        pnlcourse.setBackground(new java.awt.Color(255, 255, 153));
        pnlcourse.setForeground(new java.awt.Color(0, 160, 94));

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(122, 66, 10));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/selection-tool.png"))); // NOI18N
        jLabel10.setText("Select your option");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/courses.png"))); // NOI18N

        btncourseedit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btncourseedit.setForeground(new java.awt.Color(153, 102, 0));
        btncourseedit.setText("Add Course Matrial ");
        btncourseedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncourseeditActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/attendance.png"))); // NOI18N

        btnatt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnatt.setForeground(new java.awt.Color(153, 102, 0));
        btnatt.setText("Attendance");
        btnatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnattActionPerformed(evt);
            }
        });

        course.setLayout(new java.awt.CardLayout());

        addmat.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("File Name");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("URL");

        txtmatid.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        txtfname.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        txturl.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 51, 0));
        jButton2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CHECK ACCESS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 51, 0));
        jButton3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CANCEL");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addmatLayout = new javax.swing.GroupLayout(addmat);
        addmat.setLayout(addmatLayout);
        addmatLayout.setHorizontalGroup(
            addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addmatLayout.createSequentialGroup()
                .addGroup(addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addmatLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(38, 38, 38)
                        .addComponent(jButton2)
                        .addGap(46, 46, 46)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addmatLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmatid)
                            .addComponent(txtfname)
                            .addComponent(txturl, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        addmatLayout.setVerticalGroup(
            addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addmatLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtmatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txturl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addmatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        course.add(addmat, "card2");

        attendance.setBackground(new java.awt.Color(102, 51, 0));

        stuatt.setBackground(new java.awt.Color(255, 255, 153));
        stuatt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Date", "Student Level", "Course ID", "Course Type", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(stuatt);

        btnatt_sum.setBackground(new java.awt.Color(102, 51, 0));
        btnatt_sum.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnatt_sum.setForeground(new java.awt.Color(255, 255, 255));
        btnatt_sum.setText("Get Attendance Summary");
        btnatt_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatt_sumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attendanceLayout = new javax.swing.GroupLayout(attendance);
        attendance.setLayout(attendanceLayout);
        attendanceLayout.setHorizontalGroup(
            attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceLayout.createSequentialGroup()
                .addGroup(attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attendanceLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(attendanceLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnatt_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        attendanceLayout.setVerticalGroup(
            attendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendanceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnatt_sum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        course.add(attendance, "card3");

        javax.swing.GroupLayout pnlcourseLayout = new javax.swing.GroupLayout(pnlcourse);
        pnlcourse.setLayout(pnlcourseLayout);
        pnlcourseLayout.setHorizontalGroup(
            pnlcourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcourseLayout.createSequentialGroup()
                .addGroup(pnlcourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlcourseLayout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel15)
                        .addGap(210, 210, 210)
                        .addComponent(jLabel5))
                    .addGroup(pnlcourseLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel10))
                    .addGroup(pnlcourseLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btncourseedit)
                        .addGap(209, 209, 209)
                        .addComponent(btnatt))
                    .addGroup(pnlcourseLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1696, Short.MAX_VALUE))
        );
        pnlcourseLayout.setVerticalGroup(
            pnlcourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcourseLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(pnlcourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlcourseLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(btncourseedit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlcourseLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(btnatt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlCrd.add(pnlcourse, "card2");

        pnlexam.setBackground(new java.awt.Color(255, 255, 153));
        pnlexam.setForeground(new java.awt.Color(0, 0, 51));

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(122, 66, 10));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/selection-tool.png"))); // NOI18N
        jLabel4.setText("Select your option");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/upload marks.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/view.png"))); // NOI18N

        btnup_marks.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnup_marks.setForeground(new java.awt.Color(153, 102, 0));
        btnup_marks.setText("Upload Marks");
        btnup_marks.setBorderPainted(false);
        btnup_marks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnup_marksActionPerformed(evt);
            }
        });

        btngpa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btngpa.setForeground(new java.awt.Color(153, 102, 0));
        btngpa.setText("View Results");
        btngpa.setBorderPainted(false);
        btngpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngpaActionPerformed(evt);
            }
        });

        exam.setBackground(new java.awt.Color(255, 255, 204));
        exam.setLayout(new java.awt.CardLayout());

        uploadmarks.setBackground(new java.awt.Color(102, 51, 0));

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student ID:");

        jLabel13.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Course ID:");

        jLabel16.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Exam Type:");

        jLabel19.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Marks");

        txtstudent.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        txtcourse.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        txtexmtype.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        txtmarks.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jButton4.setBackground(new java.awt.Color(102, 51, 0));
        jButton4.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("UPLOAD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 51, 0));
        jButton5.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("CANCEL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uploadmarksLayout = new javax.swing.GroupLayout(uploadmarks);
        uploadmarks.setLayout(uploadmarksLayout);
        uploadmarksLayout.setHorizontalGroup(
            uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadmarksLayout.createSequentialGroup()
                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uploadmarksLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadmarksLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, uploadmarksLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(63, 63, 63))
                                    .addGroup(uploadmarksLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(67, 67, 67)))
                                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtcourse, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtstudent)))
                            .addGroup(uploadmarksLayout.createSequentialGroup()
                                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19))
                                .addGap(74, 74, 74)
                                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtexmtype, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(txtmarks))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(uploadmarksLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jButton4)
                        .addGap(73, 73, 73)
                        .addComponent(jButton5)))
                .addGap(382, 382, 382))
        );
        uploadmarksLayout.setVerticalGroup(
            uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uploadmarksLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtstudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtexmtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtmarks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(uploadmarksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        exam.add(uploadmarks, "card2");

        gpaview.setBackground(new java.awt.Color(255, 255, 204));

        jButton6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButton6.setText("ICT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButton7.setText("ET");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jButton8.setText("BST");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel20.setText("Departments");

        Result.setLayout(new java.awt.CardLayout());

        ICT.setBackground(new java.awt.Color(102, 51, 0));

        btncou1.setBackground(new java.awt.Color(102, 51, 0));
        btncou1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncou1.setForeground(new java.awt.Color(255, 255, 255));
        btncou1.setText("COURSE 01");
        btncou1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncou1ActionPerformed(evt);
            }
        });

        btncou2.setBackground(new java.awt.Color(102, 51, 0));
        btncou2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncou2.setForeground(new java.awt.Color(255, 255, 255));
        btncou2.setText("COURSE 02");
        btncou2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncou2ActionPerformed(evt);
            }
        });

        btncou3.setBackground(new java.awt.Color(102, 51, 0));
        btncou3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncou3.setForeground(new java.awt.Color(255, 255, 255));
        btncou3.setText("COURSE 03");
        btncou3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncou3ActionPerformed(evt);
            }
        });

        btncou4.setBackground(new java.awt.Color(102, 51, 0));
        btncou4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncou4.setForeground(new java.awt.Color(255, 255, 255));
        btncou4.setText("COURSE 04");
        btncou4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncou4ActionPerformed(evt);
            }
        });

        btngetgpa.setBackground(new java.awt.Color(102, 51, 0));
        btngetgpa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btngetgpa.setForeground(new java.awt.Color(255, 255, 255));
        btngetgpa.setText("Get GPA");
        btngetgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngetgpaActionPerformed(evt);
            }
        });

        FinalMarks.setBackground(new java.awt.Color(255, 255, 153));
        FinalMarks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Course ID", "Final Marks", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FinalMarks.setSelectionBackground(new java.awt.Color(255, 255, 204));
        jScrollPane5.setViewportView(FinalMarks);

        javax.swing.GroupLayout ICTLayout = new javax.swing.GroupLayout(ICT);
        ICT.setLayout(ICTLayout);
        ICTLayout.setHorizontalGroup(
            ICTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ICTLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(btncou1)
                .addGap(43, 43, 43)
                .addComponent(btncou2)
                .addGap(31, 31, 31)
                .addComponent(btncou3)
                .addGap(47, 47, 47)
                .addComponent(btncou4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btngetgpa)
                .addGap(37, 37, 37))
            .addGroup(ICTLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        ICTLayout.setVerticalGroup(
            ICTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ICTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ICTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncou1)
                    .addComponent(btncou2)
                    .addComponent(btncou3)
                    .addComponent(btncou4)
                    .addComponent(btngetgpa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );

        Result.add(ICT, "card2");

        jLabel22.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel22.setText("No Results uploaded...");

        javax.swing.GroupLayout BSTLayout = new javax.swing.GroupLayout(BST);
        BST.setLayout(BSTLayout);
        BSTLayout.setHorizontalGroup(
            BSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BSTLayout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        BSTLayout.setVerticalGroup(
            BSTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BSTLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel22)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        Result.add(BST, "card4");

        jLabel21.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel21.setText("No Results Uploaded...");

        javax.swing.GroupLayout ETLayout = new javax.swing.GroupLayout(ET);
        ET.setLayout(ETLayout);
        ETLayout.setHorizontalGroup(
            ETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ETLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
        );
        ETLayout.setVerticalGroup(
            ETLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ETLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        Result.add(ET, "card3");

        javax.swing.GroupLayout gpaviewLayout = new javax.swing.GroupLayout(gpaview);
        gpaview.setLayout(gpaviewLayout);
        gpaviewLayout.setHorizontalGroup(
            gpaviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpaviewLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(gpaviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gpaviewLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(27, 27, 27)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        gpaviewLayout.setVerticalGroup(
            gpaviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gpaviewLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(gpaviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        exam.add(gpaview, "card3");

        javax.swing.GroupLayout pnlexamLayout = new javax.swing.GroupLayout(pnlexam);
        pnlexam.setLayout(pnlexamLayout);
        pnlexamLayout.setHorizontalGroup(
            pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlexamLayout.createSequentialGroup()
                .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlexamLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addComponent(btnup_marks))
                        .addGap(200, 200, 200)
                        .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(btngpa)))
                    .addGroup(pnlexamLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel4))
                    .addGroup(pnlexamLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1691, Short.MAX_VALUE))
        );
        pnlexamLayout.setVerticalGroup(
            pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlexamLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlexamLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btngpa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlexamLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnup_marks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCrd.add(pnlexam, "card3");

        pnlothers.setBackground(new java.awt.Color(255, 255, 153));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/selection-tool.png"))); // NOI18N
        jLabel3.setText("Select your option");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pro/mini/notice.png"))); // NOI18N

        btnnotice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnnotice.setForeground(new java.awt.Color(153, 51, 0));
        btnnotice.setText("View Notice");
        btnnotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnoticeActionPerformed(evt);
            }
        });

        noticeview.setBackground(new java.awt.Color(102, 51, 0));

        Notice.setBackground(new java.awt.Color(255, 255, 153));
        Notice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Notice ID", "Subject", "Content", "Published Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Notice);

        javax.swing.GroupLayout noticeviewLayout = new javax.swing.GroupLayout(noticeview);
        noticeview.setLayout(noticeviewLayout);
        noticeviewLayout.setHorizontalGroup(
            noticeviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeviewLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        noticeviewLayout.setVerticalGroup(
            noticeviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noticeviewLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlothersLayout = new javax.swing.GroupLayout(pnlothers);
        pnlothers.setLayout(pnlothersLayout);
        pnlothersLayout.setHorizontalGroup(
            pnlothersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlothersLayout.createSequentialGroup()
                .addGroup(pnlothersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlothersLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3))
                    .addGroup(pnlothersLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addGroup(pnlothersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnotice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(pnlothersLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(noticeview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1519, Short.MAX_VALUE))
        );
        pnlothersLayout.setVerticalGroup(
            pnlothersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlothersLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnotice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(noticeview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCrd.add(pnlothers, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlbuttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCrd, javax.swing.GroupLayout.PREFERRED_SIZE, 2617, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlheading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlheading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCrd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlbuttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncourseActionPerformed
        pnlCrd.removeAll();
        pnlCrd.add(pnlcourse);
        pnlCrd.repaint();
        pnlCrd.revalidate();  
        student.setVisible(false);
        exam.setVisible(false);
        noticeview.setVisible(false);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btncourseActionPerformed

    private void btnexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexamActionPerformed
        pnlCrd.removeAll();
        pnlCrd.add(pnlexam);
        pnlCrd.repaint();
        pnlCrd.revalidate();
        student.setVisible(false);
        course.setVisible(false);
        noticeview.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnexamActionPerformed

    private void btnmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoreActionPerformed
        pnlCrd.removeAll();
        pnlCrd.add(pnlothers);
        pnlCrd.repaint();
        pnlCrd.revalidate();
        student.setVisible(false);
        exam.setVisible(false);
        course.setVisible(false);
    }//GEN-LAST:event_btnmoreActionPerformed

    private void btnstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudentActionPerformed
        // TODO add your handling code here:
        pnlCrd.removeAll();
        pnlCrd.add(pnlstudent);
        pnlCrd.repaint();
        pnlCrd.revalidate();
        course.setVisible(false);
        exam.setVisible(false);
        noticeview.setVisible(false);
    }//GEN-LAST:event_btnstudentActionPerformed

    private void btnviewMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewMedicalActionPerformed
        // TODO add your handling code here:
        /*MedicalView med=new MedicalView();
        med.setVisible(true);
        med.setDefaultCloseOperation(DISPOSE_ON_CLOSE);*/
        student.setVisible(true);
        student.removeAll();
        student.add(medical);
        student.repaint();
        student.revalidate(); 
        medical.setVisible(true);
        
        String med_id;
        String med_startDate;
        String med_endDate;
        String med_stuId;
        String med_couId;
        String med_con;
        
        try{

            DB_Connect  db=new DB_Connect();
            Statement stm=db.getCon().createStatement();

            String sql="select * from medical";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)medicalView.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                med_id=Integer.toString(rs.getInt("med_id"));
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
        
    }//GEN-LAST:event_btnviewMedicalActionPerformed

    private void btnEligibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEligibilityActionPerformed
        // TODO add your handling code here:
        /*Eligibility eg=new Eligibility();
        eg.setVisible(true);
        eg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);*/
        
        student.setVisible(true);
        student.removeAll();
        student.add(checkeligible);
        student.repaint();
        student.revalidate(); 
        checkeligible.setVisible(true);
        
        String st_id;
        String cou_id;
        String ca_avg;
        String att_per;
        String status;
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
        
    }//GEN-LAST:event_btnEligibilityActionPerformed

    private void btnstuDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstuDetailsActionPerformed
        // TODO add your handling code here:
        /*StudentTable stble=new StudentTable();
        stble.setVisible(true);
        stble.setDefaultCloseOperation(DISPOSE_ON_CLOSE);*/
        student.setVisible(true);
        student.removeAll();
        student.add(studetail);
        student.repaint();
        student.revalidate(); 
        
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
        // TODO add your handling code here:

    }//GEN-LAST:event_btnstuDetailsActionPerformed

    private void btnnoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnoticeActionPerformed
        // TODO add your handling code here:
        /*NoticeView nt=new NoticeView();
        nt.setVisible(true);
        nt.setDefaultCloseOperation(DISPOSE_ON_CLOSE); */
        noticeview.setVisible(true);
        try{

            DB_Connect  db=new DB_Connect();
            Statement stm=db.getCon().createStatement();

            String sql="select * from notice";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)Notice.getModel();
            tmdl.setRowCount(0);
            while(rs.next()){
                String notice_id=rs.getString("notice_id");
                String subject=rs.getString("subject");
                String content=rs.getString("content");
                String date=rs.getString("DATE");
                
                String stutbl[]={notice_id,subject,content,date};
                tmdl.addRow(stutbl);
            }

        }catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnnoticeActionPerformed

    private void btnattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnattActionPerformed
        // TODO add your handling code here:
        /*Attendance at=new Attendance();
        at.setVisible(true);
        at.setDefaultCloseOperation(DISPOSE_ON_CLOSE);*/
        course.setVisible(true);
        course.removeAll();
        course.add(attendance);
        course.repaint();
        course.revalidate();
        attendance.setVisible(true);
        
        String st_id;
    String date;
    String st_lvl;
    String cou_id;
    String cou_type;
    String status;
    
    try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
            
            String sql="select * from attendance";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)stuatt.getModel();
            tmdl.setRowCount(0);
            
            while(rs.next()){
                st_id=rs.getString("at_st_id");
                date=rs.getString("at_date");
                st_lvl=rs.getString("at_level");
                cou_id=rs.getString("at_cou_id");
                cou_type=rs.getString("at_cou_type");
                status=rs.getString("at_status");
                
                String at_tbl[]={st_id,date,st_lvl,cou_id,cou_type,status};
                tmdl.addRow(at_tbl);
            }
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnattActionPerformed

    private void btnup_marksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnup_marksActionPerformed
        // TODO add your handling code here:
        /*UploadMarks upm=new UploadMarks();
        upm.setVisible(true);
        upm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);*/
        exam.setVisible(true);
        exam.removeAll();
        exam.add(uploadmarks);
        course.repaint();
        course.revalidate();
        uploadmarks.setVisible(true);
    }//GEN-LAST:event_btnup_marksActionPerformed

    private void btngpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngpaActionPerformed
        // TODO add your handling code here:
       /* FinalResult fr=new FinalResult();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);*/
        exam.setVisible(true);
        exam.removeAll();
        exam.add(gpaview);
        course.repaint();
        course.revalidate();
        gpaview.setVisible(true);
        Result.setVisible(false);
    }//GEN-LAST:event_btngpaActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        firstGUI obj1=new firstGUI();
        obj1.setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void txtstuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstuidActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        String id=txtstuid.getText();
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

    private void btnnotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnotActionPerformed
        // TODO add your handling code here:
        String st_id;
        String cou_id;
        String ca_avg;
        String att_per;
        String status;
        
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
    }//GEN-LAST:event_btnnotActionPerformed

    private void btn1okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1okActionPerformed
        // TODO add your handling code here:
        
        String med_id;
        String med_startDate;
        String med_endDate;
        String med_stuId;
        String med_couId;
        String med_con;
        
        String id=txtid.getText();
        try{

            DB_Connect  db=new DB_Connect();
            Statement stm=db.getCon().createStatement();

            String sql="select * from medical where med_st_id='"+id+"'";
            ResultSet rs=stm.executeQuery(sql);
            DefaultTableModel tmdl=(DefaultTableModel)medicalView.getModel();
            tmdl.setRowCount(0);
            
            if(rs.next()){
                med_id=Integer.toString(rs.getInt("med_id"));
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
    }//GEN-LAST:event_btn1okActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id=txtmatid.getText();
        String fname=txtfname.getText();
        String path=txturl.getText();
        
        try{
            DB_Connect db=new DB_Connect();
            Statement stm=db.getCon().createStatement();
          
          String sql="insert into cou_material(cou_mat_id,cou_mat_name,cou_mat_path)values('"+id+"','"+fname+"','"+path+"')";
          PreparedStatement pst=db.getCon().prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(this,"Material Uploaded...!!!");            
        }
        catch(SQLException ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Access acc=new Access();
        acc.setVisible(true);
        acc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btncourseeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncourseeditActionPerformed
        // TODO add your handling code here:
        course.setVisible(true);
        course.removeAll();
        course.add(addmat);
        course.repaint();
        course.revalidate();
        addmat.setVisible(true);
    }//GEN-LAST:event_btncourseeditActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        txtmatid.setText("");
        txtfname.setText("");
        txturl.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnatt_sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatt_sumActionPerformed
        // TODO add your handling code here:
        Attendance_summary at_summ=new Attendance_summary();
        at_summ.setVisible(true);
        at_summ.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnatt_sumActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String st_id;
        String cou_id;
        String type;
        String score;
        st_id=txtstudent.getText();
        cou_id=txtcourse.getText();
        type=txtexmtype.getText();
        score=txtmarks.getText();
        int mrk=Integer.parseInt(score);
        try{
          DB_Connect db=new DB_Connect();
          Statement stm=db.getCon().createStatement();
          
          String sql="insert into exam_marks(exm_st_id,exm_cou_id,exm_type,exm_score)values('"+st_id+"','"+cou_id+"','"+type+"','"+mrk+"')";
          PreparedStatement pst=db.getCon().prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(this,"Marks Uploaded...!!!");  
          txtstudent.setText("");
          txtcourse.setText("");
          txtexmtype.setText("");
          txtmarks.setText("");
        }
        catch(SQLException e){
            System.out.println("Error: "+e.getMessage());
        }
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txtstudent.setText("");
        txtcourse.setText("");
        txtexmtype.setText("");
        txtmarks.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btncou1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncou1ActionPerformed
        // TODO add your handling code here:
        String st_id,cou_id;               
        String finalmarks;
        int fm;
        String grd = null; 
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
    }//GEN-LAST:event_btncou1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Result.removeAll();
        Result.add(ICT);
        Result.repaint();
        Result.revalidate();
        Result.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Result.removeAll();
        Result.add(ET);
        Result.repaint();
        Result.revalidate();
        Result.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Result.removeAll();
        Result.add(BST);
        Result.repaint();
        Result.revalidate();
        Result.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btncou2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncou2ActionPerformed
        // TODO add your handling code here:
        String st_id,cou_id;               
        String finalmarks;
        int fm;
        String grd = null;
        
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
    }//GEN-LAST:event_btncou2ActionPerformed

    private void btncou3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncou3ActionPerformed
        // TODO add your handling code here:
        String st_id,cou_id;               
        String finalmarks;
        int fm;
        String grd = null;
        
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
    }//GEN-LAST:event_btncou3ActionPerformed

    private void btncou4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncou4ActionPerformed
        // TODO add your handling code here:
        String st_id,cou_id;               
        String finalmarks;
        int fm;
        String grd = null;
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
    }//GEN-LAST:event_btncou4ActionPerformed

    private void btngetgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngetgpaActionPerformed
        // TODO add your handling code here:
        gpa mark=new gpa();
        mark.setVisible(true);
        mark.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btngetgpaActionPerformed

    public static void main(String args[]) {
        Lecturer lec=new Lecturer();
        lec.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BST;
    private javax.swing.JPanel ET;
    private javax.swing.JTable Eligibility;
    private javax.swing.JTable FinalMarks;
    private javax.swing.JPanel ICT;
    private javax.swing.JTable Notice;
    private javax.swing.JPanel Result;
    private javax.swing.JPanel addmat;
    private javax.swing.JPanel attendance;
    private javax.swing.JButton btn1ok;
    private javax.swing.JButton btnEligibility;
    private javax.swing.JButton btnatt;
    private javax.swing.JButton btnatt_sum;
    private javax.swing.JButton btncou1;
    private javax.swing.JButton btncou2;
    private javax.swing.JButton btncou3;
    private javax.swing.JButton btncou4;
    private javax.swing.JButton btncourse;
    private javax.swing.JButton btncourseedit;
    private javax.swing.JButton btnexam;
    private javax.swing.JButton btngetgpa;
    private javax.swing.JButton btngpa;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnnot;
    private javax.swing.JButton btnnotice;
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnstuDetails;
    private javax.swing.JButton btnstudent;
    private javax.swing.JButton btnup_marks;
    private javax.swing.JButton btnviewMedical;
    private javax.swing.JPanel checkeligible;
    private javax.swing.JPanel course;
    private javax.swing.JPanel exam;
    private javax.swing.JPanel gpaview;
    private javax.swing.JLabel iblstuid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblstuid;
    private javax.swing.JLabel lbltec;
    private javax.swing.JLabel lbltecmis;
    private javax.swing.JLabel lbluor;
    private javax.swing.JPanel medical;
    private javax.swing.JTable medicalView;
    private javax.swing.JPanel noticeview;
    private javax.swing.JPanel pnlCrd;
    private javax.swing.JPanel pnlbuttons;
    private javax.swing.JPanel pnlcourse;
    private javax.swing.JPanel pnlexam;
    private javax.swing.JPanel pnlheading;
    private javax.swing.JPanel pnlothers;
    private javax.swing.JPanel pnlstudent;
    private javax.swing.JTable stuatt;
    private javax.swing.JPanel student;
    private javax.swing.JTable studentTable;
    private javax.swing.JPanel studetail;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtexmtype;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmarks;
    private javax.swing.JTextField txtmatid;
    private javax.swing.JTextField txtstudent;
    private javax.swing.JTextField txtstuid;
    private javax.swing.JTextField txturl;
    private javax.swing.JPanel uploadmarks;
    // End of variables declaration//GEN-END:variables

}
