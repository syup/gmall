package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    //@Autowired(required = false)
    @Reference
    private UserService userService;

    @RequestMapping("trade")
    public List<UserAddress> trade(String userId){

        return userService.getUserAddressByUserId(userId);
    }
}
