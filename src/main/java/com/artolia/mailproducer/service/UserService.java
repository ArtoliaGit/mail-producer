package com.artolia.mailproducer.service;

import com.artolia.mailproducer.config.database.ReadOnlyConnection;
import com.artolia.mailproducer.entity.User;
import com.artolia.mailproducer.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Artolia Pendragon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年05月02日 22:06:00
 */
@Service
public class UserService {

    @Resource
    private UserDao userDao;

    @ReadOnlyConnection
    public void selectList() {
        List<User> list = userDao.selectList();
        list.stream().forEach(System.out::println);
    }

    public void save() {
        User user = new User();
        user.setName("xxx");
        userDao.save(user);
    }
}
