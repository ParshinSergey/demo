package com.example.demo;

import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

    private final UserRepository userRepository;

    public DemoApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = userRepository.findById(1L).orElse(new User());
        System.out.println(user);
    }
}