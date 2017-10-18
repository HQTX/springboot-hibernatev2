package com.thq.dao;

import com.thq.entry.Tuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserDao extends JpaRepository<Tuser,Integer>,JpaSpecificationExecutor<Tuser> {
    /**
     *   Jpa里面的方法
     *   查询全部数据
     * List<T> findAll();

     List<T> findAll(Sort var1);

     List<T> findAll(Iterable<ID> var1);

     <S extends T> List<S> save(Iterable<S> var1);

     void flush();

     <S extends T> S saveAndFlush(S var1);

     void deleteInBatch(Iterable<T> var1);

     void deleteAllInBatch();

     T getOne(ID var1);

     <S extends T> List<S> findAll(Example<S> var1);

     <S extends T> List<S> findAll(Example<S> var1, Sort var2);
     * @param userName
     * @return
     */

    Tuser findByUserName(String userName);



}
