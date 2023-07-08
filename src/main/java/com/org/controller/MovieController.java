package com.org.controller;

import com.org.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {


    @GetMapping("/findInfo")
    public List<Movie> retrieveCoursesForStudent() {

        List<Movie> mvList = new ArrayList<>();
        Movie mv=new Movie();

        mv.setMovieName("PS2");
        mv.setTicketPrice("₹ 150");

        mvList.add(mv);

        return mvList;
    }
}