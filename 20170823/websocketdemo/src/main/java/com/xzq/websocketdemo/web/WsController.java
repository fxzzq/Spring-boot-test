package com.xzq.websocketdemo.web;

import com.xzq.websocketdemo.domain.XzqMessage;
import com.xzq.websocketdemo.domain.XzqResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author:xzq
 * @Descripition:
 * @Date: Created in 11:54 2017/8/23
 * @Modified:
 */
@Controller
public class WsController {
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public XzqResponse say(XzqMessage message) throws Exception{

        Thread.sleep(3000);
        return new XzqResponse("Welcome,"+message.getName()+"!");
    }

}
