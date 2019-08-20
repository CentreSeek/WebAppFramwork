/**
 * Copyright (C), 2019, 义金(杭州)健康科技有限公司
 * FileName: BaseController
 * Author:   CentreS
 * Date:     2019-06-18 15:59
 * Description: BaseController
 * History:
 * <author>          <time>          <version>          <desc>
 * CentreS         2019/06/18          1.0.0
 */
package com.yjjk.health.controller;

import com.yjjk.health.configer.CommonResult;
import com.yjjk.health.configer.ErrorCodeEnum;
import com.yjjk.health.utility.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * @author CentreS
 * @Description: BaseController
 * @create 2019-06-18
 */
@CrossOrigin
public class BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);

    /**
     * validate params
     *
     * @param bindingResult
     * @return
     */
    protected CommonResult validParams(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            return processBindingError(fieldError);
        }
        return ResultUtil.returnSuccess("");
    }

    /**
     * 根据spring binding 错误信息自定义返回错误码和错误信息
     *
     * @param fieldError
     * @return
     */
    private CommonResult processBindingError(FieldError fieldError) {
        String code = fieldError.getCode();
        LOGGER.debug("validator error code: {}", code);
        switch (code) {
            case "NotEmpty":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_EMPTY.getCode(), fieldError.getDefaultMessage());
            case "NotBlank":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_EMPTY.getCode(), fieldError.getDefaultMessage());
            case "NotNull":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_EMPTY.getCode(), fieldError.getDefaultMessage());
            case "Pattern":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Min":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Max":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Length":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Range":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Email":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "DecimalMin":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "DecimalMax":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Size":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Digits":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Past":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            case "Future":
                return ResultUtil.returnError(ErrorCodeEnum.PARAM_ERROR.getCode(), fieldError.getDefaultMessage());
            default:
                return ResultUtil.returnError(ErrorCodeEnum.UNKNOWN_ERROR);
        }
    }
}
