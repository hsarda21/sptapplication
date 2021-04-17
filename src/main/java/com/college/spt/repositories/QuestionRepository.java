package com.college.spt.repositories;

import com.college.spt.model.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question, Long>
{

}
