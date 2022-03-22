package com.company;

public class Movie {
    protected String genre;
    protected String director;
    protected String actors;
    private String crew;
    private double budget;
    private double moneySpent;
    private double moneyEarned;
    private double profit;


    // constructor
    public Movie(String genre, String director, String actors, String crew, double budget, double moneySpent, double moneyEarned) {
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crew = crew;
        this.budget = budget;
        this.moneySpent = moneySpent;
        this.moneyEarned = moneyEarned;
        profit = calculateProfit();
    }

    // methods

    public double calculateProfit() {
        double moneyEarned = getMoneyEarned();
        double moneySpent = getMoneySpent();
        return moneyEarned - moneySpent;
    }

    public void payAll(double payTotal) {
        budget -= payTotal;
        moneySpent += payTotal;
    }


    // getters and setters

    public String getGenre() {
        return genre;
    }

    public String Director() {
        return director;
    }

    public String getActors() {
        return actors;
    }

    public String getCrew() {
        return crew;
    }

    public double getBudget() {
        return budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public double getProfit() {
        return profit;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
