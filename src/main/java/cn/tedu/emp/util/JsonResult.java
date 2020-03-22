package cn.tedu.emp.util;

import lombok.Getter;
import lombok.Setter;

/**
 * 用于封装向客户端的响应结果的类
 *
 * @param <T> 向客户端响应的数据的类型
 */
@Setter
@Getter
public class JsonResult<T> {
    private Integer state; // 状态
	private String message; // 错误信息
	private T data; // 数据

}