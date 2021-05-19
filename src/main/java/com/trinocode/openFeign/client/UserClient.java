package com.trinocode.openFeign.client;

import com.trinocode.openFeign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="https://jsonplaceholder.typicode.com/",name="User-Client")
public interface UserClient {

    @GetMapping("/users")
    public List<User> getUsers();
}
