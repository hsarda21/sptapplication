package com.college.spt.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person extends BaseEntity
{
    private String firstName;
    private String lastName;
    private Integer age;
    private String phone;
    private String username;
    private String password;
    private String email;
    private String gender;
    private AccessLevel accesslevel;

    @ManyToMany(mappedBy = "people")
    private Set<Category> categories = new HashSet<>();
}
