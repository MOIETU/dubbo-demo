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
 * 组件类型表 t_component_type
 * 
 * @author mjc
 * @date 2019-05-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_component_type")
public class ComponentTypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/** 数据ID */
	private Long id;
	/** 类型名称 */
	private String name;
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
			.append("createUser", getCreateUser())
			.append("createDate", getCreateDate())
			.append("updateUser", getUpdateUser())
			.append("updateDate", getUpdateDate())
			.toString();
    }
}
