package com.baz.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.baz.model.User;


@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<User>  createuser(User user){
        return new ResponseEntity<User>( userRepository.save(user),HttpStatus.OK);
    }

    public ResponseEntity<User> getUserById(Long id){
        Optional<User> optionalUser = userRepository.findById(id);
        return new ResponseEntity<User>( optionalUser.get(),HttpStatus.OK);
    }
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<List<User>>( userRepository.findAll(),HttpStatus.OK);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
