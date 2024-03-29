/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group9.MotorPH_Frames;

import com.group9.domain.Class_AttendanceRecord;
import com.group9.services.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nativ, brianjancarlos
 */
public class Attendance_Record extends javax.swing.JFrame {

//Global Declarations
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    DefaultTableModel dm;

    /**
     * Creates new form Attendance_Record
     */
    public Attendance_Record() {
        initComponents();
        
         //Jframe Color
        setBackground(new java.awt.Color(255, 214, 196));
         getContentPane().setBackground(new java.awt.Color(255, 214, 196));
         
    }

    //Filter data
    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        tbl_attendance_record.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    public void showData(String d1, String d2) throws ParseException {
        try {
            // Establish a connection to the database MotorPH.services
            Connection conn = DatabaseConnectionManager.getConnection();
            String sql = " ";

            try {

                // if no date selected display all data
                if (d1.equals("") || d2.equals("")) {
                    sql = "SELECT * FROM attendance_record";
                    pstmt = conn.prepareStatement(sql);
                } else {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    Date date1 = new Date(format.parse(d1).getTime());
                    Date date2 = new Date(format.parse(d2).getTime());

                    sql = "SELECT * FROM attendance_record WHERE login_date BETWEEN ? AND ? ORDER by login_date";
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setDate(1, date1);
                    pstmt.setDate(2, date2);
                }

                rs = pstmt.executeQuery();
                List<Class_AttendanceRecord> recordsArray = new ArrayList<>();

                while (rs.next()) {
                    Class_AttendanceRecord record = new Class_AttendanceRecord(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6));
                    recordsArray.add(record);
                }

                DefaultTableModel model = (DefaultTableModel) tbl_attendance_record.getModel();

                for (Class_AttendanceRecord record : recordsArray) {
                    Object[] row = new Object[6];
                    row[0] = record.getEmployee_id();
                    row[1] = record.getLast_name();
                    row[2] = record.getLast_name();
                    row[3] = record.getLogin_date();
                    row[4] = record.getTimein();
                    row[5] = record.getTimeout();

                    model.addRow(row);
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        } catch (SQLException ex) {
            Logger.getLogger(Attendance_Record.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_attendance_record = new javax.swing.JTable();
        dateChooser_startDate = new com.toedter.calendar.JDateChooser();
        dateChooser_endDate = new com.toedter.calendar.JDateChooser();
        btn_search = new javax.swing.JButton();
        lbl_startDate = new javax.swing.JLabel();
        lbl_endDate = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        lbl_employee_num = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tbl_attendance_record.setBackground(new java.awt.Color(255, 182, 185));
        tbl_attendance_record.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Num", "Last Name", "First Name", "Login Date", "TimeIn", "TimeOut"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_attendance_record.setSelectionBackground(new java.awt.Color(255, 182, 185));
        jScrollPane1.setViewportView(tbl_attendance_record);

        dateChooser_startDate.setDateFormatString("yyyy-MM-dd");

        dateChooser_endDate.setDateFormatString("yyyy-MM-dd");

        btn_search.setBackground(new java.awt.Color(14, 49, 113));
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        lbl_startDate.setText("Start Date");

        lbl_endDate.setText("End Date");

        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        lbl_employee_num.setText("Employee Number");

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel1.setText("Time and Attendance Tracker");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbl_employee_num)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_search))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateChooser_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_startDate))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateChooser_endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_search))
                                    .addComponent(lbl_endDate)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lbl_endDate))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_startDate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser_endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search)
                    .addComponent(dateChooser_startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_employee_num))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // Button To Display The Data

        try {

            tbl_attendance_record.setModel(new DefaultTableModel(null, new Object[]{"employee_id", "last_name", "first_name", "login_date", "timein", "timeout"}));
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = df.format(dateChooser_startDate.getDate());
            String date2 = df.format(dateChooser_endDate.getDate());

            showData(date1, date2);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        } finally {

            try {

            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_btn_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // search and filter
        String query = txt_search.getText().toLowerCase();
        filter(query);
        DefaultTableModel model = (DefaultTableModel) tbl_attendance_record.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tbl_attendance_record.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txt_search.getText().trim()));

    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Attendance_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance_Record.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance_Record().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_search;
    private com.toedter.calendar.JDateChooser dateChooser_endDate;
    private com.toedter.calendar.JDateChooser dateChooser_startDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_employee_num;
    private javax.swing.JLabel lbl_endDate;
    private javax.swing.JLabel lbl_startDate;
    private javax.swing.JTable tbl_attendance_record;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
