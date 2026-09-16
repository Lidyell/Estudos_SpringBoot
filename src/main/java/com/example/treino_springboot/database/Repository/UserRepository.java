package com.example.treino_springboot.database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.treino_springboot.database.Model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

}
