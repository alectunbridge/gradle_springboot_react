package com.example.gradle_springboot_react.friend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/friends")
public class Controller {
    @GetMapping
    public List<Friend> list() {
        return Arrays.asList(new Friend("Andrew"));
    }
}