/**
 * Copyright (C), 2019, 寻央大人留书
 * FileName: CommonResult
 * Author:   CentreS
 * Date:     2019/8/20 14:44
 * Description: 返回对象封装
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.yjjk.health.configer;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author CentreS
 * @Description: 返回对象封装
 * @create 2019/8/20
 */
@Data
@Accessors(chain = true)
public class CommonResult<T> implements Serializable {

    /**
     * serialVersionUID:.
     */
    private static final long serialVersionUID = -7268040542410707954L;

    /**
     * 是否成功
     */
    private boolean success = false;

    /**
     * 返回信息
     */
    private String message;

    /**
     * 装在数据
     */
    private T data;

    /**
     * 错误代码
     */
    private String code;

    /**
     * 默认构造器
     */
    public CommonResult() {

    }

    /**
     * @param success 是否成功
     * @param message 返回的消息
     */
    public CommonResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    /**
     * @param success 是否成功
     */
    public CommonResult(boolean success) {
        this.success = success;
    }

    /**
     * @param code    error code
     * @param message success or error messages
     */
    public CommonResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @param success 是否成功
     * @param message 消息
     * @param data    数据
     */
    public CommonResult(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
    //省略get set
}
