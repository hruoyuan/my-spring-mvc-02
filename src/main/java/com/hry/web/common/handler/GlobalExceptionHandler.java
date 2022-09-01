package com.hry.web.common.handler;


import com.hry.web.common.ex.MemberException;
import com.hry.web.common.ex.ServiceException;
import com.hry.web.common.result.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 处理全局异常
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseResult<Object> handlerException(Exception ex) {
        ex.printStackTrace();
        return ResponseResult.error();
    }



    @ExceptionHandler(ServiceException.class)
    public ResponseResult<Object> handlerException(ServiceException ex) {
        ex.printStackTrace();
        return ResponseResult.error(ex.getResponseCode());

    }





}
