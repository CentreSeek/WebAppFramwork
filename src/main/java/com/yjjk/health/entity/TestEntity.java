/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: TestEntity
 * Author:   CentreS
 * Date:     2019/8/20 13:45
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yjjk.health.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Bean;

/**
 * @Description: 测试
 * @author CentreS
 * @create 2019/8/20
 */
@Data
@Accessors(chain = true)
public class TestEntity {

    private String ip;
    private String name;
}
