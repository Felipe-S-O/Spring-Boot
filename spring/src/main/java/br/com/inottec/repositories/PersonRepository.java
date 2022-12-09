package br.com.inottec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.inottec.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
