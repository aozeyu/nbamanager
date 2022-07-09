package com.example.nbamanager.utils;

import lombok.Data;

/**
 * @program: nbamanager
 * @description: 接口结果返回类封装
 * @packagename: com.example.nbamanager.utils
 * @author: 姚泽宇
 * @date: 2022-07-09 10:06
 **/
@Data
public class Result {
    private int code;

    private String message = "success";

    private Object data;


    // 后面result生成器需要以下方法
    public Result setCode(ResultCode resultCode){
        this.code = resultCode.code;
        return this;
    }


    public Result setMessage(String message) {
        this.message = message;
        return this;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }
}
