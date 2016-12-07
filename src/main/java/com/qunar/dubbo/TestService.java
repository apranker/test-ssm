package com.qunar.dubbo;

/**
 * Created by dayong.gao on 2016/12/7.
 */
public interface TestService {
    public void sayHello();

    public String returnHello();

    public MsgInfo returnMsgInfo(MsgInfo info);
}
