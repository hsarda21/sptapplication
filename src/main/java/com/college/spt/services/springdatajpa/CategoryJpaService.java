package com.college.spt.services.springdatajpa;

import com.college.spt.model.Category;
import com.college.spt.repositories.CategoryRepository;
import com.college.spt.services.CategoryService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class CategoryJpaService implements CategoryService
{
    private final CategoryRepository categoryRepository;

    public CategoryJpaService(CategoryRepository categoryRepository)
    {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Set<Category> findAll() {
        Set<Category> students = new HashSet<>();
        categoryRepository.findAll().forEach(students::add);

        return students;
    }

    @Override
    public Category findById(Long aLong) {
        return categoryRepository.findById(aLong).orElse(null);
    }

    @Override
    public Category save(Category object) {
        return categoryRepository.save(object);
    }

    @Override
    public void delete(Category object) {
        categoryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        categoryRepository.deleteById(aLong);
    }
}
