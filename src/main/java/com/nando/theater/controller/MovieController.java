package com.nando.theater.controller;

import com.nando.theater.domain.Movie;
import com.nando.theater.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getMovies() {
        return this.movieService.getMovies();
    }

    @PostMapping
    public Movie saveMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }
}
