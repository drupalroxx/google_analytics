package com.sadhu.google.analytics.controller;

import com.sadhu.google.analytics.models.Address;
import com.sadhu.google.analytics.models.User;
import com.sadhu.google.analytics.service.SmallService;
import com.sadhu.google.analytics.service.impl.AllCapsService;
import com.sadhu.google.analytics.service.CapsService;
import com.sadhu.google.analytics.service.impl.AllSmallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private SmallService ss;

    @Autowired
    private CapsService cs;

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
    public Address[] welcomeUser(@RequestBody User user){
        Address[] addresses = user.getAddress();
        Address addresses1 = addresses[0];

        return user.getAddress();
        //return "welcome "+user.getName()+" age "+user.getAge()+" sex "+user.getSex()+" and "+user.getAddress().getAddressLine1();

    }

    @RequestMapping(value = "/userhobbies", method = RequestMethod.POST)
    public String[] helloUser(@RequestBody User user){
        return user.getHobbies();
    }

    @RequestMapping(value = "/userdetails", method = RequestMethod.GET)
    public User getDetails(){
        String [] hobbies = new String[]{"football","swimming"};
      //  User user = new User(hobbies, "Hero hera lal", 22, "male");
        User user = new User();
        user.setHobbies(hobbies);
        user.setName("hero hera lal");
        user.setAge(32);
        user.setSex("male");

        return user;
    }


    @RequestMapping(value = "/address", method = RequestMethod.POST)
    public String address(@RequestBody Address address){
        return "My address is "+address.getAddressLine1()+" and street is "+address.getAddressLine2()+" " +
                       "and city is "+address.getAddressLine3()+" and type is "+address.getType();
    }

    @RequestMapping(value = "/allcaps", method = RequestMethod.POST)
    public User captilise(@RequestBody User user){

        CapsService cs = new AllCapsService();
        User capuser = cs.capitalize(user);
        return capuser;
    }

    @RequestMapping(value = "/allsmall", method = RequestMethod.POST)
    public User smalls(@RequestBody User user){
        SmallService ss = new AllSmallService();
        User smalluser = ss.smallSize(user);
        return smalluser;

    }

    @RequestMapping(value = "reverse", method = RequestMethod.POST)
    public User reverseCase(@RequestBody User user, @RequestParam("spec") String spec){
        if(spec.equals("lower")){
            User smalluser = ss.smallSize(user);
            return smalluser;
        }
        else{
            User capuser = cs.capitalize(user);
            return capuser;
        }
    }
}


