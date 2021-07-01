package one.digitalinnovation.citiesapi.cities.resource;

import one.digitalinnovation.citiesapi.cities.entity.City;
import one.digitalinnovation.citiesapi.cities.repository.CityRepository;
import one.digitalinnovation.citiesapi.cities.repository.CityRepositoryByName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cities")
public class CityResource {


    private final CityRepository repository;


    private final CityRepositoryByName repositoryByName;

    public CityResource(CityRepository repository, CityRepositoryByName repositoryByName) {
        this.repository = repository;
        this.repositoryByName = repositoryByName;
    }


    @GetMapping
    public Page<City> cities(final Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/name")
    public ResponseEntity getByName(@RequestParam(name = "name") final String name){
        Optional<City> optional = repositoryByName.findByName(name);

        if(optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
