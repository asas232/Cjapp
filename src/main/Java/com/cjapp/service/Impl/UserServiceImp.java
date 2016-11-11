package com.cjapp.service.Impl;

import com.cjapp.dao.IUserDao;
import com.cjapp.entity.User;
import com.cjapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cj on 2016/11/10.
 */
@Service("userServiceImp")
public class UserServiceImp implements IUserService {
    @Resource
    private IUserDao userDao;
    public User getUserById(int userId) {
        return null;
    }
}
