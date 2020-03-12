package com.example.gradle_springboot_react.friend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/friends")
public class Controller {

    private Repository friendRepository;

    @Autowired
    public Controller(Repository friendRepository) {
        this.friendRepository = friendRepository;
    }

    @GetMapping
    public Iterable<Friend> list() {
        return friendRepository.findAll();
    }
}