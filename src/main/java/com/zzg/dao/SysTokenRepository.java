package com.zzg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.zzg.entity.SysToken;

/**
 * 
 * @author zzg
 *
 */
public interface SysTokenRepository extends JpaRepository<SysToken, Integer> {
    /**
     * 通过token查找
     * @param token
     * @return
     */
    SysToken findByToken(String token);

    /**
     * 通过userID查找
     * @param userId
     * @return
     */
    SysToken findByUserId(Integer userId);
}
