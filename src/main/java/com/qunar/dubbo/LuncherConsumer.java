package com.qunar.dubbo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by dayong.gao on 2016/12/7.
 */

public class LuncherConsumer  {
    public static void main(String[] args) throws InterruptedException{
        LuncherConsumer luncher=new LuncherConsumer();
        luncher.start();
    }


    void start(){
        String configLocation="spring/dubbo-consumer.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(configLocation);
        TestService ds=(TestService) context.getBean("testService");
        String[] names=context.getBeanDefinitionNames();
        System.out.print("Beans:");
        for(String string : names) {
            System.out.print(string);
            System.out.print(",");
        }
        System.out.println();

        MsgInfo info =new MsgInfo();
        info.setId(1);
        info.setName("ruisheh");
        List<String> msgs=new ArrayList<String>();
        msgs.add("I");
        msgs.add("am");
        msgs.add("test");
        info.setMsgs(msgs);


        System.out.println(ds.returnMsgInfo(info).getMsgs());
    }
}