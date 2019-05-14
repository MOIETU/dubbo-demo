package com.deepexi.user.modules.components.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.deepexi.user.modules.components.mapper.ComponentMapper;
import com.deepexi.user.modules.components.domain.ComponentEntity;
import com.deepexi.user.modules.components.service.IComponentService;

/**
 * 组件 服务层实现
 * 
 * @author mjc
 * @date 2019-05-14
 */
@Service
public class ComponentServiceImpl extends ServiceImpl<ComponentMapper, ComponentEntity> implements IComponentService {
	
}
