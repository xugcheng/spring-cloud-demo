package com.xugc.demo.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *  分布式配置中心,提供分布式系统的外部化配置支持.为各个应用的所有环境提供了一个中心化的外部配置.
 *  提供git存储配置的方式,和本地话文件系统存储配置的方式.
 *
 * Created by xuguocheng on 2016/12/29.
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

}
