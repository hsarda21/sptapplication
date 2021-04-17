package com.college.spt.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Entity
public class Question extends BaseEntity
{
    @ManyToOne
    private Category category;
}
