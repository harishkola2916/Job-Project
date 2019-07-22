/**
 * 
 */
package com.mycode.moviemanager.services;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mycode.moviemanager.model.Movie;

/**
 * @author haree
 *
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
	Movie findBy_id(ObjectId _id);

	@Query("{title : ?0}")
	public Movie findByTitle(String title);
}
