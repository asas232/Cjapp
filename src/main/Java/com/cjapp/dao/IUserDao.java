package com.cjapp.dao;

import com.cjapp.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cj on 2016/11/10.
 */
public interface IUserDao {
    void save(User user);
    public User findById(int id);
    public List<User> findAll();

}
