package pl.mpolak.m06_type_of_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Mariola on 2015-02-24.
 */
public class Runner {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("m06/beans.xml");

        SequenceGenerator sequenceGenerator =
                context.getBean("sequenceGenerator", SequenceGenerator.class);

        String sequence = sequenceGenerator.getSequence();
        System.out.println(sequence);
    }
}
