/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: Leader
 * Author:   CentreS
 * Date:     2019/8/20 15:12
 * Description: 测试entity
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yjjk.health.entity;

import lombok.Data;
import lombok.Value;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @Description: 测试entity
 * @author CentreS
 * @create 2019/8/20
 */
@Data
@Accessors(chain = true)
public class Leader {

    /**
     * 姓名
     */
    @NotEmpty(message = "姓名不能为空")
    private String name;

    /**
     * 生日
     */
    @Pattern(regexp = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$", message = "出生日期格式不正确")
    private String birthday;

    /**
     * 年龄
     */
    @Min(value = 0)
    private Integer age;

    //省略gettes and  setters

}