package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee  extends  Employee{

    private double monthlySalary;

    public SalariedEmployee(String name, LocalDate hireDate, double monthSalary) {
        super(name, hireDate);
        this.monthlySalary = monthSalary;
    }

    public SalariedEmployee() {
    }

    @Override
    public String getEmployeeInfo() {
        return null;
    }

    @Override
    public double computeMonthlyCompensation() {
        return getMonthlySalary();
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * SALARIED_TAX_RATE;
    }
}
