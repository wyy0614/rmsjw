package com.itdr.service;

import com.itdr.common.ResponseCode;
import com.itdr.dao.UserDao;
import com.itdr.pojo.Users;

public class UserServiceImpl implements UserService {
    private UserDao ud = new UserDao();
    @Override
    public ResponseCode<Users> login(String username, String password) {
        //参数非空判断

        //参数非空
        Users users = ud.selectByUsernameAndpassword(username, password);
        //如果返回值空，当前对象不存在，登陆失败
        if(users == null){
            return ResponseCode.todefeated("用户不存在!");
        }
        //成功返回成功数据
        return ResponseCode.toSuccess(users);
    }
}
