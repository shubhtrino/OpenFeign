package com.trinocode.openFeign.controller;

import com.trinocode.openFeign.client.UserClient;
import com.trinocode.openFeign.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableFeignClients(basePackages = {"com.trinocode.openFeign.client"})
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/getAllUsers")
    public List<User> getUsers(){
        return userClient.getUsers();
    }
}
