package com.demo.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * @author zhaodd
 * @create 2019-09-02-11:48
 */
@Controller
public class HelloController {

    /**
     *
     * @author zhaodd
     * @date 2023/2/5 15:13:02
     * @return java.lang.String
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

        ArrayList<String> s = new ArrayList<>();

        return "hello1";
    }

}
