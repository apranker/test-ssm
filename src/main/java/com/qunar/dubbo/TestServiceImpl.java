package com.qunar.dubbo;

import org.slf4j.Logger;

/**
 * Created by dayong.gao on 2016/12/7.
 */

public class TestServiceImpl implements TestService {
    Logger logger = org.slf4j.LoggerFactory.getLogger(LuncherProvider.class);
    public void sayHello() {
        logger.info("hello world ");
    }

    public String returnHello() {
        return "hello world!";
    }

    public MsgInfo returnMsgInfo(MsgInfo info) {
        info.getMsgs().add("接收完毕");
        return info;
    }
}
