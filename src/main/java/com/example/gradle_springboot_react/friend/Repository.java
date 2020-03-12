package com.example.gradle_springboot_react.friend;

import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<Friend, Long> {
}