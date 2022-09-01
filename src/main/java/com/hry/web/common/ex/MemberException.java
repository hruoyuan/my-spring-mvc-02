package com.hry.web.common.ex;


import com.hry.web.common.result.ResponseCode;
import lombok.Getter;

/**
 * 自定义异常
 */

@Getter
public class MemberException extends BaseException{


    public MemberException(ResponseCode responseCode) {
        super(responseCode);

    }

}
