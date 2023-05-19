package com.geekster.RandomJoke.controller;

import com.geekster.RandomJoke.service.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JokesController {
    @Autowired
    private JokesService jokesService;

    @PostMapping("/addJoke")
    public String addJoke(@RequestBody String joke){
        return jokesService.addJoke(joke);
    }

    @GetMapping("/getRandomJoke")
    public String getJoke(){
        return jokesService.getJoke();
    }
}
