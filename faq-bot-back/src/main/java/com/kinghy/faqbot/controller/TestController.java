package com.kinghy.faqbot.controller;

import com.kinghy.faqbot.entity.Test;
import com.kinghy.faqbot.mapper.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("test")
@Slf4j
public class TestController {
    @Autowired
    private TestMapper testMapper;
    @PostMapping("insert")
    public Integer insert() {
        Test test = new Test();
        test.setName("kinghy");
        test.setCreatedAt(new Date());
        Integer insert = testMapper.insert(test);
        log.info("insert");
        return insert;
    }
}
