package com.techelevator.dao;

import com.techelevator.model.MoviesUsers;

public interface MoviesUsersDao {
    void updateMoviesUsers(MoviesUsers moviesUsers);

    boolean checkForMovieUserAssociation(MoviesUsers moviesUsers);

    void addMoviesUsers(MoviesUsers moviesUsers);
}