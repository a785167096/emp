package cn.tedu.emp.service.ex;

/**
 * @ClassName InsertException
 * @Description TODO
 * @Author hp
 * @Date 2020/3/22 18:37
 * @Version 1.0
 */
public class InsertException extends ServiceException {
    private static final long serialVersionUID = -6140001954712965515L;

    public InsertException() {
    }

    public InsertException(String message) {
        super(message);
    }

    public InsertException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsertException(Throwable cause) {
        super(cause);
    }

    public InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}