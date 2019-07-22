/**
 * 
 */
package com.mycode.moviemanager.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * @author haree
 *
 */
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
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the runtime
	 */
	public String getRuntime() {
		return runtime;
	}
	/**
	 * @param runtime
	 *            the runtime to set
	 */
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	/**
	 * @return the genre
	 */
	public List<String> getGenre() {
		return genre;
	}
	/**
	 * @param genre
	 *            the genre to set
	 */
	public void setGenre(List<String> genre) {
		this.genre = genre;
	}
	/**
	 * @return the imdbRating
	 */
	public String getImdbRating() {
		return imdbRating;
	}
	/**
	 * @param imdbRating
	 *            the imdbRating to set
	 */
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language
	 *            the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @param _id
	 * @param title
	 * @param year
	 * @param runtime
	 * @param genre
	 * @param imdbRating
	 * @param language
	 */
	public Movie(ObjectId _id, String title, String year, String runtime,
			List<String> genre, String imdbRating, String language) {
		super();
		this._id = _id;
		this.title = title;
		this.year = year;
		this.runtime = runtime;
		this.genre = genre;
		this.imdbRating = imdbRating;
		this.language = language;
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
