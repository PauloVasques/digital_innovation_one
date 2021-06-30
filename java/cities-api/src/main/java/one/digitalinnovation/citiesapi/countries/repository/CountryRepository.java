package one.digitalinnovation.citiesapi.countries.repository;

import one.digitalinnovation.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
