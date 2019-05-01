package com.boot.controller;

import com.boot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mycloud
 * @description: ff
 * @author: lch
 * @create: 2019-04-30 01:14
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String sayHello(String name){
        return helloService.hiService(name);
    }
}
