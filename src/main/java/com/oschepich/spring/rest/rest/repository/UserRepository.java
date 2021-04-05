package com.oschepich.spring.rest.rest.repository;

import com.oschepich.spring.rest.rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
     User findUserByEmail(String email);
  }
