package com.yiibai.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/get")
    public String printHello(ModelMap model) {
        model.put("message", "Hello Spring MVC Frameworkeee");
        System.out.println("fff");
        return "hello";
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String printHello1(ModelMap model) {
        model.put("message", "Hello Spring MVC");
        return "hello";  
    }

}
