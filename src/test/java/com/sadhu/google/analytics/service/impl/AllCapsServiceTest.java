package com.sadhu.google.analytics.service.impl;

import com.sadhu.google.analytics.models.Address;
import com.sadhu.google.analytics.models.User;
import com.sadhu.google.analytics.service.CapsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;

class AllCapsServiceTest {

    @Test
    void capitalize() {
        User user = new User();
        user.setName("sadhana");
        user.setSex("F");
        user.setAge(30);
//        user.setHobbies(new String[]{"coding"});
        Address [] addresses = new Address[1];

//        user.setAddress(new Address[]);

        CapsService cs = new AllCapsService();
        User response = cs.capitalize(user);
        assertEquals("SADHANA",response.getName());

    }


    @Test
    void testCamleCaseSerivceForName(){
        CapsService camelCase = new CamelCase();
        User user = new User();
        User response = camelCase.capitalize(user);
        assertEquals("Sadhana", response.getName());
    }
    @Test
    void testCamleCaseSerivceForNameIfNUll(){
        CapsService camelCase = new CamelCase();
        User user = new User();
        User response = camelCase.capitalize(user);
        assertEquals(null, response.getName());
    }
}