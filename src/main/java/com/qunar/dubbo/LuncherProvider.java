package com.qunar.dubbo;

import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dayong.gao on 2016/12/7.
 */
public class LuncherProvider {
    Logger logger = org.slf4j.LoggerFactory.getLogger(LuncherProvider.class);
    public static void main(String[] args) throws InterruptedException{
        LuncherProvider luncher=new LuncherProvider();
        luncher.start();
        Thread.sleep(1000*60*10);
    }

    void start(){
        String configLocation="spring/dubbo-provider.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(configLocation);
        String[] names=context.getBeanDefinitionNames();
        for(String str : names)
            logger.info("Beans:{}",str);

    }
}
