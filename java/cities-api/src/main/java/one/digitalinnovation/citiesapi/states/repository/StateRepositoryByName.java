package one.digitalinnovation.citiesapi.states.repository;

import one.digitalinnovation.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StateRepositoryByName extends JpaRepository<State, String> {

    @Query(value = "SELECT * FROM estado WHERE nome=?1", nativeQuery = true)
    Optional<State> findByName(String name);
}
