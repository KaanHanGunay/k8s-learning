package tr.com.khg.demowithdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.khg.demowithdb.domain.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
