package one.digitalinnovation.citiesapi.cities.repository;

import one.digitalinnovation.citiesapi.cities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
