package com.skyline.mobile.ticket.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2019.05.24
 *
 * @author huyang18
 */
@RestController
@RequestMapping("/ticket")
public class TestController {
    @GetMapping("/show")
    public  void test(){
        System.out.println("hello skyline");
    }
}
