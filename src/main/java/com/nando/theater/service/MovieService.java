package com.nando.theater.service;

import com.nando.theater.domain.Movie;
import com.nando.theater.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

   public Optional<Movie> getMovie(UUID id){
        return movieRepository.findById(id);
   }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
