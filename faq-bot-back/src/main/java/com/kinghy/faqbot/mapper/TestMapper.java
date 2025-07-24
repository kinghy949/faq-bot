package com.kinghy.faqbot.mapper;

import com.kinghy.faqbot.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author pc
* @description 针对表【test】的数据库操作Mapper
* @createDate 2025-07-24 13:44:19
* @Entity com.kinghy.faqbot.entity.Test
*/
@Mapper
public interface TestMapper extends BaseMapper<Test> {

}




