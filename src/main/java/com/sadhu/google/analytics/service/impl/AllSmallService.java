package com.sadhu.google.analytics.service.impl;

import com.sadhu.google.analytics.models.Address;
import com.sadhu.google.analytics.models.User;
import com.sadhu.google.analytics.service.CapsService;
import com.sadhu.google.analytics.service.SmallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;
@Service
public class AllSmallService implements SmallService {

    public User smallSize(User user){
        user.setName(user.getName().toLowerCase(Locale.ROOT));
        user.setSex(user.getSex().toLowerCase(Locale.ROOT));
        String[] hobbies = user.getHobbies();
        for (int i = 0; i < hobbies.length; i++) {
            hobbies[i] = hobbies[i].toLowerCase(Locale.ROOT);
        }
        Address[] addresses = user.getAddress();
        for(int count = 0; count < addresses.length; count++){
           addresses[count].setAddressLine1(addresses[count].getAddressLine1().toLowerCase(Locale.ROOT));
           addresses[count].setAddressLine2(addresses[count].getAddressLine2().toLowerCase(Locale.ROOT));
           addresses[count].setAddressLine3(addresses[count].getAddressLine3().toLowerCase(Locale.ROOT));
           addresses[count].setType(addresses[count].getType().toLowerCase(Locale.ROOT));
        }
        return user;
    }
}
