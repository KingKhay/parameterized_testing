package com.ebenezer;

public enum EmployeeRole {

    MANAGER(15000),
    DEVELOPER(9000),
    TEAM_LEAD(12000),
    FINANCE(7500);

    private final int monthlySalary;

    EmployeeRole(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
}
