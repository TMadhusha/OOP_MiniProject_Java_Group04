/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.pro.mini;


public class Lecturer extends javax.swing.JFrame {
    
    public Lecturer() {
        initComponents();
        setVisible(true);   
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
        pnlcourse = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btncourseedit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnatt = new javax.swing.JButton();
        pnlexam = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnup_marks = new javax.swing.JButton();
        btngpa = new javax.swing.JButton();
        pnlothers = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnnotice = new javax.swing.JButton();

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

        javax.swing.GroupLayout pnlstudentLayout = new javax.swing.GroupLayout(pnlstudent);
        pnlstudent.setLayout(pnlstudentLayout);
        pnlstudentLayout.setHorizontalGroup(
            pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlstudentLayout.createSequentialGroup()
                .addGroup(pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlstudentLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(pnlstudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(pnlstudentLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnstuDetails)))
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
                        .addComponent(jLabel8)))
                .addContainerGap(1548, Short.MAX_VALUE))
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
                .addContainerGap(320, Short.MAX_VALUE))
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
                        .addGap(258, 258, 258)
                        .addComponent(btnatt)))
                .addContainerGap(1859, Short.MAX_VALUE))
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
                .addContainerGap(307, Short.MAX_VALUE))
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
        btngpa.setText("View GPA");
        btngpa.setBorderPainted(false);
        btngpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlexamLayout = new javax.swing.GroupLayout(pnlexam);
        pnlexam.setLayout(pnlexamLayout);
        pnlexamLayout.setHorizontalGroup(
            pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlexamLayout.createSequentialGroup()
                .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlexamLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(btnup_marks))
                        .addGap(200, 200, 200)
                        .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(btngpa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlexamLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel4)))
                .addContainerGap(1921, Short.MAX_VALUE))
        );
        pnlexamLayout.setVerticalGroup(
            pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlexamLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlexamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btngpa, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnup_marks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(317, Short.MAX_VALUE))
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
                        .addGap(265, 265, 265)
                        .addGroup(pnlothersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnotice, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addContainerGap(2200, Short.MAX_VALUE))
        );
        pnlothersLayout.setVerticalGroup(
            pnlothersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlothersLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(btnnotice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
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
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btncourseActionPerformed

    private void btnexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexamActionPerformed
        pnlCrd.removeAll();
        pnlCrd.add(pnlexam);
        pnlCrd.repaint();
        pnlCrd.revalidate();  // TODO add your handling code here:
    }//GEN-LAST:event_btnexamActionPerformed

    private void btnmoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoreActionPerformed
        pnlCrd.removeAll();
        pnlCrd.add(pnlothers);
        pnlCrd.repaint();
        pnlCrd.revalidate();          // TODO add your handling code here:
    }//GEN-LAST:event_btnmoreActionPerformed

    private void btnstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstudentActionPerformed
        // TODO add your handling code here:
        pnlCrd.removeAll();
        pnlCrd.add(pnlstudent);
        pnlCrd.repaint();
        pnlCrd.revalidate(); 
    }//GEN-LAST:event_btnstudentActionPerformed

    private void btnviewMedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewMedicalActionPerformed
        // TODO add your handling code here:
        MedicalView med=new MedicalView();
        med.setVisible(true);
        med.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnviewMedicalActionPerformed

    private void btnEligibilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEligibilityActionPerformed
        // TODO add your handling code here:
        Eligibility eg=new Eligibility();
        eg.setVisible(true);
        eg.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnEligibilityActionPerformed

    private void btnstuDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstuDetailsActionPerformed
        // TODO add your handling code here:
        StudentTable stble=new StudentTable();
        stble.setVisible(true);
        stble.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        // TODO add your handling code here:

    }//GEN-LAST:event_btnstuDetailsActionPerformed

    private void btnnoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnoticeActionPerformed
        // TODO add your handling code here:
        NoticeView nt=new NoticeView();
        nt.setVisible(true);
        nt.setDefaultCloseOperation(DISPOSE_ON_CLOSE);              
    }//GEN-LAST:event_btnnoticeActionPerformed

    private void btnattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnattActionPerformed
        // TODO add your handling code here:
        Attendance at=new Attendance();
        at.setVisible(true);
        at.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnattActionPerformed

    private void btnup_marksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnup_marksActionPerformed
        // TODO add your handling code here:
        UploadMarks upm=new UploadMarks();
        upm.setVisible(true);
        upm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnup_marksActionPerformed

    private void btngpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngpaActionPerformed
        // TODO add your handling code here:
        FinalResult fr=new FinalResult();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btngpaActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        firstGUI obj1=new firstGUI();
        obj1.setVisible(true);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btncourseeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncourseeditActionPerformed
        // TODO add your handling code here:
        courseMaterial cm=new courseMaterial();
        cm.setVisible(true);
        cm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btncourseeditActionPerformed

    public static void main(String args[]) {
        Lecturer lec=new Lecturer();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEligibility;
    private javax.swing.JButton btnatt;
    private javax.swing.JButton btncourse;
    private javax.swing.JButton btncourseedit;
    private javax.swing.JButton btnexam;
    private javax.swing.JButton btngpa;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnmore;
    private javax.swing.JButton btnnotice;
    private javax.swing.JButton btnstuDetails;
    private javax.swing.JButton btnstudent;
    private javax.swing.JButton btnup_marks;
    private javax.swing.JButton btnviewMedical;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lbltec;
    private javax.swing.JLabel lbltecmis;
    private javax.swing.JLabel lbluor;
    private javax.swing.JPanel pnlCrd;
    private javax.swing.JPanel pnlbuttons;
    private javax.swing.JPanel pnlcourse;
    private javax.swing.JPanel pnlexam;
    private javax.swing.JPanel pnlheading;
    private javax.swing.JPanel pnlothers;
    private javax.swing.JPanel pnlstudent;
    // End of variables declaration//GEN-END:variables
}
