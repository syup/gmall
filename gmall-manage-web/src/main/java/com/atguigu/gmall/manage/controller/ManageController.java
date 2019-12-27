package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.*;
import com.atguigu.gmall.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class ManageController {

    @Reference
    private ManageService manageService;

    /**
     * 获取一级分类列表
     * @return
     */
    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){

        List<BaseCatalog1> catalog1List = manageService.getCatalog1();

        return catalog1List;
    }

    /**
     * 二级分类列表
     * @param baseCatalog2
     * @return
     */
    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2){

        List<BaseCatalog2> baseCatalog2List = manageService.getCatalog2(baseCatalog2);
        return baseCatalog2List;

    }

    /**
     * 三级分类列表
     */
    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3){

        List<BaseCatalog3> catalog3List = manageService.getCatalog3(baseCatalog3);

        return catalog3List;
    }

    /**
     * 属性列表
     */
    @RequestMapping("attrInfoList")
    public List<BaseAttrInfo> getAttrInfoLists(BaseAttrInfo baseAttrInfo){

       return manageService.getAttrInfoList(baseAttrInfo);
    }

    /**
     * 保存属性信息
     */
    @RequestMapping("saveAttrInfo")
    public void saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo){

        manageService.saveAttrInfo(baseAttrInfo);
    }

    /**
     * 获取属性值的信息
     */
    @RequestMapping("getAttrValueList")
    public List<BaseAttrValue> getAttrValueList(String attrId){

        //考虑业务
        //1.先获取baseIAttrInfo
        BaseAttrInfo baseAttrInfo=manageService.getAttrInfo(attrId);

        return baseAttrInfo.getAttrValueList();

    }
}
