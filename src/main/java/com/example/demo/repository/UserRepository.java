package com.example.demo.repository;

import com.example.demo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Transactional(readOnly = true)
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByEmailIgnoreCase(String email);

}
