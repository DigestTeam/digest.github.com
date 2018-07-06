package com.summer.digest.controller;

import com.summer.digest.dao.AdminDao;
import com.summer.digest.entity.Admin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    AdminDao adminDao;


    @RequestMapping(value = "/findAll" , method = RequestMethod.GET)
    public Iterable<Admin> getAdmins(){
        Iterable<Admin> userList = adminDao.findAll();
        return userList;
    }
}
