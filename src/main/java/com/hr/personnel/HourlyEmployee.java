package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private int numberOfHoursWorked;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate hireDate, int numberOfHoursWorked, double hourlyRate) {
        super(name, hireDate);
        setNumberOfHoursWorked(numberOfHoursWorked);
        setHourlyRate(hourlyRate);
    }

    @Override
    public String getEmployeeInfo() {
        return null;
    }

    @Override
    public double computeMonthlyCompensation() {
        return numberOfHoursWorked * hourlyRate;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double computeMonthlyTaxToPay() {
        return computeMonthlyCompensation() * HOURLY_TAX_RATE;
    }
}
