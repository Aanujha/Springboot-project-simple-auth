package com.auth.app.repo;

import com.auth.app.dto.UserDto;
import com.auth.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Long> {

    @Query(value = "SELECT * FROM user WHERE email=?1",nativeQuery = true)
    User checkLogin(String email);
}
