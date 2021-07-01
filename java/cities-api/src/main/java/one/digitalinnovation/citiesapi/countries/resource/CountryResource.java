package one.digitalinnovation.citiesapi.countries.resource;

import one.digitalinnovation.citiesapi.countries.entity.Country;
import one.digitalinnovation.citiesapi.countries.repository.CountryRepository;
import one.digitalinnovation.citiesapi.countries.repository.CountryRepositoryByName;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryResource {

    private final CountryRepository repository;

    private final CountryRepositoryByName repositoryByName;

    public CountryResource(CountryRepository repository, CountryRepositoryByName repositoryByName) {
        this.repository = repository;
        this.repositoryByName = repositoryByName;
    }

    @GetMapping
    public List<Country> countries() {
        return repository.findAll();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity getById(@PathVariable Long id){
//        Optional<Country> optional = repository.findById(id);
//
//        if(optional.isPresent()) {
//            return ResponseEntity.ok().body(optional.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @GetMapping("/name")
    public ResponseEntity getByName(@RequestParam(name = "name") final String name) {
        Optional<Country> optional = repositoryByName.findByName(name);

        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
