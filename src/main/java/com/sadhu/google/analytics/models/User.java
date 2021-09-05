package com.sadhu.google.analytics.models;

public class User {


    private String[] hobbies;


    private Address[] address;
    private String name;
    private int age;
    private String sex;

//    public User(String [] hobbies, String name, int age, String sex){
//        this.hobbies = hobbies;
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public Address[] getAddress() {
        return address;
    }

    public void setAddress(Address[] address) {
        this.address = address;
    }

/*

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
*/


}
