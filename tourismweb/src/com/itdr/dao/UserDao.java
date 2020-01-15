package com.itdr.dao;

import com.itdr.pojo.Users;
import com.itdr.utils.C3P0Util;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;


import java.sql.SQLException;


public class UserDao {

    public Users selectByUsernameAndpassword(String username,String password){

        QueryRunner qr = new QueryRunner(C3P0Util.getCom());
        String sql = "SELECT id,username,password,type,create_time,update_time from bishe_user where username=? and password=?";
        Users query = null;
        try {
            query = qr.query(sql, new BeanHandler<Users>(Users.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return query;

    }
}
