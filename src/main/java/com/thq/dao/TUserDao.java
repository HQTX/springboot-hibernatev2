package com.thq.dao;

import com.thq.entry.Tuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * 继承分页查询的接口
 *JpaSpecificationExecutor
 */
@Repository
public interface TUserDao extends JpaRepository<Tuser,Integer>,JpaSpecificationExecutor<Tuser> {
    Tuser findByUserName(String userName);
}
