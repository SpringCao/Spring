package com.ccj.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class User {

    @Value("cjc") //相当于bean中的property属性
    public String name;
}
