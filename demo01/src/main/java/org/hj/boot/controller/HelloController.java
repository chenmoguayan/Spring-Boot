package org.hj.boot.controller;

import org.hj.boot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author hj
 * @data 2023/2/22 16:04
 */
@RestController
@RequestMapping
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @Autowired
    Person person;

    @ResponseBody
    @RequestMapping("/person1")
    public Person person1() {
        return person;
    }

    @GetMapping("/user")
    public String getUser() {
        return "Get User";
    }

    @PostMapping("/user")
    public String addUser() {
        return "Post User";
    }

    @PutMapping("/user")
    public String updateUser() {
        return "Update User";
    }

    @DeleteMapping("/user/{hello}")
    public String deleteUser(@PathVariable String hello) {
        return hello + " Delete User !";
    }
}
