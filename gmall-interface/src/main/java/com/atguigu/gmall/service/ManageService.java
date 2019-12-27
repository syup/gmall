package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {

    /**
     * 获取一级分类列表集合
     * @return
     */
    List<BaseCatalog1> getCatalog1();

    /**
     * 根据一级分类获取二级分类列表集合
     * @param
     * @return
     */
    List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);

    /**
     * 根据二级分类id获取三级分类列表集合
     * @param
     * @return
     */
    List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);

    /**
     * 根据三级分类id获取平台属性集合
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);

    /**
     * 保存属性信息
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 根据attrId获取属性值列表
     */
    List<BaseAttrValue> getAttrValueList(String attrId);

    /**
     * 获取属性值信息
     * @return
     */
    BaseAttrInfo getAttrInfo(String attrId);
}
