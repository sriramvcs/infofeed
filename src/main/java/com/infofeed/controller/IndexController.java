package com.infofeed.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sriramvcs on 2017-01-07.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String getIndex() {
        return "Hello World!";
    }
    
    @RequestMapping("/greetings") 
    public String getGreetings() {
    	return "Hello from Karthik!";    	
    }
}
