package com.wang.mybatisnew.user.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author wly
 * @since 2018-07-05
 */
@TableName("order_info")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 订单名
     */
    @TableField("order_name")
    private String orderName;
    /**
     * 订单地址
     */
    @TableField("order_address")
    private String orderAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
        ", id=" + id +
        ", orderName=" + orderName +
        ", orderAddress=" + orderAddress +
        "}";
    }
}
