package com.college.spt.services;

import com.college.spt.model.Person;

public interface PersonService extends CrudService<Person, Long>
{
    Person findByUsername(String username);
}
