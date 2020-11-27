package com.zzg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zzg.entity.Role;

/**
 * 
 * @author zzg
 *
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
