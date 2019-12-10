package com.sram.controller;

import com.sram.common.CodeMenu;
import com.sram.common.ResponseResulu;
import com.sram.dao.UserDao;
import com.sram.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/findAll")
    public ResponseResulu<User> findAll(){
        List<User> userList = userDao.findAll();
        ResponseResulu<User> rr = new ResponseResulu<>(true, CodeMenu.SUCCESS);
        rr.setUser(new User());
        rr.setUserList(userList);
        return rr;
    }
    @GetMapping("/findById")
    public ResponseResulu<User> findUserById(int id){
        Optional<User> optional = userDao.findById(id);
        User user = optional.get();
        ResponseResulu<User> rr= new ResponseResulu<>(true, CodeMenu.SUCCESS);

        rr.setUser(user);
        rr.setUserList(new ArrayList<>());
        return rr;

    }

    @PostMapping("/updateUser")
    public ResponseResulu<User> findUserById(@RequestBody  User user){

        userDao.save(user);
        ResponseResulu<User> rr= new ResponseResulu<>(true, CodeMenu.SUCCESS);
        rr.setUser(new User());
        rr.setUserList(new ArrayList<>());
        return rr;
    }

}
