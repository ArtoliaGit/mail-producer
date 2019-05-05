package com.artolia.mailproducer.config.database;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Artolia Pendragon
 * @version 1.0.0
 * @Description TODO
 * @createTime 2019年05月03日 12:31:00
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
