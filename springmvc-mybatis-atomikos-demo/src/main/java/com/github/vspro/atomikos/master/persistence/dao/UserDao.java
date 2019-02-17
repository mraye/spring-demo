package com.github.vspro.atomikos.master.persistence.dao;

import com.github.vspro.atomikos.master.persistence.domain.UserDo;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDo record);

    int insertSelective(UserDo record);

    UserDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDo record);

    int updateByPrimaryKey(UserDo record);
}