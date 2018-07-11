package com.wang.mybatisnew.user.service.impl;

import com.wang.mybatisnew.user.domain.ProductInfo;
import com.wang.mybatisnew.user.mapper.ProductInfoDao;
import com.wang.mybatisnew.user.service.MPProductInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wly
 * @since 2018-07-11
 */
@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoDao, ProductInfo> implements MPProductInfoService {

}
