/**
 * FileName: TestController
 * Author:   lijiaze
 * Date:     2018/4/23 10:14
 * Description: TestController
 */
package com.td.spec.test.factorcalculatetest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈TestController〉
 *
 * @author lijiaze
 * @create 2018/4/23
 * @since 1.3.0
 */
@Api(value = "test")
@Slf4j
@RestController
@RequestMapping(value = "/calculate")
public class TestController {

  @ApiOperation(value = "计算评价因子", notes = "根据指定taskId来运行")
  @ApiImplicitParam(name = "taskId", value = "回测任务ID", required = true, dataType = "字符串", paramType = "字符串")
  @RequestMapping(value = "/appointTask", method = RequestMethod.POST)
  public String clacAppointinst(@ApiParam("任务id") String taskId) {

    return "success";
  }
}