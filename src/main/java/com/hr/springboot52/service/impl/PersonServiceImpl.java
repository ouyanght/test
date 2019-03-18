package com.hr.springboot52.service.impl;

import com.hr.springboot52.dao.PersonMapper;
import com.hr.springboot52.entity.Person;
import com.hr.springboot52.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    public List<Person> findAll(){
        Map<String, Object> map = new HashMap<>();
        return personMapper.selectByMap(map);
    }
}
