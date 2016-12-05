package com.xugc.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by xuguocheng on 2016/12/5.
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

}
