/**
 * 
 */
package com.mycode.moviemanager.controllers;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class MovieController {

	@Autowired
	private MovieRepository movieRepo;

	@RequestMapping(value = "/movies", method = RequestMethod.GET, params = "id")
	public Movie getMovieById(@RequestParam(name = "id") ObjectId id) {
		return movieRepo.findBy_id(id);
	}

	@RequestMapping(value = "/movies", method = RequestMethod.GET, params = "title")
	public Movie getMovieByTitle(@RequestParam(name = "title") String title) {
		return movieRepo.findByTitle(title);
	}

	@RequestMapping(value = "/movies", method = RequestMethod.GET)
	public List<Movie> getMovies() {
		return movieRepo.findAll();
	}

	@RequestMapping(value = "/movies/movie", method = RequestMethod.POST)
	public Movie saveMovie(@RequestBody Movie movie) {
		movie.set_id(ObjectId.get());
		return movieRepo.save(movie);
	}

	@RequestMapping(value = "/movies/{id}", method = RequestMethod.PUT)
	public void updateMovieById(@PathVariable("id") ObjectId id,
			@Valid @RequestBody Movie movie) {
		movie.set_id(id);
		movieRepo.updateTitle(id, movie);
		// movieRepo.save(movie);
	}
}
