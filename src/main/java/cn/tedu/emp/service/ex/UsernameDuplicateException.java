package cn.tedu.emp.service.ex;

/**
 * @ClassName UsernameException
 * @Description TODO
 * @Author hp
 * @Date 2020/3/22 18:37
 * @Version 1.0
 */
public class UsernameDuplicateException extends ServiceException {
    private static final long serialVersionUID = -3887539991450755866L;

    public UsernameDuplicateException() {
    }

    public UsernameDuplicateException(String message) {
        super(message);
    }

    public UsernameDuplicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public UsernameDuplicateException(Throwable cause) {
        super(cause);
    }

    public UsernameDuplicateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}