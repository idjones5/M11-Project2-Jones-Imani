package com.company;

public abstract class Person {
    protected String name;
    protected double pay;
    protected double payEarned;

    // constructor
    public Person(String name, double pay, double payEarned) {
        this.name = name;
        this.pay = pay;
        this.payEarned = payEarned;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public double getPay() {
        return pay;
    }

    public double getPayEarned() {
        return payEarned;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setPayEarned(double payEarned) {
        this.payEarned = payEarned;
    }
}
