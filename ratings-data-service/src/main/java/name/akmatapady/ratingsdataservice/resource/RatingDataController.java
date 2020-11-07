package name.akmatapady.ratingsdataservice.resource;

import name.akmatapady.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingDataController {

    @RequestMapping("/")
    public String welcome()
    {
        return "Rating Data Controller Server is up and running";
    }

    @RequestMapping("/ratings/{ratingId}")
    public Rating getRatingsData(@PathVariable("ratingId") String movieID)
    {
        return new Rating(movieID, 5);
    }

}
