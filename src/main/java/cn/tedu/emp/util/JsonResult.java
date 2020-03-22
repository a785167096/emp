package cn.tedu.emp.util;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName JsonResult
 * @Description TODO
 * @Author hp
 * @Date 2020/3/22 18:54
 * @Version 1.0
 */
@Setter
@Getter
public class JsonResult<T> {
    private Integer state;
    private String message;
    private T data;
}