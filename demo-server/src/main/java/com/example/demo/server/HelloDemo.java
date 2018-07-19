package com.example.demo.server;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.core.MediaType;

@RestSchema(schemaId = "helloServer")
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON)
public class HelloDemo {

    @GetMapping(path = "/hello")
    public String sayHello() {
        return "Hello Guest";
    }
    @GetMapping(path = "/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return a + b;
    }
}

