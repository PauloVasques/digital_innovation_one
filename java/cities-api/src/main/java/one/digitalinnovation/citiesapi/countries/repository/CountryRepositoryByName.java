package one.digitalinnovation.citiesapi.countries.repository;

import one.digitalinnovation.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CountryRepositoryByName extends JpaRepository<Country, String> {

    @Query(value = "SELECT * FROM pais WHERE nome=?1", nativeQuery = true)
    Optional<Country> findByName(String name);
}