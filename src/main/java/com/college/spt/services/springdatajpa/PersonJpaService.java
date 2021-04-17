package com.college.spt.services.springdatajpa;

import com.college.spt.model.Person;
import com.college.spt.repositories.PersonRepository;
import com.college.spt.services.PersonService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PersonJpaService implements PersonService
{
    private final PersonRepository personRepository;

    public PersonJpaService(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    @Override
    public Set<Person> findAll() {
        Set<Person> students = new HashSet<>();
        personRepository.findAll().forEach(students::add);

        return students;
    }

    @Override
    public Person findById(Long aLong) {
        return personRepository.findById(aLong).orElse(null);
    }

    @Override
    public Person save(Person object) {
        return personRepository.save(object);
    }

    @Override
    public void delete(Person object) {
        personRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        personRepository.deleteById(aLong);
    }


    @Override
    public Person findByUsername(String username)
    {
        return personRepository.findByUsername(username);
    }
}
