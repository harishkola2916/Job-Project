/**
 * 
 */
package com.mycode.moviemanager.services;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mycode.moviemanager.model.Movie;

/**
 * @author haree
 *
 */
public class MovieRepositoryImpl implements MovieRepositoryCustom {

	private MongoTemplate mongoTemplate;

	@Autowired
	public MovieRepositoryImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.mycode.moviemanager.services.MovieRepositoryCustom#updateTitle(org.
	 * bson.types.ObjectId, com.mycode.moviemanager.model.Movie)
	 */
	@Override
	public void updateTitle(ObjectId id, Movie movie) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));
		query.fields().include("_id");

		Update update = new Update();
		update.set("title", movie.getTitle());
		mongoTemplate.updateFirst(query, update, Movie.class);

	}

}
