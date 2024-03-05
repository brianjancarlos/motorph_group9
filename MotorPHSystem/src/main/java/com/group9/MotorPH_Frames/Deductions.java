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
    
    
   public double computeSSS(float grossPay) {
    double sss;

    if (grossPay <= 3250) {
        sss = 135;
    } else if (grossPay <= 24750) {
        float modBase = (grossPay - 3250) % 500;

        if (modBase == 250 || modBase == 750) {
            float multiplier = ((grossPay - 3250 - modBase) / 500);
            sss = 22.5 * multiplier + 135;
        } else {
            float mod = (grossPay - 3250) % 500;
            float multiplier = ((grossPay - 3250 - mod) / 500);
            sss = 22.5 * (multiplier + 1) + 135;
        }
    } else {
        sss = 1125;
    }

    return sss;
}


   public double computePagibig(float grossPay) {
    double pagibig;

    if (grossPay > 1000 && grossPay <= 1500) {
        pagibig = grossPay * 0.01;
    } else {
        double calculatedPagibig = grossPay * 0.02;

        if (calculatedPagibig < 100) {
            pagibig = calculatedPagibig;
        } else {
            pagibig = 100;
        }
    }

    return pagibig;
}

public double computePhilhealth(float grossPay) {
    double philhealth;

    if (grossPay <= 10000) {
        philhealth = 300 / 2;
    } else if (grossPay > 10000 && grossPay < 60000) {
        philhealth = grossPay * 0.03 / 2;
    } else {
        philhealth = 1800 / 2;
    }

    return philhealth;
}
  // Total Deduction
public float totalDeduction(float grossPay) {
    return (float) (computeSSS(grossPay) + computePagibig(grossPay) + computePhilhealth(grossPay));
}

   // Function to calculate taxable income based on float (overloaded)
//Math.max(0, ...) to ensure that the taxable income is never negative. This should prevent the issue of negative tax amounts.
    public float computeTaxable(float grossPay) {
     
    float taxableIncome = (grossPay - totalDeduction(grossPay));
    return taxableIncome;
}

// Function to calculate income tax based on ResultSet
public double computeTax(float grossPay) throws SQLException {
    double tax;

    if (grossPay <= 20832) {
        tax = 0;
    } else if (grossPay > 20832 && grossPay < 33333) {
        tax = (computeTaxable(grossPay) - 20833) * 0.2;
    } else if (grossPay >= 33333 && grossPay < 66667) {
        tax = (computeTaxable(grossPay) - 33333) * 0.25 + 2500;
    } else if (grossPay >= 66667 && grossPay < 166667) {
        tax = (computeTaxable(grossPay) - 66667) * 0.3 + 10833;
    } else if (grossPay >= 166667 && grossPay < 666667) {
        tax = (computeTaxable(grossPay) - 166667) * 0.32 + 40833.33;
    } else {
        tax = (grossPay - 666667) * 0.35 + 200833.33;
    }

    return tax;
}


public float computeTotalDeduction(int employee_id, float grossPay) {
    try {
        // Fetch data from the employee_details table using employee_id
        String employeeQuery = "SELECT * FROM public.employee_details WHERE employee_id=?";
        try (PreparedStatement employeePst = conn.prepareStatement(employeeQuery)) {
            employeePst.setInt(1, employee_id);

            try (ResultSet employeeRs = employeePst.executeQuery()) {
                if (employeeRs.next()) {
                    // Call the other method with the ResultSet
                    float td = (float) (computeSSS(grossPay) + computePhilhealth(grossPay) + computePagibig(grossPay) + computeTax(grossPay));
                    return td;
                } else {
                    JOptionPane.showMessageDialog(null, "Employee not found");
                    return 0; // Return a default value (you may want to handle this differently)
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error calculating total deduction: " + e.getMessage());
        return 0; // Handle the error appropriately
    }
}

}
