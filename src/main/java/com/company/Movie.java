package com.company;

import java.util.*;

public class Movie {
    protected String genre;
    protected Director director;
    protected ArrayList<Actor> actors;
    protected ArrayList<Crew> crew;
    private double budget;
    private double moneySpent;
    private double moneyEarned;
    private double profit;


    // constructor
    public Movie(String genre, Director director, ArrayList<Actor> actors, ArrayList<Crew> crew, double budget, double moneySpent, double moneyEarned) {
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
        double budgetTotal = getBudget();
        return (moneyEarned - moneySpent) + budgetTotal;
    }

    public double payDay(Director director, ArrayList<Actor> actors, ArrayList<Crew> crew) {

        double totalActorPay = 0;
        double totalCrewPay = 0;
        double directorPay = 0;
        double payTotal = 0;

        directorPay = director.royaltiesEarned(profit);

        for (int i = 0; i < actors.size(); i++) {
            totalActorPay += actors.get(i).getPayEarned();
        } for (int i=0; i < crew.size(); i++) {
            totalCrewPay += crew.get(i).getPayEarned();
        }

        payTotal = totalActorPay + totalCrewPay + directorPay;

        budget -= payTotal;
        moneySpent += payTotal;

        return payTotal;
    }


    // getters and setters

    public String getGenre() {
        return genre;
    }

    public Director Director() {
        return director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public ArrayList<Crew> getCrew() {
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

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setCrew(ArrayList<Crew> crew) {
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
