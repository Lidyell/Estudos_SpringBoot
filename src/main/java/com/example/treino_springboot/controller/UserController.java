package com.example.treino_springboot.controller;

import com.example.treino_springboot.database.Model.UserModel;
import com.example.treino_springboot.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping

    public List<UserModel> List_users(){

        return userService.List_Users();
    };
    @PostMapping
    public UserModel Create_user(@RequestBody UserModel userModel){
        return userService.Create_User(userModel);
    };

    @DeleteMapping("/{id}")
    public String Delete_user(@PathVariable Long id){
        userService.Delete_User(id);
        return "Usuário Deletado com sucesso";
    };

    @PutMapping("/{id}")

    public String Update_user(@PathVariable Long id, @RequestBody UserModel Newdata){
        userService.Update_User(id, Newdata);
        return "Usuário atualizado com sucesso";
    };
}
