/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group9.MotorPH_Frames;

import com.group9.domain.Class_Emp;
import com.group9.domain.Class_EmployeeDetails;
import com.group9.services.DatabaseConnectionManager;
import com.group9.services.WindowPositioner;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author brianjancarlos
 */
public class EmployeePortal extends javax.swing.JFrame {

    ResultSet rs = null;

    /**
     * Creates new form EmployeePortal
     */
    public EmployeePortal() {
        initComponents();
        setBackground(new java.awt.Color(255, 214, 196));
         getContentPane().setBackground(new java.awt.Color(255, 214, 196));
         
         //ADDED Current time and date 
         try {
          
            // Establish a connection to the database MotorPH.services
            Connection conn = DatabaseConnectionManager.getConnection();
            //Displays Current date in form
            currentDate();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(login_portal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
         
        WindowPositioner.centerWindow(this);

        String sql = "SELECT * FROM employee_details WHERE (employee_id = ?)";
        try {
            Connection conn = DatabaseConnectionManager.getConnection();
            
            lbl_emp.setText(String.valueOf(Class_Emp.empid));
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //Get EmployeeID from Login screen
            pstmt.setInt(1, Integer.parseInt(lbl_emp.getText()));
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Class_EmployeeDetails employee = new Class_EmployeeDetails(rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
                lbl_firstName.setText(employee.getFirstName() + " ");
                lbl_lastName.setText(employee.getLastName());
                lbl_birthdate.setText(employee.getBirthday());
                lbl_phoneNum.setText(employee.getPhone());
                //lbl_statusMain.setText(employee.getStatus());
                lbl_role_designation.setText(employee.getPosition());
                lbl_supervisor.setText(employee.getImmediateSupervisor());
                lbl_addressMain.setText(employee.getAddress());
                lbl_philhealthMain.setText(employee.getPhilhealth());
                lbl_sssMain.setText(employee.getSss());
                lbl_tinMain.setText(employee.getTin());
                lbl_statusMain.setText(employee.getStatus()); 
                lbl_pagibigMain.setText(employee.getPagibig()); 

                /* Code below is implementation option 2. Still figuring out which is better
//            String employeeQuery = "SELECT * FROM public.employee_details WHERE employee_id=?";
//            try (PreparedStatement employeePst = conn.prepareStatement(employeeQuery)) {
//                 employeePst.setInt(1, Integer.parseInt(lbl_emp.getText()));
//
//                try (ResultSet employeeRs = employeePst.executeQuery()) {
//                    if (employeeRs.next()) {
//                        //txt_employee_id.setText(employeeRs.getString("employee_id"));
//                        String fname = employeeRs.getString("last_name");
//                        String lname = employeeRs.getString("first_name");
//                        lbl_firstName_and_lastName.setText(fname + ", " + lname);
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Employee not found");
//                        return; // Exit the method if employee not found
//                    }
//                } */
                rs.close(); // Comment out this line if using Option 2
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePortal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public void currentDate() {

        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        lbl_currentDate.setText((month + 1) + "/" + day + "/" + year);

        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);

        lbl_currentTime.setText(hour + ":" + (minute) + ":" + second);

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
        lbl_emp = new javax.swing.JLabel();
        lbl_birthday = new javax.swing.JLabel();
        lbl_supervisor = new javax.swing.JLabel();
        lbl_name1 = new javax.swing.JLabel();
        lbl_immediateSupervisor = new javax.swing.JLabel();
        lbl_firstName = new javax.swing.JLabel();
        lbl_employeeId = new javax.swing.JLabel();
        lbl_phoneNum = new javax.swing.JLabel();
        lbl_position = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_role_designation = new javax.swing.JLabel();
        lbl_lastName = new javax.swing.JLabel();
        lbl_birthdate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_timeIn = new javax.swing.JButton();
        btn_timeout = new javax.swing.JButton();
        btn_payslip = new javax.swing.JButton();
        lbl_address = new javax.swing.JLabel();
        lbl_addressMain = new javax.swing.JLabel();
        lbl_sss = new javax.swing.JLabel();
        lbl_sssMain = new javax.swing.JLabel();
        lbl_philhealth = new javax.swing.JLabel();
        lbl_philhealthMain = new javax.swing.JLabel();
        lbl_tin = new javax.swing.JLabel();
        lbl_tinMain = new javax.swing.JLabel();
        lbl_pagibigMain = new javax.swing.JLabel();
        lbl_pagibig = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        lbl_statusMain = new javax.swing.JLabel();
        mnubar_loginPortal = new javax.swing.JMenuBar();
        mnu_file = new javax.swing.JMenu();
        lbl_currentDate = new javax.swing.JMenu();
        lbl_currentTime = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 214, 196));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Profile", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica", 0, 14))); // NOI18N

        lbl_emp.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_emp.setText("Employee_num");

        lbl_birthday.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_birthday.setForeground(new java.awt.Color(102, 102, 102));
        lbl_birthday.setText("Birthday");

        lbl_supervisor.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_supervisor.setText("Supervisor");

