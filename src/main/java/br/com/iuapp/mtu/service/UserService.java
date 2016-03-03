package br.com.iuapp.mtu.service;

import br.com.iuapp.mtu.dao.UserDao;
import br.com.iuapp.mtu.model.User;

import java.util.List;

/**
 * Created by elcio on 03/03/16.
 */
public class UserService {

    UserDao userDao;

    public UserService(){
        userDao = new UserDao();
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }


}
