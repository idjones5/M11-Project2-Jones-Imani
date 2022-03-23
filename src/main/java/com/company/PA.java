package com.company;

public class PA extends Crew{
    protected int hoursWorked;

    // constructor
    public PA(String name, double pay, double payEarned, int hoursWorked, String department) {
        super(name, pay, payEarned, department);
        this.hoursWorked = hoursWorked;
        this.payEarned = hoursWorked * pay;
    }

    // getters and setters

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
