package com.hr.springboot52.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.hr.springboot52.dao.PersonMapper;
import com.hr.springboot52.entity.Person;
import com.hr.springboot52.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    @Cacheable(value = "151",key = "'PersonServiceImpl.findAll'")
    public List<Person> findAll(){
        Map<String, Object> map = new HashMap<>();
        return personMapper.selectByMap(map);
    }

    //清除缓存
    @CacheEvict(value = "151",key = "'PersonServiceImpl.findAll'")
    public void cleanCache(){
        System.out.println("清除缓存");
    }
}
