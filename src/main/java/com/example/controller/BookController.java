package com.example.controller;

import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping( value = "/book")
public class BookController {

    @Autowired
    private BookService service;

    @RequestMapping(value = "/service")
    public ModelAndView bookName(ModelAndView mv){
         mv.addObject(" bookName", service.largestAreaBookName());
         mv.setViewName("success");
        return mv;
    }
}
