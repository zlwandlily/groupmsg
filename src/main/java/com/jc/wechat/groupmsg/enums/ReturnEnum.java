package com.jc.wechat.groupmsg.enums;

import lombok.Getter;

@Getter
public enum  ReturnEnum {
    ERROR("error","请求失败"),
    EXCEPTION("error","请求异常"),
    SUCCESS("success","成功");

    private String code;

    private String codeName;

    ReturnEnum(String code, String codeName){
        this.code = code;
        this.codeName = codeName;
    }

}
