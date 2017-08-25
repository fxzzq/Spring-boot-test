package com.xzq.websocketdemo.domain;

/**
 * @author:xzq
 * @Descripition:
 * @Date: Created in 11:48 2017/8/23
 * @Modified:
 */
public class XzqResponse {
    private  String responseMessage;

    public XzqResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
