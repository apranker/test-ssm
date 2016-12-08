package com.qunar.controller;


import com.qunar.service.WorkService;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * Created by dayong.gao on 2016/12/7.
 */
@Controller
@RequestMapping(value = "test")
public class TestController {
    Logger logger = org.slf4j.LoggerFactory.getLogger(TestController.class);
    WorkService wser= new WorkService();

    @RequestMapping(value = "start.do")
    @ResponseBody
    public String start(@RequestParam Integer id) {
        logger.info("请求到达, id={}", id);
        return wser.query(id).getWorktype();
    }
    @RequestMapping(value = "jump.do")
    public String jump () {
        return "redirect:/jumpto.jsp";
    }




}
