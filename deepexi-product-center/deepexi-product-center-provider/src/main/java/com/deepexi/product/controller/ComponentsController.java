package com.deepexi.product.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.deepexi.component.domain.ComponentEntity;
import com.deepexi.component.service.ComponentBusinessService;
import com.deepexi.util.config.Payload;
import com.deepexi.util.constant.ContentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
    public Payload getComponentList() {
        ComponentEntity componentEntity = componentBusinessService.queryComponentById(1l);
        return new Payload(componentEntity);
    }

    /*@GetMapping("/{id}")
    public Payload getComponentById(@PathVariable("id") Long id) {
        return new Payload(null);
    }

    @PostMapping("/")
    public Payload createComponent(Component component) {
        return new Payload(null);
    }

    @PutMapping("/")
    public Payload updateComponentById(@RequestParam("id") String id, Component component) {
        return new Payload(null);
    }

    @DeleteMapping("/")
    public Payload deleteComponentById(@RequestParam("id") String id) {
        return new Payload(null);
    }*/
}
