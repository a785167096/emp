package cn.tedu.emp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName User
 * @Description TODO
 * @Author hp
 * @Date 2020/3/22 18:24
 * @Version 1.0
 */
@Setter
@Getter
@ToString

public class User implements Serializable {

    private static final long serialVersionUID = 7852691844001709099L;

    private Integer id;
    private String username;
    private String password;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}