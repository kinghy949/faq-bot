package com.kinghy.faqbot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kinghy.faqbot.entity.Test;
import com.kinghy.faqbot.service.TestService;
import com.kinghy.faqbot.mapper.TestMapper;
import org.springframework.stereotype.Service;

/**
* @author pc
* @description 针对表【test】的数据库操作Service实现
* @createDate 2025-07-24 13:44:19
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test>
    implements TestService{

}




