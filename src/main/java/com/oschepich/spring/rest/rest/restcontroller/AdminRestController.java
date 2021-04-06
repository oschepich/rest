package com.oschepich.spring.rest.rest.restcontroller;

import com.oschepich.spring.rest.rest.model.Role;
import com.oschepich.spring.rest.rest.model.User;
import com.oschepich.spring.rest.rest.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminRestController {

    private final UserService userService;

    public AdminRestController(UserService userService) {
        this.userService = userService;
    }

    //вывожу всех пользователей
    @GetMapping("/list")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

    @GetMapping("/roles")
    public ResponseEntity<List<Role>> getAllRoles() {
        List<Role> allRole = userService.getListRole();
        return ResponseEntity.ok(allRole);
    }

    //создаю нового пользователя
    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok().build();
    }

    //вывод одного юсера
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserToEdit(@PathVariable Long id) {
        User user = (User) userService.show(id);
        return ResponseEntity.ok(user);
    }

    //редактирую пользователя
    @PutMapping("/edit/{id}")
    public ResponseEntity<User> editUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.ok().build();
    }

    //удаляю пользователя
    @PostMapping("/delete")
    public ResponseEntity<User> deleteUser(@RequestBody User user) {
        userService.deleteUser(user.getId());
        return ResponseEntity.ok().build();
    }

}
