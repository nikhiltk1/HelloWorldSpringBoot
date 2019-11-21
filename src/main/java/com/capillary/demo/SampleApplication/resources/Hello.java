package com.capillary.demo.SampleApplication.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class Hello {
    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String sayHello() {
        return "Hello World";
    }

}
