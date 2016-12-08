package com.qunar.dubbo;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by dayong.gao on 2016/12/7.
 */

public class LuncherConsumer  {

    Logger logger = org.slf4j.LoggerFactory.getLogger(LuncherProvider.class);
    public static void main(String[] args) throws InterruptedException{
        LuncherConsumer luncher=new LuncherConsumer();
        luncher.start();
    }


    void start(){
        String configLocation="spring/dubbo-consumer.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(configLocation);
        TestService ds=(TestService) context.getBean("testService");
        String[] names=context.getBeanDefinitionNames();
        for(String str : names) {
            logger.info("Beans:{}", str);
        }

        MsgInfo info =new MsgInfo();
        info.setId(1);
        info.setName("Test");
        List<String> msgs=new ArrayList<String>();
        msgs.add("I");
        msgs.add("am");
        msgs.add("test");
        info.setMsgs(msgs);

        logger.info("接收结果：{}",ds.returnMsgInfo(info).getMsgs());
    }
}