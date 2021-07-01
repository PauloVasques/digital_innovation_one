package one.digitalinnovation.citiesapi.cities.repository;

import one.digitalinnovation.citiesapi.cities.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CityRepositoryByName extends JpaRepository<City, String> {

    @Query(value = "SELECT * FROM cidade WHERE nome=?1", nativeQuery = true)
    Optional<City> findByName(String name);
}
