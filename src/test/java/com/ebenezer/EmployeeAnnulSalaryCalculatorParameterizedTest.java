package com.ebenezer;

import com.ebenezer.converter.EmployeeRoleConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeAnnulSalaryCalculatorParameterizedTest {
    private final EmployeeAnnumSalaryCalculator calculator = new EmployeeAnnumSalaryCalculator();

    @ParameterizedTest
    @CsvFileSource(resources = "/test_data.csv", numLinesToSkip = 1)
    void testCalculateYearlySalary(@ConvertWith(EmployeeRoleConverter.class) EmployeeRole role, int monthsWorked, int expectedYearlySalary){
        //given

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(role, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }
}