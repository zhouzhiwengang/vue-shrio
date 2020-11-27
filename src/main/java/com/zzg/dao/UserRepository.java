package com.zzg.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.zzg.entity.User;


/**
 * 
 * @author zzg
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    User findByUserId(Integer userId);
}
