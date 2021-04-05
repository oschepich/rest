package com.oschepich.spring.rest.rest.service;

import com.oschepich.spring.rest.rest.model.Role;
import com.oschepich.spring.rest.rest.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService<T>{
     List<T> getAllUser();

    void saveUser(User user);

    T show(Long id);

     User deleteUser(Long id);

    Role getRole(String name);

    public List<Role> getListRole();

    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;

    User getUserByEmail(String email);
}
