package com.qunar.dubbo;

/**
 * Created by dayong.gao on 2016/12/7.
 */

public class TestServiceImpl implements TestService {
    public void sayHello() {
        System.out.println("hello world!");
    }

    public String returnHello() {
        return "hello world!";
    }

    public MsgInfo returnMsgInfo(MsgInfo info) {
        info.getMsgs().add("处理完毕");
        return info;
    }
}
