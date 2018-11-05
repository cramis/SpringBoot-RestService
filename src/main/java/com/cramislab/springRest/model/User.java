package com.cramislab.springRest.model;


import java.util.Date;

public class User {

    private Integer id;

    private Date birth;

    private String name;

    public  User(){

    }

    public User(Integer id, String name, Date birth) {
        super();
        this.id = id;
        this.name = name;
        this.birth = birth;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", birth=" + birth +
                ", name='" + name + '\'' +
                '}';
    }
}
