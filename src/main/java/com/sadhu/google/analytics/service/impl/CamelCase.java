package com.sadhu.google.analytics.service.impl;

import com.sadhu.google.analytics.models.User;
import com.sadhu.google.analytics.service.CapsService;

public class CamelCase implements CapsService {
    @Override
    public User capitalize(User user) {
        if(user.getName()!=null) {
//            user.setName(user.getName().charAt(0));
        }
        return user;
    }
}
