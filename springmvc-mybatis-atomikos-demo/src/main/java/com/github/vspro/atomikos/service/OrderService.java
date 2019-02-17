package com.github.vspro.atomikos.service;


import com.github.vspro.atomikos.master.persistence.dao.UserDao;
import com.github.vspro.atomikos.master.persistence.domain.UserDo;
import com.github.vspro.atomikos.slave.persistence.dao.OrderDao;
import com.github.vspro.atomikos.slave.persistence.domain.OrderDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "orderService")
public class OrderService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private OrderDao orderDao;

    @Transactional
    public void placeTheOrder(){
        UserDo userDo = new UserDo();
        userDo.setMobile("1897657782");
        userDo.setUserName("测试");
        userDao.insert(userDo);

        OrderDo orderDo = new OrderDo();
        orderDo.setName("北京烤鸭");
        orderDo.setPrice(100);
        orderDao.insert(orderDo);

        int a = 100/0;
    }



}
