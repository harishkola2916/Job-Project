/**
 * 
 */
package com.mycode.moviemanager.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycode.moviemanager.model.Movie;
import com.mycode.moviemanager.services.MovieRepository;

/**
 * @author haree
 * @param <Movie>
 *
 */
@RestController
@RequestMapping(value = "/api")
public class MovieController {

	@Autowired
	private MovieRepository movieRepo;

	@GetMapping(value = "/moviesById", params = "id")
	public Movie getMovieById(@RequestParam(name = "id") ObjectId id) {
		return movieRepo.findBy_id(id);
	}

	@GetMapping(value = "/moviesByTitle", params = "title")
	public Movie getMovieByTitle(@RequestParam(name = "title") String title) {
		return movieRepo.findByTitle(title);
	}

	@GetMapping(value = "/movies")
	public List<Movie> getAllMovies() {
		return movieRepo.findAll();
	}

	@PostMapping(value = "/movies/movie")
	public Movie saveMovie(@RequestBody Movie movie) {
		movie.set_id(ObjectId.get());
		return movieRepo.save(movie);
	}

	@PutMapping(value = "/movies/{id}")
	public void updateMovieById(@PathVariable("id") ObjectId id, @Valid @RequestBody Movie movie) {
		movie.set_id(id);
		movieRepo.updateTitle(id, movie);
		// movieRepo.save(movie);
	}
}
