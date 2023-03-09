package com.jh.spring_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringStudyApplication{
    public static void main(String[] args) throws Exception{
        SpringApplication.run(SpringStudyApplication.class,args);
    }
    @GetMapping
    public String mainName(){
        return "index";
    }
}