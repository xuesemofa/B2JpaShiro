package org.ld.B2JpaShiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

//开启默认缓存
@EnableCaching
//springboot 整合启动注解
@SpringBootApplication
public class B2JpaShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(B2JpaShiroApplication.class, args);
    }
}
