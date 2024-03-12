/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group9.MotorPH_Frames;

import com.group9.domain.Class_Emp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Calendar;
//import java.util.Date;
import java.util.GregorianCalendar;
import com.group9.services.DatabaseConnectionManager;
import com.group9.services.WindowPositioner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nativ
 */
public class login_portal extends javax.swing.JFrame {

    // ResultSet rs = null;: Declares a placeholder variable for storing query results.
    ResultSet rs = null;

    /**
     * Creates new form login_portal
     */
    public login_portal() {
        try {
            initComponents();
            WindowPositioner.centerWindow(this);

            // Establish a connection to the database MotorPH.services
            Connection conn = DatabaseConnectionManager.getConnection();
            //Displays Current date in form
            currentDate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(login_portal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void currentDate() {

        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        lbl_date.setText((month + 1) + "/" + day + "/" + year);

        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);

        lbl_time.setText(hour + ":" + (minute) + ":" + second);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_password = new javax.swing.JLabel();
        lbl_employeeID = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        mnubar_loginPortal = new javax.swing.JMenuBar();
        mnu_file = new javax.swing.JMenu();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 214, 196));

        jPanel1.setBackground(new java.awt.Color(255, 214, 196));

        lbl_password.setBackground(new java.awt.Color(255, 255, 255));
        lbl_password.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(14, 49, 113));
        lbl_password.setText("Password");

        lbl_employeeID.setBackground(new java.awt.Color(255, 255, 255));
        lbl_employeeID.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_employeeID.setForeground(new java.awt.Color(14, 49, 113));
        lbl_employeeID.setText("Employee ID");

        txt_username.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txt_username.setForeground(new java.awt.Color(14, 49, 113));
        txt_username.setCaretColor(new java.awt.Color(14, 49, 113));
        txt_username.setDisabledTextColor(new java.awt.Color(255, 145, 0));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        txt_password.setForeground(new java.awt.Color(14, 49, 113));
        txt_password.setCaretColor(new java.awt.Color(14, 49, 113));
        txt_password.setDisabledTextColor(new java.awt.Color(255, 145, 0));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(14, 49, 113));
        btn_login.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Helvetica", 0, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Forgot Password?");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_password)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(txt_username))
                        .addComponent(lbl_employeeID)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lbl_employeeID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(48, 48, 48))
        );

        mnubar_loginPortal.setBackground(new java.awt.Color(14, 49, 113));
        mnubar_loginPortal.setForeground(new java.awt.Color(102, 102, 102));

        mnu_file.setForeground(new java.awt.Color(14, 49, 113));
        mnu_file.setText("MotorPH");
        mnu_file.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        mnu_file.setMaximumSize(new java.awt.Dimension(260, 32767));
        mnubar_loginPortal.add(mnu_file);

        lbl_date.setForeground(new java.awt.Color(14, 49, 113));
        lbl_date.setText("Date");
        lbl_date.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        mnubar_loginPortal.add(lbl_date);

        lbl_time.setForeground(new java.awt.Color(14, 49, 113));
        lbl_time.setText("Time");
        lbl_time.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        mnubar_loginPortal.add(lbl_time);

        setJMenuBar(mnubar_loginPortal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        String sql = "SELECT employee_id, emp_password, role_description FROM login_details_and_role WHERE (employee_id = ? AND emp_password = ?)";

        try {
            int count = 0;
            Connection conn = DatabaseConnectionManager.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.parseInt(txt_username.getText()));
            pstmt.setString(2, txt_password.getText());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt(1);
                Class_Emp.empid = id;
                String role = rs.getString(3);
                count = count + 1;

                if (role.equals("Admin")) {
                    JOptionPane.showMessageDialog(null, "Login successful. Admin Portal Access");
                    MainMenuPortal adminPortal = new MainMenuPortal();
                    adminPortal.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Login successful. Employee Portal Access");
                    EmployeePortal employeePortal = new EmployeePortal();
                    employeePortal.setVisible(true);
                    this.dispose();
                }
            }

            if (count == 0) {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }

            rs.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //forgot password
                
                
                try{
                     JOptionPane.showMessageDialog(null, "Contact admin at Motorph_admin@gmail.com");
                    
                }catch (Exception e) {
                       JOptionPane.showMessageDialog(null, e);
                    
                }
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(login_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_portal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JLabel lbl_employeeID;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JMenu mnu_file;
    private javax.swing.JMenuBar mnubar_loginPortal;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
