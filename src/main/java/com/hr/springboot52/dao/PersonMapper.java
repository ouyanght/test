package com.hr.springboot52.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.springboot52.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PersonMapper extends BaseMapper<Person> {

}