        lbl_name1.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_name1.setForeground(new java.awt.Color(102, 102, 102));
        lbl_name1.setText("Phone Number");

        lbl_immediateSupervisor.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_immediateSupervisor.setForeground(new java.awt.Color(102, 102, 102));
        lbl_immediateSupervisor.setText("Immediate Supervisor");

        lbl_firstName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_firstName.setText("FirstName");

        lbl_employeeId.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_employeeId.setForeground(new java.awt.Color(102, 102, 102));
        lbl_employeeId.setText("Employee ID");

        lbl_phoneNum.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_phoneNum.setText("Phone");

        lbl_position.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_position.setForeground(new java.awt.Color(102, 102, 102));
        lbl_position.setText("Position");

        lbl_name.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(102, 102, 102));
        lbl_name.setText("Name");

        lbl_role_designation.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_role_designation.setText("Position");

        lbl_lastName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_lastName.setText(", Last Name");

        lbl_birthdate.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_birthdate.setText("Birthdate");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_firstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_lastName))
                    .addComponent(lbl_name)
                    .addComponent(lbl_employeeId)
                    .addComponent(lbl_emp)
                    .addComponent(lbl_birthday)
                    .addComponent(lbl_birthdate))
                .addGap(18, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_supervisor)
                    .addComponent(lbl_position)
                    .addComponent(lbl_phoneNum)
                    .addComponent(lbl_name1)
                    .addComponent(lbl_role_designation)
                    .addComponent(lbl_immediateSupervisor))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_name)
                    .addComponent(lbl_name1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_firstName)
                    .addComponent(lbl_phoneNum)
                    .addComponent(lbl_lastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_position)
                    .addComponent(lbl_employeeId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_emp)
                    .addComponent(lbl_role_designation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_birthday)
                    .addComponent(lbl_immediateSupervisor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_supervisor)
                    .addComponent(lbl_birthdate))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 214, 196));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_timeIn.setBackground(new java.awt.Color(14, 49, 113));
        btn_timeIn.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        btn_timeIn.setForeground(new java.awt.Color(255, 255, 255));
        btn_timeIn.setText("Time-In");
        btn_timeIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timeInActionPerformed(evt);
            }
        });

        btn_timeout.setBackground(new java.awt.Color(14, 49, 113));
        btn_timeout.setForeground(new java.awt.Color(255, 255, 255));
        btn_timeout.setText("Time-Out");
        btn_timeout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timeoutActionPerformed(evt);
            }
        });

        btn_payslip.setBackground(new java.awt.Color(14, 49, 113));
        btn_payslip.setForeground(new java.awt.Color(255, 255, 255));
        btn_payslip.setText("Payslip");
        btn_payslip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payslipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_timeout, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btn_timeIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_payslip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_timeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_timeout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_payslip, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbl_address.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_address.setForeground(new java.awt.Color(102, 102, 102));
        lbl_address.setText("Address");

        lbl_addressMain.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_addressMain.setText("Address");

        lbl_sss.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_sss.setForeground(new java.awt.Color(102, 102, 102));
        lbl_sss.setText("SSS");

        lbl_sssMain.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_sssMain.setText("SSS");

        lbl_philhealth.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_philhealth.setForeground(new java.awt.Color(102, 102, 102));
        lbl_philhealth.setText("Philhealth");

        lbl_philhealthMain.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_philhealthMain.setText("Philhealth");

        lbl_tin.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_tin.setForeground(new java.awt.Color(102, 102, 102));
        lbl_tin.setText("TIN");

        lbl_tinMain.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_tinMain.setText("TIN");

        lbl_pagibigMain.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_pagibigMain.setText("Status");

        lbl_pagibig.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_pagibig.setForeground(new java.awt.Color(102, 102, 102));
        lbl_pagibig.setText("Status");

        lbl_status.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(102, 102, 102));
        lbl_status.setText("Pagibig");

        lbl_statusMain.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        lbl_statusMain.setText("Pagibig");

        mnubar_loginPortal.setBackground(new java.awt.Color(14, 49, 113));
        mnubar_loginPortal.setForeground(new java.awt.Color(14, 49, 113));

        mnu_file.setForeground(new java.awt.Color(14, 49, 113));
        mnu_file.setText("MotorPH");
        mnu_file.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        mnu_file.setMaximumSize(new java.awt.Dimension(500, 32767));
        mnubar_loginPortal.add(mnu_file);

        lbl_currentDate.setForeground(new java.awt.Color(14, 49, 113));
        lbl_currentDate.setText("Date");
        lbl_currentDate.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        mnubar_loginPortal.add(lbl_currentDate);

        lbl_currentTime.setForeground(new java.awt.Color(14, 49, 113));
        lbl_currentTime.setText("Time");
        lbl_currentTime.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        mnubar_loginPortal.add(lbl_currentTime);

        setJMenuBar(mnubar_loginPortal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_sss)
                                    .addComponent(lbl_sssMain))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_philhealth)
                                    .addComponent(lbl_philhealthMain))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_tinMain)
                                    .addComponent(lbl_tin))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_statusMain)
                                    .addComponent(lbl_status)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_pagibigMain)
                                    .addComponent(lbl_pagibig))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_address)
                                    .addComponent(lbl_addressMain)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_pagibig)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_pagibigMain))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_address)
                                .addGap(5, 5, 5)
                                .addComponent(lbl_addressMain)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_philhealth)
                            .addComponent(lbl_sss)
                            .addComponent(lbl_tin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_philhealthMain)
                            .addComponent(lbl_sssMain)
                            .addComponent(lbl_tinMain)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_statusMain)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_timeInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timeInActionPerformed

        Date loginDate = Date.valueOf(LocalDate.now());
        Time timeIn = Time.valueOf(LocalTime.now());
        Time timeOut = null; // Set the timeout value as needed

        // Check if user has already time in for the current date
        if (hasTimeIn(Class_Emp.empid, loginDate)) {
            JOptionPane.showMessageDialog(this, "You have already timed in for today.");
            return;
        }
        // Insert values into the attendance_record table
        try {
            Connection connection = DatabaseConnectionManager.getConnection();
            String query = "INSERT INTO attendance_record (employee_id, last_name, first_name, login_date, timein, timeout) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, Class_Emp.empid);
            statement.setString(2, lbl_lastName.getText());
            statement.setString(3, lbl_firstName.getText());
            statement.setDate(4, loginDate);
            statement.setTime(5, timeIn);
            statement.setTime(6, timeOut);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Attendance recorded successfully. " + loginDate + " " + timeIn);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePortal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to record attendance.");
        }
    }//GEN-LAST:event_btn_timeInActionPerformed

    private void btn_timeoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timeoutActionPerformed

        Date loginDate = Date.valueOf(LocalDate.now());
        Time timeOut = Time.valueOf(LocalTime.now());

        // Check if user has already timed out for the current date
        if (hasTimeOut(Class_Emp.empid, loginDate)) {
            JOptionPane.showMessageDialog(this, "You have already timed out for today.");
            return;
        }

        // Update the timeout value in the attendance_record table
        try {
            Connection connection = DatabaseConnectionManager.getConnection();
            String query = "UPDATE attendance_record SET timeout = ? WHERE employee_id = ? AND login_date = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setTime(1, timeOut);
            statement.setInt(2, Class_Emp.empid);
            statement.setDate(3, loginDate);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(this, "Timeout recorded successfully. " + loginDate + " " + timeOut);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePortal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to record timeout.");
        }
    }

    // Custom method to check if user has timed out for the current date
    private boolean hasTimeOut(int employeeId, Date loginDate) {
        try {
            Connection connection = DatabaseConnectionManager.getConnection();
            String query = "SELECT COUNT(*) FROM attendance_record WHERE employee_id = ? AND login_date = ? AND timeout IS NOT NULL";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, employeeId);
            statement.setDate(2, loginDate);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            return count > 0;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePortal.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }//GEN-LAST:event_btn_timeoutActionPerformed

    private void btn_payslipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payslipActionPerformed
        Payslip_employee x = new Payslip_employee();
        x.setVisible(true);

    }//GEN-LAST:event_btn_payslipActionPerformed

    //Custom method to check if user has timed in for the current date
    private boolean hasTimeIn(int employeeId, Date loginDate) {
        try {
            Connection connection = DatabaseConnectionManager.getConnection();
            String query = "SELECT COUNT(*) FROM attendance_record WHERE employee_id = ? AND login_date = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, employeeId);
            statement.setDate(2, loginDate);
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            return count > 0;
        } catch (SQLException ex) {
            Logger.getLogger(EmployeePortal.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

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
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_payslip;
    private javax.swing.JButton btn_timeIn;
    private javax.swing.JButton btn_timeout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_addressMain;
    private javax.swing.JLabel lbl_birthdate;
    private javax.swing.JLabel lbl_birthday;
    private javax.swing.JMenu lbl_currentDate;
    private javax.swing.JMenu lbl_currentTime;
    private javax.swing.JLabel lbl_emp;
    private javax.swing.JLabel lbl_employeeId;
    private javax.swing.JLabel lbl_firstName;
    private javax.swing.JLabel lbl_immediateSupervisor;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_pagibig;
    private javax.swing.JLabel lbl_pagibigMain;
    private javax.swing.JLabel lbl_philhealth;
    private javax.swing.JLabel lbl_philhealthMain;
    private javax.swing.JLabel lbl_phoneNum;
    private javax.swing.JLabel lbl_position;
    private javax.swing.JLabel lbl_role_designation;
    private javax.swing.JLabel lbl_sss;
    private javax.swing.JLabel lbl_sssMain;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_statusMain;
    private javax.swing.JLabel lbl_supervisor;
    private javax.swing.JLabel lbl_tin;
    private javax.swing.JLabel lbl_tinMain;
    private javax.swing.JMenu mnu_file;
    private javax.swing.JMenuBar mnubar_loginPortal;
    // End of variables declaration//GEN-END:variables
}
