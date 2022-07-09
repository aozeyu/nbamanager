package com.example.nbamanager.utils;

/**
 * @program: nbamanager
 * @description: 33
 * @packagename: com.example.nbamanager.utils
 * @author: 姚泽宇
 * @date: 2022-07-09 10:10
 **/
public enum ResultCode {
    SUCCESS(200),//成功
    FAIL(400),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    NOT_FOUND(404),//接口不存在
    INTERNAL_SERVER_ERROR(500);//服务器内部错误

    public int code;

    ResultCode(int code) {
        this.code = code;
    }

}
