package com.hr.personnel;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class HourlyEmployeeTest {

    @Test
    public void computeMonthlyCompensation_should_return_multiplication_of_hourlyRate_and_hours() {

        HourlyEmployee sang = new HourlyEmployee("sang",
                LocalDate.of(2020, 01, 02),
                200,
                10.0);
        double monthlyCompensation = sang.computeMonthlyCompensation();
        assertThat(monthlyCompensation).isEqualTo(2000.0);
    }
}