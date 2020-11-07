package name.akmatapady.movieinfoservice.resource;

import name.akmatapady.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @RequestMapping("/")
    public String welcome()
    {
        return "Movie Controller Server is up and running";
    }

    @RequestMapping("/movies/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieID)
    {
        return new Movie(movieID, "Mad Max: Fury Road");
    }
}
