package com.epam.customspringbootstarter;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnClass(MyBean.class)
@Configuration
public class MyStarterAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MyBean myBean(){
        String greetingMessage = "Hello, world!";
        return new MyBean(greetingMessage);
    }
}
