package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//为mapper接口创建代理对象


@SpringBootApplication
@MapperScan("com.jt.mapper")
public class Run {
 public static void main(String[] args) {
	SpringApplication.run(Run.class, args);

}
}
