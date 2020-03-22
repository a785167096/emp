package cn.tedu.emp.mapper;
import	java.lang.reflect.Member;

import cn.tedu.emp.entity.User;
/**
 * 处理用户数据的持久层接口
 */
public interface UserMapper {
    Integer insert (User user);

    User findByUsername(String username);

}