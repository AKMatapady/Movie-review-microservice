package name.akmatapady.moviecatalogservices.resources;

import name.akmatapady.moviecatalogservices.models.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
//@RequestMapping("/catalog")
public class MovieCatalogContoller {

    @RequestMapping("/")
    public String welcome()
    {
        return "Movie Catalog Controller Server is up and running";
    }

    @RequestMapping("/catalog/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
    {
        return Collections.singletonList(
                new CatalogItem("Mad max: Fury Road", "Action packed movie", 5)
        );
    }
}
