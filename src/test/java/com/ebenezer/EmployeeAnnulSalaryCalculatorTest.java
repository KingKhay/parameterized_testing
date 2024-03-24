package com.ebenezer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeAnnulSalaryCalculatorTest {
    /**
     * role,monthsWorked,expectedYearlySalary
     * MANAGER,12,180000
     * MANAGER,8,120000
     * DEVELOPER,6,54000
     * DEVELOPER,10,90000
     * TEAM_LEAD,3,36000
     * TEAM_LEAD,7,84000
     * FINANCE,12,90000
     * FINANCE,5,37500
     */
    private final EmployeeAnnumSalaryCalculator calculator = new EmployeeAnnumSalaryCalculator();

    @Test
    void testCalculateManagerWorkingForTwelveMonths(){
        //given
        int monthsWorked = 12;
        EmployeeRole managerRole = EmployeeRole.MANAGER;
        int expectedYearlySalary = 180000;

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(managerRole, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }

    @Test
    void testCalculateManagerWorkingForEightMonths(){
        //given
        int monthsWorked = 8;
        EmployeeRole managerRole = EmployeeRole.MANAGER;
        int expectedYearlySalary = 120000;

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(managerRole, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }

    @Test
    void testCalculateDeveloperWorkingForSixMonths(){
        //given
        int monthsWorked = 6;
        EmployeeRole managerRole = EmployeeRole.DEVELOPER;
        int expectedYearlySalary = 54000;

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(managerRole, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }

    @Test
    void testCalculateDeveloperWorkingForTenMonths(){
        //given
        int monthsWorked = 10;
        EmployeeRole managerRole = EmployeeRole.DEVELOPER;
        int expectedYearlySalary = 90000;

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(managerRole, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }

    @Test
    void testCalculateTeamLeadWorkingForThreeMonths(){
        //given
        int monthsWorked = 3;
        EmployeeRole managerRole = EmployeeRole.TEAM_LEAD;
        int expectedYearlySalary = 36000;

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(managerRole, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }

    @Test
    void testCalculateTeamLeadWorkingForSevenMonths(){
        //given
        int monthsWorked = 7;
        EmployeeRole managerRole = EmployeeRole.TEAM_LEAD;
        int expectedYearlySalary = 84000;

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(managerRole, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }

    @Test
    void testCalculateFinanceWorkingForTwelveMonths(){
        //given
        int monthsWorked = 12;
        EmployeeRole managerRole = EmployeeRole.FINANCE;
        int expectedYearlySalary = 90000;

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(managerRole, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }

    @Test
    void testCalculateFinanceWorkingForFiveMonths(){
        //given
        int monthsWorked = 5;
        EmployeeRole managerRole = EmployeeRole.FINANCE;
        int expectedYearlySalary = 37500;

        //when
        int actualYearlySalary = calculator.calculateYearlySalary(managerRole, monthsWorked);

        //then
        assertEquals(expectedYearlySalary, actualYearlySalary);
    }
}
