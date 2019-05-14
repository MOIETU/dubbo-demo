package com.deepexi.product.domain.eo;

import java.io.Serializable;
import java.util.Date;

/**
 * 组件表 t_component
 * 
 * @author mjc
 * @date 2019-05-14
 */
public class Component implements Serializable {
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

	public Long getTypeId() {
		return typeId;
	}

	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
