package com.xugc.api.gateway;

import com.xugc.api.gateway.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by xuguocheng on 2017/1/5.
 */
@EnableZuulProxy
@SpringCloudApplication
public class Application {

    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }


    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
