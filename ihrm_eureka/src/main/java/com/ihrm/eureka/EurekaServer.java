package com.ihrm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: zzg
 * @date: 2021/03/05
 **/
@SpringBootApplication
@EnableEurekaServer //开启Eureka服务端配置
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class , args);
    }
}
