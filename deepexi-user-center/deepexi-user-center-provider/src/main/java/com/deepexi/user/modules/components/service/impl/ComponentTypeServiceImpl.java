package com.deepexi.user.modules.components.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.deepexi.user.modules.components.mapper.ComponentTypeMapper;
import com.deepexi.user.modules.components.domain.ComponentType;
import com.deepexi.user.modules.components.service.IComponentTypeService;

/**
 * 组件类型 服务层实现
 * 
 * @author mjc
 * @date 2019-05-14
 */
@Service
public class ComponentTypeServiceImpl extends ServiceImpl<ComponentTypeMapper, ComponentType> implements IComponentTypeService {
	
}
