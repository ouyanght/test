package com.hr.springboot52.service;

import com.hr.springboot52.entity.Person;

import java.util.List;

public interface PersonService {
    public List<Person> findAll();
    public void cleanCache();
}
