package com.company;

public class Crew extends Person{
    protected String department;

    // constructor
    public Crew(String name, double pay, double payEarned, String department) {
        super(name, pay, payEarned);
        this.department = department;
    }

    // getters and setters

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
