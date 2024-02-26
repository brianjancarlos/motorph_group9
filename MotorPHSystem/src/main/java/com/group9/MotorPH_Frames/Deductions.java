/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group9.MotorPH_Frames;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nativ
 */
public class Deductions {
Connection conn = null;
    Resultset rs = null;
    PreparedStatement pst = null;
    
      // Constructor that takes a Connection parameter
    public Deductions(Connection conn) {
       conn = database_connection.java_database_connection();
        this.conn = conn;
    }
    
    
    public double computeSSS(ResultSet employeeRs) throws SQLException {
        double sss;
        int basicSalary = employeeRs.getInt("basic_salary");
        
        // Check if getsal()ary is less than or equal to 3250
          // Check if basicSalary is less than or equal to 3250
        if (basicSalary <= 3250) {
            sss = 135;
        } else if (basicSalary <= 24750) {
            // For salaries between 3250 and 24750
            float modBase = (basicSalary - 3250) % 500;

            // Check if the basicSalary is at the lower/upper bound of the range
            if (modBase == 250 || modBase == 750) {
                float multiplier = ((basicSalary - 3250 - modBase) / 500);
                sss = 22.5 * multiplier + 135;
            } else {
                float mod = (basicSalary - 3250) % 500;
                float multiplier = ((basicSalary - 3250 - mod) / 500);
                sss = 22.5 * (multiplier + 1) + 135;
            }
        } else {
            // For salaries greater than 24750
            sss = 1125;
        }

        return sss;
    }


   public double computePagibig(ResultSet employeeRs) throws SQLException {
    double pagibig;
    int basicSalary = employeeRs.getInt("basic_salary");

    // Check if basicSalary is between 1000 and 1500
    if (basicSalary > 1000 && basicSalary <= 1500) {
        pagibig = basicSalary * 0.01; // Apply formula for this salary range
    } else {
        // If basicSalary is outside the range, use a different formula or a fixed value
        double calculatedPagibig = basicSalary * 0.02;

        // Check if calculated Pagibig is less than 100
        if (calculatedPagibig < 100) {
            pagibig = calculatedPagibig;
        } else {
            pagibig = 100; // Use a fixed value of 100 if the calculated value exceeds 100
        }
    }

    return pagibig;
}

    // Function to compute Philhealth
public double computePhilhealth(ResultSet employeeRs) throws SQLException {
    double philhealth;
    int basicSalary = employeeRs.getInt("basic_salary");

    if (basicSalary <= 10000) {
        // If salary is less than or equal to 10000, use a fixed value
        philhealth = 300 / 2;
    } else if (basicSalary > 10000 && basicSalary < 60000) {
        // If salary is between 10000 and 60000, use a formula
        philhealth = basicSalary * 0.03 / 2;
    } else {
        // For salaries greater than 60000, use another fixed value
        philhealth = 1800 / 2;
    }

    return philhealth;
}

// Function to calculate taxable income
public double computeTaxable(ResultSet employeeRs) throws SQLException {
    double taxable = employeeRs.getInt("basic_salary") - computeSSS(employeeRs) - computePagibig(employeeRs) - computePhilhealth(employeeRs);
    return taxable;
}

// Function to calculate income tax
public float computeTax(ResultSet employeeRs) throws SQLException {
    double tax;

    int basicSalary = employeeRs.getInt("basic_salary");

    // Check which tax bracket the salary falls into and apply the corresponding formula
    if (basicSalary <= 20832) {
        tax = 0;
    } else if (basicSalary > 20832 && basicSalary < 33333) {
        tax = (computeTaxable(employeeRs) - 20833) * 0.2;
    } else if (basicSalary >= 33333 && basicSalary < 66667) {
        tax = (computeTaxable(employeeRs) - 33333) * 0.25 + 2500;
    } else if (basicSalary >= 66667 && basicSalary < 166667) {
        tax = (computeTaxable(employeeRs) - 66667) * 0.3 + 10833;
    } else if (basicSalary >= 166667 && basicSalary < 666667) {
        tax = (computeTaxable(employeeRs) - 166667) * 0.32 + 40833.33;
    } else {
        tax = (basicSalary - 666667) * 0.35 + 200833.33;
    }

    return (float) tax;
}

     public float computeTotalDeduction(int employee_id) {
        try {
            // Fetch data from the employee_details table using employee_id
            String employeeQuery = "SELECT * FROM public.employee_details WHERE employee_id=?";
            try (PreparedStatement employeePst = conn.prepareStatement(employeeQuery)) {
                employeePst.setInt(1, employee_id);

                try (ResultSet employeeRs = employeePst.executeQuery()) {
                    if (employeeRs.next()) {
                        // Call the other method with the ResultSet
                        float td = (float) (computeSSS(employeeRs) + computePhilhealth(employeeRs) + computePagibig(employeeRs) + computeTax(employeeRs));
                        return td;
                    } else {
                        JOptionPane.showMessageDialog(null, "Employee not found");
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error calculating total deduction: " + e.getMessage());
            return 0; // Handle the error appropriately
        }
        return 0;
    }
}
