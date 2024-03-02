/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.group9.MotorPH_Frames;

/**
 *
 * @author brianjancarlos
 */
public class EmployeePortal extends javax.swing.JFrame {

    /**
     * Creates new form EmployeePortal
     */
    public EmployeePortal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_timeIn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_employeeNum = new javax.swing.JLabel();
        lbl_birthday = new javax.swing.JLabel();
        lbl_supervisor = new javax.swing.JLabel();
        lbl_name1 = new javax.swing.JLabel();
        lbl_immediateSupervisor = new javax.swing.JLabel();
        birthdate = new javax.swing.JLabel();
        lbl_firstName_and_lastName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_phoneNum = new javax.swing.JLabel();
        lbl_position = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_role_designation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_timeIn.setText("Time-In");
        btn_timeIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timeInActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Profile"));

        lbl_employeeNum.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_employeeNum.setText("Employee_num");

        lbl_birthday.setText("Birthday");

        lbl_supervisor.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_supervisor.setText("Supervisor");

        lbl_name1.setText("Phone Number");

        lbl_immediateSupervisor.setText("Immediate Supervisor");

        birthdate.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        birthdate.setText("Birthdate");

        lbl_firstName_and_lastName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_firstName_and_lastName.setText("FirstNameAndLastName");

        jLabel1.setText("Employee ID");

        lbl_phoneNum.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_phoneNum.setText("Phone");

        lbl_position.setText("Position");

        lbl_name.setText("Name");

        lbl_role_designation.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lbl_role_designation.setText("Position");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name)
                    .addComponent(lbl_firstName_and_lastName)
                    .addComponent(jLabel1)
                    .addComponent(lbl_employeeNum)
                    .addComponent(lbl_birthday)
                    .addComponent(birthdate))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_supervisor)
                    .addComponent(lbl_immediateSupervisor)
                    .addComponent(lbl_role_designation)
                    .addComponent(lbl_position)
                    .addComponent(lbl_phoneNum)
                    .addComponent(lbl_name1))
                .addContainerGap(145, Short.MAX_VALUE))
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
                    .addComponent(lbl_firstName_and_lastName)
                    .addComponent(lbl_phoneNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_position))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_employeeNum)
                    .addComponent(lbl_role_designation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_birthday)
                    .addComponent(lbl_immediateSupervisor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdate)
                    .addComponent(lbl_supervisor))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_timeIn)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btn_timeIn)))
                .addContainerGap(271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_timeInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timeInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_timeInActionPerformed

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
    private javax.swing.JLabel birthdate;
    private javax.swing.JButton btn_timeIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_birthday;
    private javax.swing.JLabel lbl_employeeNum;
    private javax.swing.JLabel lbl_firstName_and_lastName;
    private javax.swing.JLabel lbl_immediateSupervisor;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_name1;
    private javax.swing.JLabel lbl_phoneNum;
    private javax.swing.JLabel lbl_position;
    private javax.swing.JLabel lbl_role_designation;
    private javax.swing.JLabel lbl_supervisor;
    // End of variables declaration//GEN-END:variables
}
