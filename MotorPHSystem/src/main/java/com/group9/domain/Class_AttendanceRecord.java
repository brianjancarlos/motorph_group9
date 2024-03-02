/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.group9.domain;

/**
 *
 * @author brianjancarlos
 */
public class Class_AttendanceRecord {

    private int employee_id;
    private String last_name;
    private String first_name;
    private String login_date;
    private String timein;
    private String timeout;

    public Class_AttendanceRecord(int employee_id, String last_name, String first_name, String login_date, String timein, String timeout) {
        this.employee_id = employee_id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.login_date = login_date;
        this.timein = timein;
        this.timeout = timeout;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLogin_date() {
        return login_date;
    }

    public void setLogin_date(String login_date) {
        this.login_date = login_date;
    }

    public String getTimein() {
        return timein;
    }

    public void setTimein(String timein) {
        this.timein = timein;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

}
