package com.plugin.example.plugin2.rest;

import com.plugin.example.plugin2.config.Plugin2Config;
import com.plugin.example.plugin2.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zhangzhuo
 * @Version: 1.0
 * @Create Date Time: 2019-05-30 16:04
 * @Update Date Time:
 * @see
 */
@RestController
@RequestMapping("/plugin2")
public class HelloPlugin1 {

    @Autowired
    private HelloService helloService;

    @Autowired
    private Plugin2Config plugin2Config;

    @GetMapping
    public String sya(){
        return "hello plugin2 example";
    }

    @GetMapping("config")
    public String getConfig(){
        return plugin2Config.toString();
    }

    @GetMapping("update")
    public String update(){
        return "this is new update plugin2 , ok , this is success";
    }


    @GetMapping("serviceConfig")
    public String getServiceConfig(){
        return helloService.getPlugin2Config().toString();
    }

    @GetMapping("service")
    public String getService(){
        return helloService.sayService2();
    }


}
