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

    public static void main(String[] args) {
        User user = new User();
        user.setSex("Male");
        user.setName("Sanjay");
        user.setAge(34);



        String[] hobbies1 = new String[2];
        hobbies1[0] = "cricket";
        hobbies1[1] = "football";
        user.setHobbies(hobbies1);
        String[] hob = user.getHobbies();


        System.out.println(user.getName());
        System.out.println(user.getSex());
        System.out.println(user.getAge());
        for (int i = 0; i < hob.length; i++) {
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(hob[i]);
        }
        System.out.println("***********************");

        User user1 = new User();
        user1.setName("sadhana");
        user1.setAge(35);
        user1.setSex("female");

        String[] hobbies = new String[3];
        hobbies[0] = "swimming";
        hobbies[1] = "badminton";
        hobbies[2] = "football";

        user1.setHobbies(hobbies);
        String[] abc = user1.getHobbies();

        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }

        Address[] addresses = new Address[2];

        Address address1 = new Address();
        address1.setAddressLine1("flat-304");
        address1.setAddressLine2("dakota building");
        address1.setAddressLine3("deals gateway");
        address1.setType("home");

        Address address2 = new Address();
        address2.setAddressLine1("no-21");
        address2.setAddressLine2("lane-2");
        address2.setAddressLine3("dd complex");
        address2.setType("office");


        addresses[0] = address1;
        addresses[1] = address2;

        user1.setAddress(addresses);
        Address[] addObj = user1.getAddress();

        for (Address x: addObj) {
            System.out.println("ADD LINE 1 :"+x.getAddressLine1()+" \nADD LINE 2 : "+x.getAddressLine2()+"\nADD LINE 3 : "+x.getAddressLine3()+"\nADD TYPE : "+x.getType());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<");
        }




        




        /*Address[] addresses = user.getAddress();
        for(int i = 0; i< addresses.length; i++){
            Address address = addresses[i];
            System.out.println(address);
        }*/



        //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //String[] cars1 = cars.toUppercase(Locale.ROOT);


        System.out.println("========================================================");
        //System.out.println(addr1);

        CapsService cs = new AllCapsService();
        cs.captilise(user1);
    }

}
