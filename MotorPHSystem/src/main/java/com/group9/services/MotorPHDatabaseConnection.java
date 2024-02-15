/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group9.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.group9.domain.EmployeeDetails;

/**
 *
 * @author brianjancarlos
 */
public class MotorPHDatabaseConnection {
    
    private Connection connection;
    private final String url = "jdbc:postgresql://localhost:5432/motorph_masterdb"; // Modify the URL
    private final String username = "postgres"; // Modify the username
    private final String password = "gR0up9!"; // Modify the password

    public boolean connect() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<EmployeeDetails> getAllEmployeeDetails() {
        List<EmployeeDetails> employeeDetails = new ArrayList<>();
        if (connection != null) {
            String query = "SELECT * FROM employee_details ORDER by employee_id";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {
                    String employeeId = resultSet.getString("employee_id"); // these are the column names in the employee_details db
                    String lastName = resultSet.getString("last_name");
                    String firstName = resultSet.getString("first_name");
                    String birthday = resultSet.getString("birthday");
                    String address = resultSet.getString("address");
                    String phone = resultSet.getString("phone_number");
                    String status = resultSet.getString("status");
                    String sss = resultSet.getString("sss_id");
                    String philhealth = resultSet.getString("philhealth_id");
                    String tin = resultSet.getString("tin_id");
                    String pagibig = resultSet.getString("pagibig_id");
                    String position = resultSet.getString("position_name");
                    String immediateSupervisor = resultSet.getString("immediate_supervisor");
                    EmployeeDetails employeeDetail = new EmployeeDetails(employeeId, lastName, firstName, birthday, address, phone, status, sss, philhealth, tin, pagibig, position, immediateSupervisor);
                    employeeDetails.add(employeeDetail);
                }

                resultSet.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employeeDetails;
    }
    
    
    public void close() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
}
