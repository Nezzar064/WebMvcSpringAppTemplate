package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


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
        //"movie" is the key, you would access it via thymeleaf. movielist is the object being put in the key.
        model.addAttribute("movie", movieList);
        Example of thymeleaf

         */
        ArrayList<String> derp = new ArrayList<>();

        derp.add("hej");
        derp.add("med");
        derp.add("dig");

        model.addAttribute("derpList", derp);

        return "nothingTwo";
    }
}
