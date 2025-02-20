package com.library.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}

