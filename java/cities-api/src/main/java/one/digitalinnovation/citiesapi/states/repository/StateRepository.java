package one.digitalinnovation.citiesapi.states.repository;

import one.digitalinnovation.citiesapi.states.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
