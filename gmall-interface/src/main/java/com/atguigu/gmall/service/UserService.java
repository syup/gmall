package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

/**
 * 业务层接口
 */
public interface UserService {

    /**
     * 查询所有用户信息
     * @return
     */
    List<UserInfo> findAll();

    /**
     *根据用户id获取地址信息
     */
    List<UserAddress> getUserAddressByUserId(String userId);
}
