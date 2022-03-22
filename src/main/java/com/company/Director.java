package com.company;

public class Director extends Crew{
    private double royalty;


    // constructor
    public Director(String name, double pay, int hoursWorked, String department) {
        super(name, pay, hoursWorked, department);
        royalty = 0.01;
    }

    // methods

    public double royaltiesEarned(double movieProfits) {
        return movieProfits * royalty;
    }

    // getters and setters

    public double getRoyalty() {
        return royalty;
    }

    public void setRoyalty(double royalty) {
        this.royalty = royalty;
    }
}
