package com.sadhu.google.analytics.service.impl;

import com.sadhu.google.analytics.models.Address;
import com.sadhu.google.analytics.models.User;
import com.sadhu.google.analytics.service.CapsService;

import java.util.Locale;

public class AllCapsService implements CapsService {

    @Override
    public User captilise(User user) {

        /**
         * Take the user object and convert each field of it to upper case.
         */
        user.setName(user.getName().toUpperCase(Locale.ROOT));
        user.setSex(user.getSex().toUpperCase(Locale.ROOT));
        String[] caphobbies = user.getHobbies();
        for (int i=0; i<caphobbies.length; i++) {
            caphobbies[i] = caphobbies[i].toUpperCase(Locale.ROOT);
        }

        Address[]  addresses1 = user.getAddress();

        for(int i=0; i<addresses1.length; i++){


            addresses1[i].setAddressLine1(addresses1[i].getAddressLine1().toUpperCase(Locale.ROOT));
            addresses1[i].setAddressLine2(addresses1[i].getAddressLine2().toUpperCase(Locale.ROOT));
            addresses1[i].setAddressLine3(addresses1[i].getAddressLine3().toUpperCase(Locale.ROOT));
            addresses1[i].setType(addresses1[i].getType().toUpperCase(Locale.ROOT));


        }
        return user;
    }

}
