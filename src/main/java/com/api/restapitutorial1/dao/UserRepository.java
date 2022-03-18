package com.api.restapitutorial1.dao;

import com.api.restapitutorial1.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    @Query("SELECT u FROM User u WHERE u.email=?1")
    User loadUserByEmail(String email);
}
