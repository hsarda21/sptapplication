package com.college.spt.repositories;

import com.college.spt.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>
{
    Person findByUsername(String username);
}
