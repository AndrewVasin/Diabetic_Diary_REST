package com.vasin.diabetic_diary_rest.repository;

import com.vasin.diabetic_diary_rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
