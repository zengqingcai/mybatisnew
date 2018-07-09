-- 订单表
CREATE TABLE `order_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `order_name` varchar(50) DEFAULT NULL COMMENT '订单名',
  `order_address` varchar(255) DEFAULT NULL COMMENT '订单地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单表';

-- 用户表
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `user_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `user_sex` tinyint(4) DEFAULT NULL COMMENT '性别，0：男 1：女',
  `user_address` varchar(255) DEFAULT NULL COMMENT '用户地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='用户表';

