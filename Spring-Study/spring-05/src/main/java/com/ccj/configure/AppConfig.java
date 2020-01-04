package com.ccj.configure;
import com.ccj.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //代表这是一个配置类，相当于beans.xml
@ComponentScan("com.ccj")
public class AppConfig {

    //相当于xml中的一个bean标签
    @Bean
    public User getUser(){
        return new User();
    }

}
