package com.wang.mybatisnew.user.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wly
 * @since 2018-07-05
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户名
     */
    @TableField("user_name")
    private String userName;
    /**
     * 性别，0：男 1：女
     */
    @TableField("user_sex")
    private Integer userSex;
    /**
     * 用户地址
     */
    @TableField("user_address")
    private String userAddress;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", userName=" + userName +
        ", userSex=" + userSex +
        ", userAddress=" + userAddress +
        "}";
    }
}
