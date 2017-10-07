package com.gucheng.testeventbus;

/**
 * Created by lenovo on 2017/10/2.
 */

public class MessageEvent {
    private   String mMsg = "";
    public String getMsg() {
        return mMsg;
    }
    public MessageEvent(String msg) {
        mMsg = msg;
    }


}
