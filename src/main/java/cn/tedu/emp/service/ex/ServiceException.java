package cn.tedu.emp.service.ex;

/**
 * @ClassName ServiceException
 * @Description TODO
 * @Author hp
 * @Date 2020/3/22 18:34
 * @Version 1.0
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -4315426848038081690L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}