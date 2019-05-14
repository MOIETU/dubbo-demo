package com.deepexi.user.modules.components.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import java.util.Date;

/**
 * 组件表 t_component
 * 
 * @author mjc
 * @date 2019-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_component")
public class ComponentEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** 数据ID */
	private Long id;
		/** 组件名称 */
	private String name;
		/** 组件类型ID */
	private Long typeId;
		/** 版本 */
	private String version;
		/** 状态 */
	private Integer status;
		/** 创建用户 */
	private Long createUser;
		/** 创建日期 */
	private Date createDate;
		/** 更新用户 */
	private Long updateUser;
		/** 更新日期 */
	private Date updateDate;
	    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("typeId", getTypeId())
            .append("version", getVersion())
            .append("status", getStatus())
            .append("createUser", getCreateUser())
            .append("createDate", getCreateDate())
            .append("updateUser", getUpdateUser())
            .append("updateDate", getUpdateDate())
            .toString();
    }
}
