package com.qunar.service;


import com.qunar.entity.Work;
import com.qunar.mapper.WorkMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 *
 */
@Service
public class PaperService {
    private static final Logger logger = LoggerFactory.getLogger(PaperService.class);
    @Resource
    private WorkMapper WorkMapper;

    public Work query(int workId) {
        logger.info("userid={}", workId);
        Work w1 =new Work(1,"1234");
        return w1;
    }
}
