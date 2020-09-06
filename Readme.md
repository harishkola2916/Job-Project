## Springboot with mongodb

Example project using springboot and mongodb which manages the movie details. 

This rest service performs following operations
1. Creates movie details
2. Returns all movie details
3. Finds movie by movie Id
4. Finds movie by movie Title
5. Updates movie details


Running instructions:
To build 
	mvn clean install

To run the project, navigate to the root of the project and run below command
        mvn spring-boot:run

To view the list of endpoints this project has,
Open postman and type below commands in the url
To view the API details:
    http://localhost:8080/v2/api-docs
To view the API details using swagger-ui
    http://localhost:8080/swagger-ui.html#/movie-controller



