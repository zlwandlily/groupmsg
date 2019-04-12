package com.jc.wechat.groupmsg.respdomain;

import lombok.Data;

@Data
public class BaseResp {
    /**
     * 返回编码
     * */
    private String returnCode;
    /**
     * 返回信息
     * */
    private String returnMsg;
}
