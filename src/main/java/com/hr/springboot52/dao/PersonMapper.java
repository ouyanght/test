package com.hr.springboot52.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.springboot52.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper extends BaseMapper<Person> {

}