package pl.mpolak.m07_factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.mpolak.m07_factoryBean.product.Battery;
import pl.mpolak.m07_factoryBean.product.Disc;

/**
 * Created by Mariola on 2015-02-24.
 */
public class Runner {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("m07/beans.xml");

        Battery battery = context.getBean("aaa", Battery.class);
        Disc disc = context.getBean("cdrw", Disc.class);

        System.out.println(battery);
        System.out.println(disc);
    }
}
