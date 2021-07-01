package one.digitalinnovation.citiesapi.states.resource;

import one.digitalinnovation.citiesapi.states.entity.State;
import one.digitalinnovation.citiesapi.states.repository.StateRepository;
import one.digitalinnovation.citiesapi.states.repository.StateRepositoryByName;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    private final StateRepositoryByName repositoryByName;


    public StateResource(StateRepository repository, StateRepositoryByName repositoryByName) {
        this.repository = repository;
        this.repositoryByName = repositoryByName;
    }

    @GetMapping
    @RequestMapping
    public List<State> states(){
        return repository.findAll();
    }

    @GetMapping("/name")
    public ResponseEntity getByName(@RequestParam(name = "name") final String name) {
        Optional<State> optional = repositoryByName.findByName(name);

        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
