package com.jc.wechat.groupmsg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jc.wechat.groupmsg.mapper")
public class GroupmsgApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroupmsgApplication.class, args);
    }

}
