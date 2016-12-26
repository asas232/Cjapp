package com.cjapp.entity;

/**
 * Created by cj on 2016/11/10.
 */
public class User {
    private String userid;
    private String username;
    private String age;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public User() {
    }

    public User(String userid, String username, String age) {
        this.userid = userid;
        this.username = username;
        this.age = age;
    }

}
