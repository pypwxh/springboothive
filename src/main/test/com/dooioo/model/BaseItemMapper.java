package com.dooioo.model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Simple to Introduction
 *
 * @Author: hp
 * @Date: 2016/11/10 15:10
 * @Description: jdbcTemplate mapper匹配类
 * @Version: v1.0
 */
public class BaseItemMapper implements RowMapper<BaseItem> {

    public BaseItem mapRow(ResultSet resultSet, int i) throws SQLException {
        BaseItem baseItem = new BaseItem();
        baseItem.setUserId(resultSet.getString(1));
        baseItem.setPropertyId(resultSet.getString("propertyid"));
        return baseItem;
    }
}
