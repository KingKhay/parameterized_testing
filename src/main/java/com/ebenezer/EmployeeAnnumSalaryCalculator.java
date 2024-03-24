package com.ebenezer;

public class EmployeeAnnumSalaryCalculator {
    public int calculateYearlySalary(EmployeeRole role, int monthsWorked){
        int monthlySalary = role.getMonthlySalary();
        return monthlySalary * monthsWorked;
    }
}
