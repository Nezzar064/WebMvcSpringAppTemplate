package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NothingController {

    @GetMapping("/nothing")
    public String hello() {
        return "nothing";
    }

    @GetMapping("/nothing/getNothing")
    public String getFirst(Model model) {
        /*
        List<Movie> movieList = movieService.getAllMovies();
        model.addAttribute("movie", movieList);
        Example of thymeleaf
         */
        return "nothingTwo";
    }
}
