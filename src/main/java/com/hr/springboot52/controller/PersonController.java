package com.hr.springboot52.controller;

import com.hr.springboot52.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView("/person/list");
        mv.addObject("personList",personService.findAll());
        return  mv;
    }

    @RequestMapping("/cleanCache")
    public ModelAndView cleanCache(){
        personService.cleanCache();
        ModelAndView mv = new ModelAndView("/person/list");
        return mv;
    }
}
