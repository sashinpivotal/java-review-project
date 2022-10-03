package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

public class HRClient {

    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.setMonthlySalary(2000.0);
        salariedEmployee.setName("sang");
        String employeeInfo1 = salariedEmployee.getEmployeeInfo();
        System.out.println("salaried employee1 = " + employeeInfo1);

        SalariedEmployee salariedEmployee2 = new SalariedEmployee("joe",
                LocalDate.of(2020, 03, 04),
                3000.0);
        System.out.println("salaried employee2 = " + salariedEmployee2.getEmployeeInfo());

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("mary",
                LocalDate.of(2019, 04, 03),
                100,
                10.0);
        System.out.println("hourly employee = " + hourlyEmployee1.getEmployeeInfo());

        Department department = new Department("engineering", "boston");
        department.addEmployee(salariedEmployee);
        department.addEmployee(salariedEmployee2);
        department.addEmployee(hourlyEmployee1);

        int numberOfEmployeesWhoWorked = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        System.out.println("number of employees who worked = " + numberOfEmployeesWhoWorked);

        double totalMonthlyCompensation
                = department.computeDepartmentTotalMonthlyCompensation();
        System.out.println("department total monthly compensation = " +
                totalMonthlyCompensation);

    }
}
