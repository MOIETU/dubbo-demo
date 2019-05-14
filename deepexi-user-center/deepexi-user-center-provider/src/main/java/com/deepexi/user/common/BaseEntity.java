package com.deepexi.user.common;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 公共实体类
 *
 * @author mjc 2019-5-14
 */
@Data
public class BaseEntity implements Serializable {
    private Long id;

    /**
     * 创建用户
     */
    private Long createUser;
    /**
     * 创建日期
     */
    private Date createDate;
    /**
     * 更新用户
     */
    private Long updateUser;
    /**
     * 更新日期
     */
    private Date updateDate;
}
