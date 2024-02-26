/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group9.MotorPH_Frames;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author nativ
 */
public class MainMenuPortal extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuPortal
     */
    public MainMenuPortal() {
        initComponents();
        
        /*
        This line takes the employee ID from a specific place in the program, 
        turns it into a text, and then shows it on the screen in a specific area.
        */
        lbl_emp.setText(String.valueOf(Emp.empid).toString());
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_logout = new javax.swing.JButton();
        lbl_welcome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea_info_screen = new javax.swing.JTextArea();
        lbl_loggedin_user = new javax.swing.JLabel();
        lbl_emp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_administrator = new javax.swing.JButton();
        btn_attendance = new javax.swing.JButton();
        btn_employee = new javax.swing.JButton();
        btn_payroll = new javax.swing.JButton();
        lbl_adminportal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu_employee = new javax.swing.JMenu();
        mnu_report = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        lbl_welcome.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbl_welcome.setText("Welcome to MotorPH");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txtarea_info_screen.setColumns(20);
        txtarea_info_screen.setRows(5);
        txtarea_info_screen.setText("        \n          ----MOTORPH PAYROLL SYTEM----\n            Key Features and Functionalities:\n\n         Employee Information Management, \n               Time & Attendance, Tracking, \n                       Salary Calculation, \n              Employee Self-Service Portal and \n                 Payroll Administrator Roles");
        jScrollPane1.setViewportView(txtarea_info_screen);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbl_loggedin_user.setText("Logged in as:");

        lbl_emp.setText("employee id");

        btn_administrator.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_administrator.setText("Administrator");
        btn_administrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_administratorActionPerformed(evt);
            }
        });

        btn_attendance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_attendance.setText("Attendance");
        btn_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_attendanceActionPerformed(evt);
            }
        });

        btn_employee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_employee.setText("Employee  ");
        btn_employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_employeeActionPerformed(evt);
            }
        });

        btn_payroll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_payroll.setText("Payroll");
        btn_payroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payrollActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_payroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_administrator, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(btn_attendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_employee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_employee, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_payroll, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btn_administrator, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        lbl_adminportal.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbl_adminportal.setText("Admin Portal");

        mnu_employee.setText("Employee");
        jMenuBar1.add(mnu_employee);

        mnu_report.setText("Report");
        jMenuBar1.add(mnu_report);

        jMenu3.setText("About");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_logout)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_welcome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lbl_adminportal)
                                        .addGap(39, 39, 39)))))
                        .addGap(0, 32, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_loggedin_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_emp)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_logout)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(lbl_welcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_adminportal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_loggedin_user)
                            .addComponent(lbl_emp))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // Logout button

        login_portal login_ui = new login_portal();
        login_ui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_payrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payrollActionPerformed
        // payroll
        
        payroll x = new payroll();
        x.setVisible(true);
        
    }//GEN-LAST:event_btn_payrollActionPerformed

    private void btn_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_attendanceActionPerformed
        // Attendance
        
        attendanceTracker x = new attendanceTracker();
        x.setVisible(true);
        
    }//GEN-LAST:event_btn_attendanceActionPerformed

    private void btn_employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_employeeActionPerformed
        // add employee
        //Show EmplooyeeDetails_view
        Employee_Details_HRView employeeDetailsHRView = new Employee_Details_HRView();
        employeeDetailsHRView.setVisible(true);
        
//        addEmployee x = new addEmployee();
//        x.setVisible(true);
        
    }//GEN-LAST:event_btn_employeeActionPerformed

    private void btn_administratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_administratorActionPerformed
        // Administrator
        
        addEmployee x = new addEmployee();
        x.setVisible(true);
        
        
    }//GEN-LAST:event_btn_administratorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_administrator;
    private javax.swing.JButton btn_attendance;
    private javax.swing.JButton btn_employee;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_payroll;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_adminportal;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_loggedin_user;
    private javax.swing.JLabel lbl_welcome;
    private javax.swing.JMenu mnu_employee;
    private javax.swing.JMenu mnu_report;
    private javax.swing.JTextArea txtarea_info_screen;
    // End of variables declaration//GEN-END:variables
}
