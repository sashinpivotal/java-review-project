package com.hr.personnel.client;

import com.hr.personnel.Employee;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Mike",
                LocalDate.of(2020, 01, 02));
        String employeeInfo1 = employee1.getEmployeeInfo();
        System.out.println(employeeInfo1);
        Employee employee2 = new Employee("Tom",
                LocalDate.of(2010, 02, 23));
        String employeeInfo2 = employee2.getEmployeeInfo();
        System.out.println(employeeInfo2);
    }
}
