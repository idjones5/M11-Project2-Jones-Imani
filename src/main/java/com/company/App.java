package com.company;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // creating a list of actors and crew for the movie object
        List<Actor> actorList = new ArrayList<>();
        List<Crew> crewList = new ArrayList<>();

        // instantiation of the 6 classes
        Person person = new Person("Psyduck", 50, 50);
        Actor actor = new Actor("Gerald", 5000, 5000.00, "Extra");
        Crew crew = new Crew("Garfield", 300.00,300.00, "Collections");
        Director director = new Director("Ryuji Sakamoto", 1000.00, 1000.00, "Movie Creation");
        PA pa = new PA("Jibanyan", 500.00, 500.00, 50 , "Movie creation");
        Movie movie = new Movie("Fantasy", director, actorList, crewList, 25000000.00, 5000000.00);

        // adding to the list
        actorList.add(actor);
        crewList.add(director);
        crewList.add(pa);
        crewList.add(crew);

        // demonstration
        double initialMovieBudget = movie.getBudget(); // movie budget before paying all actors and crew
        double totalPayout = movie.payDay(); // paying out all actors and crew
        double paPay = pa.getPayEarned(); // getting the pay earned for the pa based on the amount of hours worked
        double movieMoneySpent = movie.getMoneySpent(); // total money spent after paying the actors and crew
        double movieProfit = movie.getProfit(); // the profit after subtracting the total money spent from the money earned in box office (passed in constructor), and adding it to the remaining budget not spent
        double directorRoyalties = director.royaltiesEarned(movieProfit); // the royalties the director earned from the movie (movieProfit * .01)
        double afterDirectorProfit = movieProfit - directorRoyalties; // total profit after paying the director royalties

        // printing to console
        System.out.format("\nPaPay: %.2f", paPay); // how much the pa earned
        System.out.format("\nMoney Spent (including payday): %.2f", movieMoneySpent); // how much the movie spent of budget
        System.out.format("\nProfits: %.2f", movieProfit); // how much the movie profited
        System.out.format("\nDirector Royalties: %.2f",directorRoyalties); // how much the director made in royalties
        System.out.format("\nAfter paying director profit: %.2f\n",afterDirectorProfit);
    }
}
