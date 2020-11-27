package com.zzg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zzg.entity.Permission;

/**
 * 
 * @author zzg
 *
 */
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
