package com.oschepich.spring.rest.rest.repository;


import com.oschepich.spring.rest.rest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String role);

}
