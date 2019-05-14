package com.deepexi.user.modules.components.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.deepexi.user.common.PageParam;
import com.deepexi.component.domain.ComponentEntity;
import com.deepexi.component.service.ComponentBusinessService;
import com.deepexi.user.modules.components.service.IComponentService;
import com.deepexi.util.common.PageData;
import com.deepexi.util.common.Result;
import com.deepexi.util.config.Payload;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 组件业务模块 服务实现
 *
 * @author mjc
 */
@Component
@Service
public class ComponentBusinessServiceImpl implements ComponentBusinessService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IComponentService componentService;

    /**
     * 分页查询组件
     * @param page
     * @param limit
     * @param componentName 组件名称
     * @param typeId 类型Id
     * @param status 组件当前状态
     * @return
     */
    @Override
    public PageData queryComponentPage(Integer page, Integer limit, String componentName, Long typeId, Integer status) {
        Map params = new HashMap();
        params.put("page",page);
        params.put("limit",limit);
        /*params.put("name",componentName);
        params.put("type_id",typeId);
        params.put("status",status);*/
        IPage<ComponentEntity> resultPage = componentService.page(
                new PageParam<ComponentEntity>(params),
                new QueryWrapper<ComponentEntity>()
                        .like(StringUtils.isNotBlank(componentName),"name",componentName)
                        .eq(typeId!=null,"type_id",typeId)
                        .eq(status!=null,"status",status)
        );
        PageData<ComponentEntity> pageData = new PageData<>(resultPage.getRecords(),resultPage.getTotal());
        return pageData;
    }

    /**
     * 根据ID查询组件
     * @param id
     * @return
     */
    @Override
    public ComponentEntity queryComponentById(Long id) {
        return componentService.getById(id);
    }

    /**
     * 保存组件
     * @param componentEntity
     * @return
     */
    @Override
    public Boolean saveComponent(ComponentEntity componentEntity) {
        return componentService.save(componentEntity);
    }

    /**
     * 更新组件
     * @param componentEntity
     * @return
     */
    @Override
    public Boolean updateComponent(ComponentEntity componentEntity){
        return componentService.updateById(componentEntity);
    }

    /**
     * 根据Id删除组件
     * @param id
     * @return
     */
    @Override
    public Boolean deleteComponentById(Long id) {
        return componentService.removeById(id);
    }

    /**
     * 根据Ids删除组件
     * @param ids
     * @return
     */
    @Override
    public Boolean deleteComponentByIds(List<Long> ids){
        return componentService.removeByIds(ids);
    }

    /**
     * 切换组件状态
     * @param componentId
     * @param status
     * @return
     */
    @Override
    public Boolean swapStatus(Long componentId,Integer status){
        ComponentEntity componentEntity = componentService.getById(componentId);
        componentEntity.setStatus(status);
        return componentService.updateById(componentEntity);
    }

    /**
     * 查询所有组件类型
     * @return
     */
    @Override
    public List<ComponentEntity> queryComponentList(){
        return componentService.list(new QueryWrapper<ComponentEntity>());
    }
}
