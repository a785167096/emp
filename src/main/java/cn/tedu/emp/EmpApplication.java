package cn.tedu.emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.tedu.emp.mapper")
public class EmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpApplication.class, args);
    }
}
