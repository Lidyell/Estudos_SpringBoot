package com.example.treino_springboot.service;

import com.example.treino_springboot.database.Model.UserModel;
import com.example.treino_springboot.database.Repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Getter
@Setter
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserModel Create_User(UserModel userModel){
        return userRepository.save(userModel);
    };

    public List<UserModel> List_Users(){
        return userRepository.findAll();

    };

    public void Delete_User(Long id){
        userRepository.deleteById(id);

    };

    public UserModel Update_User(Long id, UserModel NewData){
        UserModel user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        user.setNome(NewData.getNome());
        user.setEmail(NewData.getEmail());
        user.setPassword(NewData.getPassword());

        return userRepository.save(user);
    }
        
    



}
