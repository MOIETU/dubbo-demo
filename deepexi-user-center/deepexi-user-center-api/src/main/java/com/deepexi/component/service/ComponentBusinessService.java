package com.deepexi.component.service;

import com.deepexi.component.domain.ComponentEntity;
import com.deepexi.util.common.PageData;
import com.deepexi.util.common.Result;
import com.deepexi.util.config.Payload;

import java.util.List;

/**
 * 组件业务 暴露服务
 *
 * @author mjc
 * @date 2019-05-14
 */
public interface ComponentBusinessService {

    /**
     * 分页查询组件
     * @param page
     * @param limit
     * @param componentName 组件名称
     * @param typeId 类型Id
     * @param status 组件当前状态
     * @return
     */
    public PageData queryComponentPage(Integer page, Integer limit, String componentName, Long typeId, Integer status);

    /**
     * 根据ID查询组件
     * @param id
     * @return
     */
    public ComponentEntity queryComponentById(Long id);

    /**
     * 保存组件
     * @param componentEntity
     * @return
     */
    public Boolean saveComponent(ComponentEntity componentEntity);

    /**
     * 更新组件
     * @param componentEntity
     * @return
     */
    public Boolean updateComponent(ComponentEntity componentEntity);

    /**
     * 根据Id删除组件
     * @param id
     * @return
     */
    public Boolean deleteComponentById(Long id);

    /**
     * 根据Ids删除组件
     * @param ids
     * @return
     */
    public Boolean deleteComponentByIds(List<Long> ids);

    /**
     * 切换组件状态
     * @param componentId
     * @param status
     * @return
     */
    public Boolean swapStatus(Long componentId, Integer status);

    /**
     * 查询所有组件类型
     * @return
     */
    public List<ComponentEntity> queryComponentList();
}
