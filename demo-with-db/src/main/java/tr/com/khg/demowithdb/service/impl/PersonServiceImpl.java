package tr.com.khg.demowithdb.service.impl;

import org.springframework.stereotype.Service;
import tr.com.khg.demowithdb.domain.Person;
import tr.com.khg.demowithdb.repository.PersonRepository;
import tr.com.khg.demowithdb.service.PersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }
}
