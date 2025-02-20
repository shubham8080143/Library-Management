package com.library.Repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.Role;
import com.library.model.RoleType;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleType name);
}

