package com.deepexi.product.controller;

import com.deepexi.product.domain.eo.Component;
import com.deepexi.util.config.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComponentsController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public Payload getComponentList(@RequestParam("page") Integer page,
                                  @RequestParam("limit") Integer limit,
                                  @RequestParam("name") String name,
                                  @RequestParam("typeId") Long typeId,
                                  @RequestParam("status") Integer status) {
        return new Payload(null);
    }

    @GetMapping("/{id}")
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
    }
}
