/**
 * 
 */
package com.mycode.moviemanager.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author haree
 *
 */
@Getter
@Setter
@NoArgsConstructor
public class Movie {
	@Id
	private ObjectId _id;
	private String title;
	private String year;
	private String runtime;
	private List<String> genre;
	private String imdbRating;
	private String language;

	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id.toHexString();
	}

	/**
	 * @param _id the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	/**
	 * @param _id
	 * @param title
	 * @param year
	 * @param runtime
	 * @param genres
	 * @param rating
	 * @param language
	 */

}
