package com.hry.web.common.result;


import lombok.Getter;

@Getter
public enum ResponseCode {

    /**
     * 成功
     */
    SUCCESS(20000,"success"),
    /**
     * 系统异常
     */
    SYS_ERROR(40004,"error"),
    /**
     * 账号错误的信息
     */
    MEMBER_PASSWORD_ERROR(400005, "username or  password error"),
    /**
     *
     */
    MEMBER_NO_EXIST_ERROR(400006, "member  account  no   exist"),
    /**
     * === 文件上传
     */
    FILE_UPLOAD_ERROR(400101, "file upload error");


    private final String msg;
    private final int ststus;

    ResponseCode(int ststus,String msg) {
        this.msg = msg;
        this.ststus = ststus;
    }
}
