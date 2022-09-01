package com.hry.web.common.ex;

import com.hry.web.common.result.ResponseCode;
import lombok.Getter;


@Getter
public class BaseException extends RuntimeException {

    private  final ResponseCode responseCode;

    public BaseException(ResponseCode responseCode) {
        super(responseCode.getMsg());
        this.responseCode = responseCode;
    }
}
