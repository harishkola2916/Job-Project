/**
 * 
 */
package com.mycode.moviemanager.services;

import org.bson.types.ObjectId;

import com.mycode.moviemanager.model.Movie;

/**
 * @author haree
 *
 */
public interface MovieRepositoryCustom {
	void updateTitle(ObjectId id, Movie movie);

}
