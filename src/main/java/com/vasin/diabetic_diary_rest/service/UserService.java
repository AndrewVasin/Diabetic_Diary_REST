package com.vasin.diabetic_diary_rest.service;

import com.vasin.diabetic_diary_rest.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<User> getAllUsers(Pageable pageable);
    User getUserById(Long id);
    void saveUser(User user);
}
