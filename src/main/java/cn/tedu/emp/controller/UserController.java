package cn.tedu.emp.controller;

import cn.tedu.emp.entity.User;
import cn.tedu.emp.service.IUserService;
import cn.tedu.emp.service.ex.InsertException;
import cn.tedu.emp.service.ex.UsernameDuplicateException;
import cn.tedu.emp.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private IUserService userService;
	
	// http://localhost:8093/users/reg?username=Jerry&password=123456
	@RequestMapping("reg")
	public JsonResult<Void> reg(User user) {
		JsonResult<Void> jsonResult = new JsonResult<Void>();
		userService.reg(user);
		jsonResult.setState(1);
		return jsonResult;
	}
	
	@ExceptionHandler
	public JsonResult<Void> handleException(Throwable ex) {
		JsonResult<Void> jsonResult = new JsonResult<Void>();
		
		if (ex instanceof UsernameDuplicateException) {
			jsonResult.setState(2);
			jsonResult.setMessage("注册失败！尝试注册的用户名已经被占用！");
		} else if (ex instanceof InsertException) {
			jsonResult.setState(3);
			jsonResult.setMessage("注册失败！执行插入数据时出现未知错误！请联系系统管理员！");
		}
		
		return jsonResult;
	}

}







