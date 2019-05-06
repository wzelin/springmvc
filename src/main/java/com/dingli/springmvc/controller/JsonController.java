package com.dingli.springmvc.controller;

import com.dingli.springmvc.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/test.action")
    @ResponseBody
    public Person test() {
        return new Person("张三",18,new Date());
    }

}
