package com.auth.app.service.impl;

import com.auth.app.dto.UserDto;
import com.auth.app.entity.User;
import com.auth.app.repo.UserRepo;
import com.auth.app.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void createUser(UserDto userDto) {
        User dtoToUser = modelMapper.map(userDto,User.class);
        userRepo.save(dtoToUser);
    }

    @Override
    public List<User> getUserList() {
        return userRepo.findAll();
    }

    @Override
    public UserDto loginCheck(UserDto userDto) {
        return modelMapper.map(userRepo.checkLogin(userDto.getEmail()),UserDto.class);
    }


}
