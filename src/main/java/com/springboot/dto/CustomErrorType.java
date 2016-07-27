package com.springboot.dto;

import java.io.Serializable;

/**
 * Created by linyang on 2016/5/31.
 */
public class CustomErrorType implements Serializable {

    private int code;
    private String msg;

    public CustomErrorType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
