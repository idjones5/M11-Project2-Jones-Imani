package com.company;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // creating a list of actors and crew for the movie object
        ArrayList<Actor> actorList = new ArrayList<>();
        ArrayList<Crew> crewList = new ArrayList<>();

        // instantiation
        Actor actor = new Actor("Gerald", 5000, 5000.00, "Extra");
        Crew crew = new Crew("Garfield", 300.00,300.00, "Collections");
        Director director = new Director("Ryuji Sakamoto", 1000.00, 1000.00, "Movie Creation");
        PA pa = new PA("Jibanyan", 500.00, 500.00, 50 , "Movie creation");
        Movie movie = new Movie("Fantasy", director, actorList, crewList, 25000000.00, 5000000.00, 100000000.00);

        // adding to the list
        actorList.add(actor);
        crewList.add(director);
        crewList.add(pa);
        crewList.add(crew);

        // setting the crew and actors
        movie.setActors(actorList);
        movie.setCrew(crewList);

        // demonstration
        double initialMovieBudget = movie.getBudget();
        double totalPayout = movie.payDay(director, actorList, crewList);
        double paPay = pa.getPayEarned();
        double movieMoneySpent = movie.getMoneySpent();
        double movieRemainingBudget = movie.getBudget();
        double movieProfit = movie.getProfit();
        double directorRoyalties = director.royaltiesEarned(movie.getProfit());

        // printing to console
        System.out.println("Total movie payDay spent: " + totalPayout + "\nPaPay: " + paPay + "\nMoney Spent (including payday): " + movieMoneySpent + "\nInitial movie budget: " + initialMovieBudget + "\nRemaining Budget after payday: " + movieRemainingBudget + "\nProfits: " + movieProfit + "\nDirector Royalties: " + directorRoyalties);
    }
}
