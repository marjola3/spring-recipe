package pl.mpolak.m04_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mariola on 2015-02-23.
 */
public class Runner {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("m04/beans.xml");

        Product aaa = context.getBean("aaa1", Battery.class);
        Product cdrw = context.getBean("cdrw1", Disc.class);


        System.out.println(aaa);
        System.out.println(cdrw);
    }
}
