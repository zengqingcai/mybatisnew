package com.wang.mybatisnew.user.controller;


import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.wang.mybatisnew.user.domain.ProductInfo;
import com.wang.mybatisnew.user.service.MPProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wly
 * @since 2018-07-11
 */
@RestController
@RequestMapping("/productInfo")
public class ProductInfoController {
    @Autowired
    private MPProductInfoService productInfoService;

    @RequestMapping("/test")
    public String test() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId(1L);
        productInfo.setProductName("花生");
        productInfoService.insert(productInfo);

        ProductInfo productInfo2 = new ProductInfo();
        productInfo2.setProductId(2L);
        productInfo2.setProductName("饮料");
        productInfoService.insert(productInfo2);

        ProductInfo productInfo3 = new ProductInfo();
        productInfo3.setProductId(3L);
        productInfo3.setProductName("矿泉水");
        productInfoService.insert(productInfo3);

        productInfo.setProductName("啤酒");
        /**
         * UpdateWrapper是更新参数
         */
        productInfoService.update(productInfo, new UpdateWrapper<ProductInfo>().eq("product_id", 1L));
        return "done";
    }
}

