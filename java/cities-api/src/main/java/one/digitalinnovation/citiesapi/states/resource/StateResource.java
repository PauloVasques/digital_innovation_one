package one.digitalinnovation.citiesapi.states.resource;

import one.digitalinnovation.citiesapi.states.entity.State;
import one.digitalinnovation.citiesapi.states.repository.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StateResource {

    private final StateRepository repository;


    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    @RequestMapping("/states")
    public List<State> states(){
        return repository.findAll();
    }
}
