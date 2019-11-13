package com.spring.joke.jokeapp.controller;

import com.spring.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @PostMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "chuck-norris";
    }

}
