package com.geekster.RandomJoke.service;

import com.geekster.RandomJoke.repository.JokesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class JokesService {
    @Autowired
    private JokesDao jokesDao;

    public String addJoke(String joke) {
        jokesDao.save(joke);
        return "joke added";
    }

    public String getJoke() {
        List<String> currentJokeList = jokesDao.getJokesFromDao();
        Random random = new Random();
        int n = random.nextInt(currentJokeList.size());
        return currentJokeList.get(n);
    }
}
