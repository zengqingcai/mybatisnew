package com.wang.mybatisnew.user.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author wly
 * @since 2018-07-11
 */
@TableName("product_info")
public class ProductInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品ID
     */
    @TableField("product_id")
    private Long productId;
    /**
     * 商品名称
     */
    @TableField("product_name")
    private String productName;
    /**
     * 是否是自营：0.自营 1.三方
     */
    @TableField("is_self")
    private Boolean isSelf;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Boolean getSelf() {
        return isSelf;
    }

    public void setSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    @Override
    public String toString() {
        return "ProductInfo{" +
        ", id=" + id +
        ", productId=" + productId +
        ", productName=" + productName +
        ", isSelf=" + isSelf +
        "}";
    }
}
