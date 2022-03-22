package com.company;

public abstract class Person {
    protected String name;
    protected double pay;
    protected int hoursWorked;

    // constructor
    public Person(String name, double pay, int hoursWorked) {
        this.name = name;
        this.pay = pay;
        this.hoursWorked = hoursWorked;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public double getPay() {
        return pay;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
