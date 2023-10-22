package com.auth.app.service;

import com.auth.app.dto.UserDto;
import com.auth.app.entity.User;

import java.util.List;

public interface UserService {

    void createUser(UserDto userDto);
    List<User> getUserList();

    UserDto loginCheck(UserDto userDto);
}
