package com.hry.web.common.ex;


import com.hry.web.common.result.ResponseCode;
import lombok.Getter;
import org.apache.ibatis.executor.BaseExecutor;

/**
 * 自定义异常
 */

@Getter
public class ServiceException extends BaseException {



    public ServiceException(ResponseCode responseCode) {
        super(responseCode);
    }

}
