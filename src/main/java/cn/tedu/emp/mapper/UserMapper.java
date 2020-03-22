package cn.tedu.emp.mapper;
import	java.lang.reflect.Member;

import cn.tedu.emp.entity.User;
/**
 * @ClassName UserMapper
 * @Description TODO
 * @Author hp
 * @Date 2020/3/22 18:26
 * @Version 1.0
 */

public interface UserMapper {
    Integer insert (User user);

    User findByUsername(String username);

}