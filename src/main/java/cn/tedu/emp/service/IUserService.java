package cn.tedu.emp.service;

import cn.tedu.emp.entity.User;

public interface IUserService {
    /**
     * 用户注册
     * @param user  用户数据
     */
    void reg(User user);
}
