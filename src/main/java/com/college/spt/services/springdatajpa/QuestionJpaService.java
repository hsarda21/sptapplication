package com.college.spt.services.springdatajpa;

import com.college.spt.model.Question;
import com.college.spt.repositories.QuestionRepository;
import com.college.spt.services.QuestionService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class QuestionJpaService implements QuestionService
{
    private final QuestionRepository questionRepository;

    public QuestionJpaService(QuestionRepository questionRepository)
    {
        this.questionRepository = questionRepository;
    }

    @Override
    public Set<Question> findAll() {
        Set<Question> students = new HashSet<>();
        questionRepository.findAll().forEach(students::add);

        return students;
    }

    @Override
    public Question findById(Long aLong) {
        return questionRepository.findById(aLong).orElse(null);
    }

    @Override
    public Question save(Question object) {
        return questionRepository.save(object);
    }

    @Override
    public void delete(Question object) {
        questionRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        questionRepository.deleteById(aLong);
    }
}
