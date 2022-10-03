package com.hr.personnel;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private String location;

//    private Employee[] employees = new Employee[100];

    List<Employee> employees = new ArrayList<>();
//    private int currentIndex = 0;

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addEmployee(Employee employee) {
//        employees[currentIndex++] = employee;
        employees.add(employee);
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int numberOfWorkersWhoWorked = 0;
//        for (int i = 0; i < currentIndex; i++) {
//            if (employees[i].work().contains("worked")) {
//                numberOfWorkersWhoWorked++;
//            }
//        }
        for (Employee employee : employees) {
            if (employee.work().contains("work")) {
                numberOfWorkersWhoWorked++;
            }
        }
        return numberOfWorkersWhoWorked;
    }

    public double computeDepartmentTotalMonthlyCompensation() {

        double monthlyTotalCompensation = 0.0;

//        for (int i = 0; i < currentIndex; i++) {
//            System.out.println("---> " + employees[i].getClass());
//            monthlyTotalCompensation
//                    += employees[i].computeMonthlyCompensation();
//        }

        for (Employee employee : employees) {
            double monthlyCompensation = employee.computeMonthlyCompensation();
            monthlyTotalCompensation += monthlyCompensation;
        }

        return monthlyTotalCompensation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
