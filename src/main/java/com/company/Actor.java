package com.company;

public class Actor extends Person{
    protected String role;

    // constructor
    public Actor(String name, double pay, int hoursWorked, String role) {
        super(name, pay, hoursWorked);
        this.role = role;
    }

    // getters and setters

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
