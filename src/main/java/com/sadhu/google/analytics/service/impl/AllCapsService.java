package com.sadhu.google.analytics.service.impl;

import com.sadhu.google.analytics.models.Address;
import com.sadhu.google.analytics.models.User;
import com.sadhu.google.analytics.service.CapsService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Locale;

public class AllCapsService implements CapsService {

    @Override
    public User capitalize(User user) {

        /**
         * Take the user object and convert each field of it to upper case.
         */
        user.setName(user.getName().toUpperCase(Locale.ROOT));
        user.setSex(user.getSex().toUpperCase(Locale.ROOT));
        String[] caphobbies = user.getHobbies();

        if (caphobbies != null){
            for (int i=0; i<caphobbies.length; i++) {
                caphobbies[i] = caphobbies[i].toUpperCase(Locale.ROOT);
            }
        }


        Address[]  addresses = user.getAddress();

        if(addresses!= null) {

            for (Address address : addresses) {
                address.setAddressLine1(address.getAddressLine1().toUpperCase(Locale.ROOT));
                address.setAddressLine2(address.getAddressLine2().toUpperCase(Locale.ROOT));
                address.setAddressLine3(address.getAddressLine3().toUpperCase(Locale.ROOT));
                address.setType(address.getType().toUpperCase(Locale.ROOT));

            }
        }
        return user;
    }

}
