package com.deepexi.product.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.deepexi.component.domain.ComponentEntity;
import com.deepexi.component.service.ComponentBusinessService;
import com.deepexi.util.common.PageData;
import com.deepexi.util.common.Result;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import java.util.List;

@RestController
@Path("/api/v1/components")
@Consumes({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
@Produces({ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8})
public class ComponentsController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference(loadbalance="random",timeout=1000) //dubbo直连
    private ComponentBusinessService componentBusinessService;

    /*@GetMapping("/")
    public Payload getComponentList(@RequestParam("page") Integer page,
                                  @RequestParam("limit") Integer limit,
                                  @RequestParam("name") String name,
                                  @RequestParam("typeId") Long typeId,
                                  @RequestParam("status") Integer status) {
        return new Payload(componentBuzService.queryComponentList());
    }*/
    @GET
    @Path("/test")
    public Payload getComponentList(@QueryParam("page") Integer page,
                                    @QueryParam("limit") Integer limit,
                                    @QueryParam("name") String name,
                                    @QueryParam("typeId") Long typeId,
                                    @QueryParam("status") Integer status) {
        PageData pageData = componentBusinessService.queryComponentPage(page,limit,name,typeId,status);
        return new Payload(pageData);
    }

    /**
     * 新增
     */
    public Payload saveComponent(){
        return new Payload();
    }

    /**
     * 删除
     */
    public Payload deleteComponent(){
        return new Payload();
    }

    /**
     * 批量删除
     */
    public Payload deleteBatchComponent(){
        return new Payload();
    }

    /**
     * 查询
     */
    public Payload queryComponentPage(){
        return new Payload();
    }

    /**
     * 上架下架
     */
    public Payload swapStatus(){
        return new Payload();
    }

    /**
     * 修改
     */
    public Payload updateComponent(){
        return new Payload();
    }

    /**
     * 查询详情
     */
    public Payload queryComponentDetail(){
        return new Payload();
    }
}
