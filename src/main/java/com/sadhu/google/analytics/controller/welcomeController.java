package com.sadhu.google.analytics.controller;

import com.sadhu.google.analytics.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(@RequestParam String name) {
        return "welcome to "+name+" google analytics";
    }
    @RequestMapping(value = "/namaste", method = RequestMethod.GET)
    public String namaste(@RequestParam("name") String name, @RequestParam("age") int age){
        return "namaste "+name+" and "+age+" apka swagat hai sadhana ke google analytics me";
    }
    @RequestMapping(value = "/greetings", method = RequestMethod.GET)
    public String greetings(@RequestParam("name") String name, @RequestParam("age") int age, @RequestParam("sex") String sex)
    { return "hello "+name+" withe age "+age+" and the sex "+sex+" greetings from google analytics";}

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String welcomeUser(@RequestBody User user){
        return "welcome "+user.getName()+" with the age "+user.getAge()+" and sex "+user.getSex();
    }



}


