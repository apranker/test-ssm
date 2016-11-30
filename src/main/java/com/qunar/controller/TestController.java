package com.qunar.controller;


import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 *
 */
@Controller
@RequestMapping(value = "test")
public class TestController {
    Logger logger = org.slf4j.LoggerFactory.getLogger(TestController.class);


    @RequestMapping(value = "start.json")
    @ResponseBody
    public String start(@RequestParam String queryStr) {
        logger.info("请求到达, queryStr={}", queryStr);
        System.out.print(queryStr);
        return queryStr;
    }




}
