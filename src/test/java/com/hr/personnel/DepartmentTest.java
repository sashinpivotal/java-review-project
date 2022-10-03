package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DepartmentTest {

    private Department department;
    private SalariedEmployee joe;

    @Before
    public void setUp() throws Exception {
        department = new Department("engineering", "boston");
        joe = new SalariedEmployee("joe",
                LocalDate.of(2020, 03, 04),
                3000.0);
    }

    @Test
    public void addEmployee_should_increase_currentIndex_by_1() {
        int currentIndexBeforeAddingANewEmployee = department.getCurrentIndex();
        department.addEmployee(joe);
        int currentIndexAfterAddingAnEmployeee = department.getCurrentIndex();
        Assertions.assertThat(currentIndexAfterAddingAnEmployeee)
                .isEqualTo(currentIndexBeforeAddingANewEmployee + 1);
    }

    @Test
    public void letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked_should_return_number_of_employees_who_worked() {
        int currentIndexBeforeAddingANewEmployee = department.getCurrentIndex();
        department.addEmployee(joe);
        int numberOfEmployeesWhoWorked
                = department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked();
        Assertions.assertThat(numberOfEmployeesWhoWorked)
                .isEqualTo(1);
    }
}