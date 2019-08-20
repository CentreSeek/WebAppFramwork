/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: TestController
 * Author:   CentreS
 * Date:     2019/8/20 13:44
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yjjk.health.controller;

import com.alibaba.fastjson.JSON;
import com.sun.org.apache.regexp.internal.RE;
import com.yjjk.health.configer.CommonResult;
import com.yjjk.health.entity.Leader;
import com.yjjk.health.entity.TestEntity;
import com.yjjk.health.utility.ResultUtil;
import jdk.management.resource.internal.TotalResourceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @author CentreS
 * @Description: 测试
 * @create 2019/8/20
 */
@RestController
@RequestMapping(value = "test")
public class TestController extends BaseController{
    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/ip", method = RequestMethod.GET)
    public TestEntity returnIP(HttpServletRequest request, HttpServletResponse response) {
        /********************** 参数初始化 **********************/
        TestEntity testEntity = new TestEntity();
        testEntity.setIp(request.getRemoteAddr());
        testEntity.setName("fdsafds");

        return testEntity;
    }



    /**
     * validate验证测试
     *
     * @param leader
     * @param bindingResult
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public CommonResult testSimpleValidate(@Valid Leader leader, BindingResult bindingResult) {
        LOGGER.debug("ReqParams:{}", JSON.toJSONString(leader));
        CommonResult result = validParams(bindingResult);
        if (!result.isSuccess()) {
            return result;
        }
        return ResultUtil.returnSuccess("");
    }
}
