package cn.tedu.emp.service.impl;

import cn.tedu.emp.entity.User;
import cn.tedu.emp.mapper.UserMapper;
import cn.tedu.emp.service.IUserService;
import cn.tedu.emp.service.ex.InsertException;
import cn.tedu.emp.service.ex.UsernameDuplicateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void reg(User user) {
        // 输出日志
        System.err.println("UserServiceImp.reg()");
        System.err.println("\t注册数据：" + user);
        // 从参数user中获取用户名
        String username = user.getUsername();
        // 调用userMapper的findByUsername()方法执行查询
        User result = userMapper.findByUsername(username);
        // 判断查询结果是否不为null
        if (result != null) {
            // 是：查询结果不为null，表示用户名已经被占用，则抛出UsernameDuplicateException
            throw new UsernameDuplicateException();
        }
        user.setPassword("123456");
        // 调用userMapper的insert()方法执行注册，并获取返回的受影响行数
        System.err.println("\t插入数据：" + user);
        Integer rows = userMapper.insert(user);
        // 判断受影响的行数是否不为1
        if (rows != 1) {
            // 是：抛出InsertException
            throw new InsertException();
        }
    }
}