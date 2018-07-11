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

-- 商品表，测试布尔类型
CREATE TABLE `product_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `product_id` bigint(20) DEFAULT NULL COMMENT '商品ID',
  `product_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `is_self` tinyint(1) DEFAULT '0' COMMENT '是否是自营：0.自营 1.三方',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;