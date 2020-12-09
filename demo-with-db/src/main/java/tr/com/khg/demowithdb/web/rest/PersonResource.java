package tr.com.khg.demowithdb.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.khg.demowithdb.domain.Person;
import tr.com.khg.demowithdb.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/person-service/api")
public class PersonResource {

    private final PersonService personService;

    public PersonResource(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> getPersonList() {
        return ResponseEntity.ok().body(personService.getAllPeople());
    }
}
