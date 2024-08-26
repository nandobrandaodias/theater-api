package com.nando.theater.repository;

import com.nando.theater.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MovieRepository extends JpaRepository<Movie, UUID> {

    Movie findMovieByTitle(String title);
}
