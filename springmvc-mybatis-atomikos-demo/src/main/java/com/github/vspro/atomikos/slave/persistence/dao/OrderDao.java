package com.github.vspro.atomikos.slave.persistence.dao;

import com.github.vspro.atomikos.slave.persistence.domain.OrderDo;

public interface OrderDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDo record);

    int insertSelective(OrderDo record);

    OrderDo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDo record);

    int updateByPrimaryKey(OrderDo record);
}