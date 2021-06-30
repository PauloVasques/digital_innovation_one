package one.digitalinnovation.citiesapi.cities.resource;

import one.digitalinnovation.citiesapi.cities.entity.City;
import one.digitalinnovation.citiesapi.cities.repository.CityRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityResource {

    private final CityRepository repository;

    public CityResource(CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cities")
    public List<City> cities(){
        return repository.findAll();
    }
}
