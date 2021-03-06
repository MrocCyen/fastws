package com.flow.stack.fastws.starter.websocket.event;

import com.flow.stack.fastws.starter.websocket.WebSocket;
import org.springframework.context.ApplicationEvent;

/**
 * @author qingsp
 * @version 0.0.1
 * @date 2020-08-06
 */
public class WebSocketCloseEvent extends ApplicationEvent {

    public WebSocketCloseEvent(WebSocket webSocket){
        super(webSocket);
    }

}
