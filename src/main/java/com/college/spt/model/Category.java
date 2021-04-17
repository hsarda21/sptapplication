package com.college.spt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category extends BaseEntity
{
    private String categoryName;

    @ManyToMany(mappedBy = "categories")
    private Set<Person> people = new HashSet<>();

    @OneToMany(mappedBy = "category")
    private Set<Question> questions = new HashSet<>();
}
