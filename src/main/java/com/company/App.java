package com.company;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        // instantiation
        Actor actor = new Actor("Gerald", 55.00, 210, "Extra");
        Crew crew = new Crew("Garfield", 25.00,300, "Collections");
        Director director = new Director("Ryuji Sakamoto", 1000.00, 300, "Movie Creation");
        PA pa = new PA("Jibanyan",500.00,50,"Movie creation");
        Movie movie = new Movie("Fantasy", "Hayao Miyazaki", "Gerald, WDH, SHJ, LMK, LDH", "Komasan, Cyndaquil, Slowpoke", 25000000.00, 5000000.00, 100000000.00);


        // demonstration

        movie.payAll(250000);
        double paPay = pa.basePay();
        double movieMoneySpent = movie.getMoneySpent();
        double movieRemainingBudget = movie.getBudget();
        double movieProfit = movie.getProfit();
        double directorRoyalties = director.royaltiesEarned(movie.getProfit());

        // printing to console
        System.out.println("PaPay: " + paPay + "\nMoney Spent: " + movieMoneySpent + "\nRemaining Budget: " + movieRemainingBudget + "\nProfits: " + movieProfit + "\nDirector Royalties: " + directorRoyalties);

    }
}
