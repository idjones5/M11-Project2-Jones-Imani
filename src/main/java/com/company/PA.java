package com.company;

public class PA extends Crew{

    // constructor
    public PA(String name, double pay, int hoursWorked, String department) {
        super(name, pay, hoursWorked, department);
    }

    // methods

    public double basePay() {
        double pay = getPay();
        double hoursWorked = getHoursWorked();
        return pay * hoursWorked;
    }
}
