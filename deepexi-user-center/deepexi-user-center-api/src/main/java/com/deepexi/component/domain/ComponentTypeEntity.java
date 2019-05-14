package com.deepexi.component.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 组件类型表 t_component_type
 * 
 * @author mjc
 * @date 2019-05-14
 */
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
