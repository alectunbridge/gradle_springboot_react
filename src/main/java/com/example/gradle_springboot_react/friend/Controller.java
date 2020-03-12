package com.example.gradle_springboot_react.friend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Friend create(@RequestParam final String name) {
        return friendRepository.save(new Friend(name));
    }
}