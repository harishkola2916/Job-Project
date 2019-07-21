/**
 * 
 */
package com.mycode.moviemanager.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haree
 *
 */
@RestController
public class MovieController {
	@RequestMapping("/movie")
	public String getMovie() {
		return "Hello This is Movie Controller";
	}

}
