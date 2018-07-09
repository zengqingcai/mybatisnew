package com.wang.mybatisnew.user.service.impl;

import com.wang.mybatisnew.user.domain.OrderInfo;
import com.wang.mybatisnew.user.mapper.OrderInfoDao;
import com.wang.mybatisnew.user.service.MPOrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wly
 * @since 2018-07-09
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoDao, OrderInfo> implements MPOrderInfoService {

}
