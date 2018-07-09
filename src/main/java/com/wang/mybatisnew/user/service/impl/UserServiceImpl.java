package com.wang.mybatisnew.user.service.impl;

import com.wang.mybatisnew.user.domain.User;
import com.wang.mybatisnew.user.mapper.UserDao;
import com.wang.mybatisnew.user.service.MPUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wly
 * @since 2018-07-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements MPUserService {

}
