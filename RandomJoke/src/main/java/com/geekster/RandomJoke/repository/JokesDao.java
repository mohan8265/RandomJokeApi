package com.geekster.RandomJoke.repository;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class JokesDao {
    private List<String> jokesList = new ArrayList<>();

    public JokesDao() {
        jokesList = new ArrayList<>();
        jokesList.add(" What do kids play when their mom is using the phone? Bored games.");
        jokesList.add("Why are snails slow? Because they’re carrying a house on their back.");
        jokesList.add("What do you call a couple of chimpanzees sharing an Amazon account? PRIME-mates.");
        jokesList.add("Name the kind of tree you can hold in your hand? A palm tree!");
        jokesList.add("What do you call a guy who’s really loud? Mike.");
        jokesList.add("What is brown, hairy and wears sunglasses? A coconut on vacation.");
    }

    public List<String> getJokesFromDao(){
        return jokesList;
    }

    public void save(String joke) {
        jokesList.add(joke);
    }
}
