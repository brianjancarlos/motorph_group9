package com.group9.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayEmployeeDetails {
    private static final String URL = "jdbc:postgresql://localhost:5432/motorph_masterdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "gR0up9!";

    public void displayDetails() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employee_details");

            while (resultSet.next()) {
                System.out.println("Employee ID: " + resultSet.getInt("employee_id"));
                System.out.println("Employee Name: " + resultSet.getString("last_name"));
                System.out.println("First Name: " + resultSet.getString("first_name"));
                // Print other details as needed
                System.out.println("-------------------------");
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}