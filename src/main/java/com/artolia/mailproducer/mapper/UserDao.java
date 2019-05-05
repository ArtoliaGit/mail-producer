package com.artolia.mailproducer.mapper;

import com.artolia.mailproducer.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Artolia Pendragon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年05月02日 21:59:00
 */
@Mapper
public interface UserDao {

    List<User> selectList();

    int save(User user);
}
