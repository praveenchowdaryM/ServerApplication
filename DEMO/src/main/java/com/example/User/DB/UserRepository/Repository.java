package com.example.User.DB.UserRepository;

import com.example.User.DB.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface Repository extends JpaRepository<User,Integer> {
//@Query("SELECT u FROM User u  where u.username=:username")
  Optional<User> findByUserName(String username);

//  User findByUserNameAndPassword(String username,String password);
}
