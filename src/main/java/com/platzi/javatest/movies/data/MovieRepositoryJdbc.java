package com.platzi.javatest.movies.data;

import java.util.Collection;

import org.springframework.jdbc.core.JdbcTemplate;

import com.platzi.javatest.movies.model.Movie;
import com.platzi.javatest.movies.model.Genre;
import org.springframework.jdbc.core.RowMapper;

public class MovieRepositoryJdbc implements MovieRepository {
	
	private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
    	   Object[] args = { id };
           return jdbcTemplate.queryForObject("select * from movies where id = ?", args, movieMapper);
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {
    	  jdbcTemplate.update("insert into movies (name, minutes, genre) values (?, ?, ?)",
                  movie.getName(), movie.getMinutes(), movie.getGenre().toString());
    }

    private static RowMapper<Movie> movieMapper = (rs, rowNum) ->
            new Movie(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("minutes"),
                Genre.valueOf(rs.getString("genre")));
}


